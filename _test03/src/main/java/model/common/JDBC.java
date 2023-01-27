package model.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// [DB접근 4단계]
//  - 드라이버로드
//  - DB연결
//  - DB데이터에 read,write ---"DAO역할"
//  - DB연결해제

public class JDBC {	
    // DB연동된 Connection 반환 메서드
    //static 메서드 == JDBC를 인스턴스화 하지않고 즉시 사용하기 위함 
	public static Connection getConnection() {
		String DName ="oracle.jdbc.driver.OracleDriver"; // 드라이버 주소
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 연동할 url(IP주소:포트번호/스키마이름)
		String user = "SHOP2";  // DBMS 이름
		String pw = "1234";  // DBMS 비밀번호
          
        // DB연결클래스 인스턴스화
		Connection conn= null; // scope로 인해 try 외부에서 인스턴스화
		
		try {
			Class.forName(DName); // 드라이버 연결
			conn= DriverManager.getConnection(url, user, pw); // DBMS 회원정보 → DB연동
		} catch (ClassNotFoundException e) { // Driver 오류 예외처리
			e.printStackTrace(); 
		} catch (SQLException e) { //SQL문 오류시 예외처리
			e.printStackTrace();
		}
		return conn; // 연동한 conn 반환
	}

    // DB연결해제 
	public static void close(Connection conn, PreparedStatement pstmt) {
    // ※pstmt-DB접근(read,writer)
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
