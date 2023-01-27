import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class DbTest {
	public static void main(String[] args) {
		craetTable();
		createCustomer("dbsgmlwo79","희재", "dbsgmlwo78@naver.com", "01022222222", "123");
		ArrayList<String> list = getCustomer();
		for(String item: list) {
			System.out.println(item);
		}
		
	}	
	
	public static ArrayList<String> getCustomer(){
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select id,name,email,phone,pw");
			ResultSet rs = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();
			while(rs.next()) {
				list.add("id: " + rs.getString("id") +
						"name" + rs.getString("name")+ 
						"email" + rs.getString("phone")+
						"pw"+ rs.getString("pw"));
				
			}
			System.out.println("불러오기 완료");
			return list;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
			
		}
	
	}
	
		
	public static void createCustomer(String id,String name,String email,String phone,String pw) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO customer"
					+ "(id,name, email, phone, pw) "
					+ "VALUE "
					+ "('"+id+"','"+name+"','"+email+"','"+phone+"','"+pw+"')");
			insert.executeUpdate();
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void craetTable() {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE IF NOT EXISTS "
						+ "customer(id varCHar(255),"
						+ "name varChar(255),"
						+ "email varChar(255),"
						+ "phone varChar(255),"
						+ "pw varChar(255),"
						+ "PRIMARY KEY(id))");
			create.execute();
						
		} catch (Exception e) {
			System.out.println("테이블 완성 실패>"+ e.getMessage());
		}	finally {
			System.out.println("테이블 완성");
		}
	}
	
	public static Connection getConnection(){
		try {
			String url = "jdbc:mysql://localhost:3306/thisisjava";
			String user = "java";
			String password = "mysql";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("db 연동 확인");
			return con;
		} catch (Exception e) {
			System.out.println("db연동 실패>");
		}
		return null;
	
	

	}
}