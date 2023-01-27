package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

public class jdbc01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 성공");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("접속 성공");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from student where id = 3");
		if(rs.next()) {
			System.out.println(rs.getString("hakbun"));
		}
	}

}
