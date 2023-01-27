package bus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class 데이터 {
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	Statement st;
	

	데이터() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "java", "mysql");
			System.out.println("DB접속");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	int insert(String name, String phone, String email, String id, String pw, String pwcheck) throws SQLException {
		String sql = "insert into login(name,phone,email,id,pw, pwcheck) values(?,?,?,?,?,?)";
		psmt = con.prepareStatement(sql);
		psmt.setString(1, name);
		psmt.setString(2, phone);
		psmt.setString(3, email);
		psmt.setString(4, id);
		psmt.setString(5, pw);
		psmt.setString(6, pwcheck);
		int result = psmt.executeUpdate();
		return result;
	}

	String[] selectAll(String data1) throws SQLException {
//		String sql = "select id, pw from login where id = ? and pw = ?";
		String sql = "select pw from login where id = ?";

		psmt = con.prepareStatement(sql);
		psmt.setString(1, data1); // pw 정보
//		psmt.setString(2, data2);
		rs = psmt.executeQuery();

		String[] result = new String[1];
		while (rs.next()) {
			result[0] = rs.getString("pw"); // 패스워드 [0]방에 삽입
//			result[1] = rs.getString("pw");
		}
//		if(result[0] != data1 ) {
//			System.out.println("아이디 실패");
//		} else if(result[1] != data2) {
//			System.out.println("비밀번호 실패");
//		}
		return result;

//		if(rs.next()) {
//			if(rs.getString(1).contentEquals(data2)) {
//				return ; //
//				
//			}
//		}

	}


	public int findExistID(String id) {
		
		int value = 0;
		String sql = "SELECT id FROM login WHERE id =?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);	
			rs = psmt.executeQuery();
			if (rs.next())value =1 ;
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return value; 
	}
	
	  // 로그인 db
    public int login(String id, String pw){
        ResultSet rs = null;
        String root = "root";
        String SQL = "SELECT pw FROM login WHERE id = ?"; // 실제로 DB에 입력될 명령어를 SQL 문장으로 만듬.
        try {
            psmt = con.prepareStatement(SQL);
            psmt.setString(1, id);
            rs = psmt.executeQuery(); // 어떠한 결과를 받아오는 ResultSet 타입의 rs 변수에 쿼리문을 실행한 결과를 넣어줌
            if (rs.next()) {
                System.out.println("비밀번호 "+rs.getString(1));
                if (rs.getString(1).contentEquals(pw)) {
                    if(id.equals(root)){
                        return 2; // 관리자 로그인
                    }
                    else {
                        return 1; // 로그인 성공
                    }
                }
                else {
                    return 0; // 비밀번호 불일치
                }
            }
            return -1; // 아이디가 없음
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -2; // DB 오류
    }

}
		
		
				
		

