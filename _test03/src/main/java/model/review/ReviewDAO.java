package model.review;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.common.JDBC;

public class ReviewDAO {
    // SQL문 변수활용 --- 대문자 작성: DBMS에서는 대/소문자 구분을 안하므로 DB의 SQL임을 표시
	String SQL_SELECTONE = "SELECT * FROM REVIEW WHERE RNUM=?";
	String SQL_SELECTALL = "SELECT * FROM REVIEW ORDER BY RNUM DESC";
	String SQL_SELECTUSER = "SELECT * FROM REVIEW WHERE ONUM=? ORDER BY RNUM DESC";
	String SQL_SELECTSERACH = "SELECT * FROM REVIEW WHERE CONTENT LIKE ? OR TITLE LIKE ? ORDER BY RNUM";
	String SQL_INSERT = "INSERT INTO REVIEW (ONUM, RNUM, WRITER, TITLE, CONTENT, WDATE) VALUES(?, (SELECT NVL(MAX(RNUM),0)+1 FROM REVIEW), ?, ?, ?, SYSDATE)";
	String SQL_UPDATE = "UPDATE REVIEW SET WRITER=?, TITLE=?, CONTENT=? WHERE RNUM=?";
	String SQL_DELETE = "DELETE FROM REVIEW WHERE RNUM=?";
	
    // [메서드] selectAll --> 글 목록 반환
	public ArrayList<ReviewVO> RVSelectAll() { // 지정대상이 아닌 "전체목록"이기 때문에 인자는 없다.
		ArrayList<ReviewVO> datas = new ArrayList<ReviewVO>(); //list를 반환할 AL객체화
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		
		try {
			pstmt = conn.prepareStatement(SQL_SELECTALL); // sql문으로 DB연동한conn을통해  → db접근
			ResultSet rs = pstmt.executeQuery();  // 데이터를 rs로 반환해줌
			while(rs.next()) { // 여러 데이터를 받아올 예정으로 1회당==1객체 -> 반복문으로 데이터를 받아온다.
				ReviewVO data = new ReviewVO(); // 데이터 보관목적 - 인스턴스화
				data.setOnum(rs.getInt("onum")); // 불러온 데이터를 data에 저장
				data.setRnum(rs.getInt("rnum")); // ""
				data.setWriter(rs.getString("writer")); // ""
				data.setTitle(rs.getString("title")); // ""
				data.setContent(rs.getString("content")); // ""
				data.setWdate(rs.getDate("wdate")); // ""
				datas.add(data); // 저장한 객체별로 datas 인덱스에 저장
			}
            rs.close(); // DB 사용이 마친 후, 즉시 닫아준다.
		} catch (SQLException e) {
			System.out.println("RVInsert 에서 오류");
			e.printStackTrace();
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		
		return datas;  // 객체 리스트 반환
	}
	// [메서드] selectOne --> 단일 data반환(내 리뷰수정 페이지)
	public ReviewVO RVSelectOne(ReviewVO vo) {
		ReviewVO data = null; // 데이터가 없을 시 null로 전송하기 위함
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		
		try {
			pstmt = conn.prepareStatement(SQL_SELECTONE); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setInt(1, vo.getRnum()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			ResultSet rs = pstmt.executeQuery(); // 검색된 데이터를 rs로 반환
			if(rs.next()) { // rs에 데이터가 있으면(next) 동작수행 ↓
				data = new ReviewVO(); // 데이터가 있으면 인스턴스화
				data.setOnum(rs.getInt("onum")); // 불러온 데이터를 data에 저장
				data.setRnum(rs.getInt("rnum")); // ""
				data.setWriter(rs.getString("writer")); // ""
				data.setTitle(rs.getString("title")); // ""
				data.setContent(rs.getString("content")); // ""
				data.setWdate(rs.getDate("wdate")); // ""
			}
            rs.close(); // DB 사용이 마친 후, 즉시 닫아준다.
		} catch (SQLException e) {
			System.out.println("RVSelectOne 에서 오류");
			e.printStackTrace();
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		
		return data; // 저장된 데이터 반환
	}
	// [메서드] insert--> 리뷰 추가
	public boolean RVInsert(ReviewVO vo) {
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		try {
			pstmt = conn.prepareStatement(SQL_INSERT); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setInt(1, vo.getOnum()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			pstmt.setString(2, vo.getWriter()); // 두번째 ?, ""
			pstmt.setString(3, vo.getTitle()); // 세번째 ?, ""
			pstmt.setString(4, vo.getContent()); // 네번째 ?, ""
			pstmt.executeUpdate(); // 입력데이터 업데이트(DB반영)
		} catch (SQLException e) {
			System.out.println("RVInsert 에서 오류");
			e.printStackTrace();
			return false; // 오류발생시 false 반환
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		
		return true; // 리뷰 추가 완료가 되었으면 true 반환
	}
	// [메서드] insert--> 리뷰 수정(작성자 제목 내용 만 변경가능)
    // 사용자가 어느 부분을 수정할지 예측이 불가하기 때문에 → 변경 요소 모두 update하는방식
	public boolean RVUpdate(ReviewVO vo) {
		System.out.println("reviewVO vo"+vo);
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		try {
			pstmt = conn.prepareStatement(SQL_UPDATE); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setString(1, vo.getWriter()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			pstmt.setString(2, vo.getTitle()); // 두번째 ?, ""
			pstmt.setString(3, vo.getContent()); // 세번째 ?, ""
			pstmt.setInt(4, vo.getRnum()); // 네번째 ?, ""
			pstmt.executeUpdate(); // 입력데이터 업데이트(DB반영)
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("RVUpdate 에서 오류");
			return false; // 오류발생시 false 반환
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		
		return true;
	}
	// [메서드] insert--> 리뷰 수정(작성자 제목 내용 만 변경가능)
	public boolean RVDelete(ReviewVO vo) {
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		
		try {
			pstmt = conn.prepareStatement(SQL_DELETE); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setInt(1, vo.getOnum());			
			pstmt.executeUpdate(); // 입력데이터 업데이트(DB반영)
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("RVDelete 에서 오류");
			return false; // 오류발생시 false 반환
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}		
		return true;
	}	
	// [메서드] Search--> 리뷰 검색(사용자가 검색한 내용은 →→ 제목, 내용 함께 search 반환됨)
	public ArrayList<ReviewVO> RVSearch(String searchStr){
		ArrayList<ReviewVO> datas = new ArrayList<ReviewVO>();
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		
		try {
			pstmt = conn.prepareStatement(SQL_SELECTSERACH); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setString(1, searchStr); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			pstmt.setString(2, searchStr); // 두번째 ?
			ResultSet rs = pstmt.executeQuery(); // 검색된 데이터를 rs로 반환
			while(rs.next()) { // 여러 데이터를 받아올 예정으로 1회당==1객체 -> 반복문으로 데이터를 받아온다.
				ReviewVO data = new ReviewVO(); // 데이터 보관목적 - 인스턴스화
				data.setOnum(rs.getInt("onum")); // 불러온 데이터를 data에 저장
				data.setRnum(rs.getInt("rnum")); // ""
				data.setWriter(rs.getString("writer")); // ""
				data.setTitle(rs.getString("title")); // ""
				data.setContent(rs.getString("content")); // ""
				data.setWdate(rs.getDate("wdate")); // ""
				datas.add(data); // 저장한 객체별로 datas 인덱스에 저장
			}
		} catch (SQLException e) {
			System.out.println("RVSearch 에서 오류");
			e.printStackTrace();
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		
		return datas; // 객체 리스트 반환
	}
	// [메서드] userDatas--> 사용자가 입력한 리뷰목록을 반환
	public ArrayList<ReviewVO> RVUserDatas(ReviewVO vo){
		
		ArrayList<ReviewVO> datas = new ArrayList<ReviewVO>(); // list를 반환할 AL객체화
		Connection conn = JDBC.getConnection(); // DB연동 객체화
		PreparedStatement pstmt = null; // DB접근 객체화
		
		try {
			pstmt = conn.prepareStatement(SQL_SELECTUSER); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setInt(1, vo.getOnum()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			ResultSet rs = pstmt.executeQuery(); // 데이터를 rs로 반환해줌
			while(rs.next()) { // 여러 데이터를 받아올 예정으로 1회당==1객체 -> 반복문으로 데이터를 받아온다.
				ReviewVO data = new ReviewVO(); // 데이터 보관목적 - 인스턴스화
				data.setOnum(rs.getInt("onum")); // 불러온 데이터를 data에 저장
				data.setRnum(rs.getInt("rnum")); // ""
				data.setWriter(rs.getString("writer")); // ""
				data.setTitle(rs.getString("title")); // ""
				data.setContent(rs.getString("content")); // ""
				data.setWdate(rs.getDate("wdate")); // ""
				datas.add(data); // 저장한 객체별로  datas 인덱스에 저장
			}
		} catch (SQLException e) {
			System.out.println("RVUserDatas 에서 오류");
			e.printStackTrace();
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt); 
		}
		
		return datas; // 객체 리스트 반환
	}
}
