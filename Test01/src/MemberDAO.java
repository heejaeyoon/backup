import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class MemberDAO {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	String LOGIN = "select * from management where id = ? and password = ?";
	String List = "select * from management";
	
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance(){
		return instance;
	}
	
	public int iddpw(String username,int id,String pw) {
		con = DbTest.getConnection();
		try {
			stmt = con.prepareStatement(LOGIN);
			stmt.setString(1,username);
			stmt.setString(2,pw);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				return 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

 
		
}
	
	
