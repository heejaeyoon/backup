package model.member;
//특이점 SELECT_ONE에서 LIKE문을 사용했다는 점입니다. 

//보통 회원테이블에서 위 SQL문은 로그인 확인을 위함인데 (해서 보통은 where절 - and 사용)
//회원가입시 ID중복 확인도 하기 때문에  → 두가지 조건을 충족하기 위해서 LIKE문을 사용해보았습니다.
//(실무에서는 Front에서 중복체크 한다고 합니다!! jQuery+ajax로 활용)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.commit.DBCP;

public class MemberDAO {

	// SQL문
	String sql_INSERT = "INSERT INTO MEMBER (MNUM, USERID, USERPW, USERNAME) VALUES "
			+ "((SELECT NVL(MAX(MNUM), 0)+1 FROM MEMBER), ?, ?, ?)";
	String sql_SELECT_ALL = "SELECT * FROM MEMBER";
	String sql_SELECT_ONE = "SELECT * FROM MEMBER WHERE USERID LIKE ? AND USERPW LIKE ?";
	String sql_UPDATE = "UPDATE MEMBER SET USERPW=?, USERNAME=? WHERE MNUM=?";
	String sql_DELETE = "DELETE FROM MEMBER WHERE MNUM=?";

	PreparedStatement pstmt;
	ResultSet rs;
	Connection conn;
//비즈니스 메서드 실행구간
	// [회원가입]

	public boolean signUp(MemberVO vo) {
		try {
			// 중복ID 여부 확인
			MemberVO data = new MemberVO();
			data.setUserID(vo.getUserID());
			data.setUserPW(""); // id만 조회할 예정으로 pw는 공백으로 전송
			data = MemData(data);// 단일 데이터 조회

			if (data != null) { // 받아온 데이터가 조회가 된다면 == 중복 id존재 == 가입 불가
				return false;
			}
			// return false 되지 않으면
			// 회원가입 insert 진행
			conn = DBCP.getConnection(); // DB연결
			pstmt = conn.prepareStatement(sql_INSERT);
			pstmt.setString(1, vo.getUserID()); // 사용자 입력정보 - ID 삽입
			pstmt.setString(2, vo.getUserPW()); // PW 삽입
			pstmt.setString(3, vo.getUserName()); // NAME- 삽입
			pstmt.executeUpdate(); // 쿼리문 업데이트
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("signUpcheck 오류 발생");
			return false;
		} finally {
			DBCP.close(conn, pstmt); // DB 접근 객체 close
		}
		return true;
	}

	// 회원 전체목록 반환
	public ArrayList<MemberVO> MemDataList() {
		ArrayList<MemberVO> datas = new ArrayList<MemberVO>(); // 리스트 인스턴스화

		try {
			conn = DBCP.getConnection(); // DB연결
			pstmt = conn.prepareStatement(sql_SELECT_ALL); // 회원목록
			ResultSet rs = pstmt.executeQuery(); // select result 받음
			while (rs.next()) { // 데이터가 n개 이상이므로 반복문으로 데이터를 받아옴
				MemberVO data = new MemberVO(); // AL에 add할 -- 인스턴스화
				data.setMnum(rs.getInt("MNUM")); // select한 DB데이터를 → 객체에 set
				data.setUserID(rs.getString("USERID")); // ""
				data.setUserPW(rs.getString("USERPW")); // ""
				data.setUserName(rs.getString("USERNAME")); // ""
				datas.add(data); // 인덱스 별 객체삽입
			}
			rs.close(); // close
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("MemDataList 오류발생");
		} finally {
			DBCP.close(conn, pstmt); // DB접근 객체 close
		}

		return datas; // 저장된 데이터 목록을 리턴
	}

// 단일회원 반환
	public MemberVO MemData(MemberVO vo) {
		MemberVO data = null;
		try {
			conn = DBCP.getConnection(); // DB연결
			pstmt = conn.prepareStatement(sql_SELECT_ONE);
			pstmt.setString(1, "%" + vo.getUserID() + "%"); // 사용자 입력정보 - ID 삽입
			pstmt.setString(2, "%" + vo.getUserPW() + "%"); // 사용자 입력정보 - PW 삽입
			ResultSet rs = pstmt.executeQuery(); // select result 받음
			if (rs.next()) { // 반환받은 rs에 데이터가 있다면 조건문 수행
				data = new MemberVO(); // data 인스턴스화
				data.setMnum(rs.getInt("MNUM")); // select한 DB데이터를 → 객체에 set
				data.setUserID(rs.getString("USERID")); // ""
				data.setUserPW(rs.getString("USERPW")); // ""
				data.setUserName(rs.getString("USERNAME")); // ""
			}
			rs.close(); // close
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("MemData 오류발생");
		} finally {
			DBCP.close(conn, pstmt); // DB접근 객체 close
		}
		return data; // data반환 ( 이때, 위 조건문이 실행되지 않았다면 null로 반환된다. )
	}
	//회원 정보 수정
	public boolean MemUpdate(MemberVO vo) {
		try {
			conn = DBCP.getConnection();
			pstmt = conn.prepareStatement(sql_UPDATE); 
			pstmt.setString(1, vo.getUserPW()); // 사용자 업뎃 정보 - pw삽입
			pstmt.setString(2, vo.getUserName());  // '' - name 삽입
			pstmt.setInt(3, vo.getMnum()); // pk인 mnum을 통해 위 정보를 update 하게 됨
			pstmt.executeUpdate(); // 쿼리문 업데이트
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("MemUpdate 오류 발생");
			return false; // 오류발생시 false 반환
		}finally {
			DBCP.close(conn, pstmt);
		}
		return true;
	}
	//회원 탈퇴
	public boolean MemDelete(MemberVO vo) {
		try {
			conn = DBCP.getConnection();
			pstmt = conn.prepareStatement(sql_DELETE);
			pstmt.setInt(1, vo.getMnum());// PK인 mnum을 통해 회원탈퇴 진행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("회원탈퇴 오류발생");
			return false;
		} finally {
			DBCP.close(conn, pstmt);
		}
		return true;
	}
}