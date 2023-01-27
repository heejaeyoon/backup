package jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버 완료");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
		System.out.println("DB 접속 성공");
		System.out.print("이름>");
		String name = sc.nextLine();
		System.out.print("학번>");
		String hakbun = sc.nextLine();
		System.out.print("주소>");
		String address = sc.nextLine();
		stmt = conn.createStatement();
		int res = stmt.executeUpdate("insert into student " + "values(0,'"+name+"','"+hakbun+"','"+address+"')");
		System.out.println(res+" 건 입력 성공");
 	}
}
