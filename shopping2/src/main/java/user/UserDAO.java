package user;

import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class UserDAO {
	private Connection con = getConnect();
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private static UserDAO instance;

	public static UserDAO getinstance() {

		if (instance == null) {
			instance = new UserDAO();
		}

		return instance;
	}

	private Connection getConnect() {
		try {
			Properties prop = new Properties();
			String path = UserDAO.class.getResource("db.properties").getPath();
			path = URLDecoder.decode(path, "utf-8");
			prop.load(new FileReader(path));
			String driver = prop.getProperty("driver");
			Class.forName(driver);
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			Connection con = DriverManager.getConnection(url, user, pw);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DB연결 실패");
		return null;
	}

	public int login(String userId, String userPw) {
		String sql = "select userPw from member where userId = ?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPw)) {
					return 1; // 로그인 성공
				} else {
					return 0; // 비밀번호 불일치
				}
			}
			return -1; // 아이디가 없다
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류
	}

	public int register(User user) {
		String sql = "insert into member values (member_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPw());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserEmail());
			pstmt.setString(5, user.getUserPhone());
			pstmt.setString(6, user.getUserPostcode());
			pstmt.setString(7, user.getUserAdd());
			pstmt.setString(8, user.getUserDetailAdd());
			pstmt.setString(9, user.getUserGender());
			pstmt.setString(10, user.getUserBirth());
			pstmt.setString(11, "sysdate");
			pstmt.setInt(12, user.getUserPoint());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;// 데이터 베이스 오류
	}

	public boolean idcheck(String id) {

		boolean flag = false;
		System.out.println("모얌" + id);

		String sql = "select userid from member where userid=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("idcheck sql error");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println("데이터 오류");
			}
		}

		System.out.println("flag :" + flag);
		return flag;

	}

	public User getUserById(String id) {
		User user = null;

		String sql = "select * from member where userid=?";

		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				user = getUser(rs);
			}

		} catch (SQLException e) {
			System.out.println("getMemberById eql error");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				System.out.println("오류");
			}
		}
		System.out.println("user : " + user);
		return user;
	}

	public User getUser(ResultSet rs) throws SQLException {

		User user = new User();

		user.setNo(rs.getInt("no"));
		user.setUserId(rs.getString("userid"));
		user.setUserPw(rs.getString("userpw"));
		user.setUserName(rs.getString("username"));
		user.setUserEmail(rs.getString("useremail"));
		user.setUserPhone(rs.getString("userphone"));
		user.setUserPostcode(rs.getString("userpostcode"));
		user.setUserAdd(rs.getString("useradd"));
		user.setUserDetailAdd(rs.getString("userdetailadd"));
		user.setUserGender(rs.getString("usergender"));
		user.setUserBirth(rs.getString("userbirth"));
		user.setJoindate(rs.getString("joindate"));
		user.setUserPoint(rs.getInt("userpoint"));

		return user;

	}
}
