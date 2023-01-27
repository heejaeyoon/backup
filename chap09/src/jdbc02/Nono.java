package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Nono {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("DB 접속 성공");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getString("name"));
		}
	}
}




