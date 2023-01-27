package model.Ordermember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.common.JDBC;

public class OrderMemberDAO {
    // SQL문 변수활용 --- 대문자 작성: DBMS에서는 대/소문자 구분을 안하므로 DB의 SQL임을 표시
	String sql_SELECT_ONE = "SELECT * FROM ORDERMEMBER WHERE USERID=? AND USERPW=?";
	String sql_SELECT_ALL = "SELECT * FROM ORDERMEMBER";
	String sql_INSERT = "INSERT INTO ORDERMEMBER (USERNAME, USERID, USERPW) VALUES ((SELECT NVL(MAX(ONUM), 0)+1 FROM ORDERMEMBER), ?, ?, ?)";
	String sql_UPDATE = "UPDATE ORDERMEMBER SET USERNAME=?, USERPW=? WHERE ONUM=?";
	String sql_DELETE = "DELETE FROM ORDERMEMBER WHERE ONUM=?";
		
	Connection conn = null; //DB연동 객체화
	PreparedStatement pstmt = null; // DB접근 객체화
	
	//[메서드] insert - 데이터 삽입(회원가입)
	public boolean memInsert(OrderMemberVO vo) {
		conn = JDBC.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql_INSERT); // sql문으로 DB연동한conn을통해  → db접근
			pstmt.setString(1, vo.getUserName());
			pstmt.setString(2, vo.getUserID());
			pstmt.setString(3, vo.getUserPW());
			pstmt.executeUpdate(); 
			
		} catch (SQLException e) {
			System.out.println("memInsert에서 오류발생"); // [로깅기법] 확인용
			e.printStackTrace();
			return false;
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		return true;
	}
	
	//[메서드] selectOne --> 단일 data반환(로그인 대조)
	public OrderMemberVO memSelectOne(OrderMemberVO vo) {
		OrderMemberVO data = null; // 데이터가 없을 시 null로 전송하기 위함
		
		conn = JDBC.getConnection(); //DB연결
		
		try {
			pstmt = conn.prepareStatement(sql_SELECT_ONE); // sql문으로 db접근
			pstmt.setString(1, vo.getUserID()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			pstmt.setString(2, vo.getUserPW()); // 두번째 ?, ""
			ResultSet rs = pstmt.executeQuery(); // 데이터를 rs로 반환
			if(rs.next()) { // rs에 데이터가 있으면(next) 동작수행 ↓
				data = new OrderMemberVO();  // 데이터가 있으면 인스턴스화
				data.setOnum(rs.getInt("onum")); // 불러온 데이터를 data에 저장
				data.setUserID(rs.getString("userID")); // ""
				data.setUserPW(rs.getString("userPW")); // ""
				data.setUserName(rs.getString("userName")); // ""
			}
			rs.close(); // DB 사용이 마친 후, 즉시 닫아준다.
			
		} catch (Exception e) {
			System.out.println("memselectone에서 오류발생"); // [로깅기법] 확인용
			e.printStackTrace();
			
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
		
		return data;
	}
	//[메서드] selectALL --> 전체 datas 반환(회원 목록)
		public ArrayList<OrderMemberVO> memSelectAll() { // 지정대상이 아닌 "전체목록"이기 때문에 인자는 없다.
			ArrayList<OrderMemberVO> datas = new ArrayList<OrderMemberVO>();
			conn = JDBC.getConnection(); //DB연결
			
			try {
				pstmt = conn.prepareStatement(sql_SELECT_ALL); // sql문으로 db접근
				ResultSet rs = pstmt.executeQuery();  // 데이터를 rs로 반환해줌
				while(rs.next()) { //여러 데이터를 받아올 예정으로 1회당==1객체 -> 반복문으로 데이터를 받아온다.
					OrderMemberVO data = new OrderMemberVO(); // 데이터 보관목적 - 인스턴스화
					data.setOnum(rs.getInt("onum")); // 불러온 데이터를 data에 저장
					data.setUserID(rs.getString("userID")); // ""
					data.setUserPW(rs.getString("userPW")); // ""
					data.setUserName(rs.getString("userName")); // ""
					datas.add(data); // 반환할 datas에 객체단위로 저장
				}
				rs.close(); // DB 사용이 마친 후, 즉시 닫아준다.
				
			} catch (Exception e) {
				System.out.println("memSelectAll에서 오류발생"); // [로깅기법] 확인용
				e.printStackTrace();
				
			}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
				JDBC.close(conn, pstmt);
			}
			
			return datas; //객체 리스트 반환
		}
		
	//[메서드] update (현 프로그램에서 사용되지는 않으나, 이후를 대비해 사전 정의)
	public void memUpdate(OrderMemberVO vo) {
		
		conn = JDBC.getConnection(); //DB연결
		try {
			pstmt = conn.prepareStatement(sql_UPDATE); // sql문으로 DB접근
			pstmt.setString(1, vo.getUserName()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			pstmt.setString(2, vo.getUserPW()); // 두번째 ?, ""
			pstmt.setInt(3, vo.getOnum()); // 세번째 ?, ""
			pstmt.executeUpdate(); // 입력데이터 업데이트(DB반영)
			
		} catch (SQLException e) {
			System.out.println("memUpdate에서 오류발생"); // [로깅기법] 확인용
			e.printStackTrace();
			
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
	}
    //[메서드] dalete - 데이터 삭제(회원탈퇴) 
    //(현 프로그램에서 사용되지는 않으나, 이후를 대비해 사전 정의)
	public void memDelete(OrderMemberVO vo) {
		conn = JDBC.getConnection();
		try {
			pstmt = conn.prepareStatement(sql_DELETE); // sql문으로 DB접근
			pstmt.setInt(1, vo.getOnum()); // 첫번째 ?, 반영대상인 vo 속성으로 sql문 삽입
			pstmt.executeUpdate(); // 입력데이터 업데이트(DB반영)
		} catch (SQLException e) {
			System.out.println("memDelete에서 오류발생"); // [로깅기법] 확인용
			e.printStackTrace();
		}finally { // DB접근에 사용된 객체는 close를 반드시 수행(finally)
			JDBC.close(conn, pstmt);
		}
	}	

	// 기능 메서드 ↓↓↓
	// 향후 기능 클래스로 따로 정의해두어 메서드 분할해야할 필요성이 있다.
	//[메서드] 로그인여부 --> selectOne메서드활용
	public boolean loginCheck(OrderMemberVO vo) {
		OrderMemberVO data = memSelectOne(vo); // 인자로 select
		if(data==null) { // selectOne 반환시 null로 받았다면 == 로그인 실패
			System.out.println("로그인실패");
			return false;
		}
		// null이 안되어 false로 종료되지 않았다면 --> true반환
		return true;
		}
	}
