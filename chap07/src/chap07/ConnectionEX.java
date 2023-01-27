package chap07;

import java.sql.connection;

import com.mysql.cj.util.DataTypeUtil;

import java.sql.DriverMnager;
import java.sql.SQLException;

public class ConnectionEX {
	public static void main(String[] args) {
		Connerction conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			conn = DriverManger.getConnection(
				"jdbc:mysql://localhost:3306/chap07",
				"java"
				"mysql"
				);
			
			System.out.println("연결 성공");
		}	catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	catch (SQLException e) {
			e.printStackTrace(;)
		}	finally {
			if(conn != null) {
				try {
					//연결끊기
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}
}