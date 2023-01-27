package 아티클;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArticleDao {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;

	ArticleDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thisisjava", "java", "mysql");
//         System.out.println("DB 접속!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	int insert(Article art) {
		String sql = "insert into Article(writer, title, content, count)" + " values (?,?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, art.writer);
			pstm.setString(2, art.title);
			pstm.setString(3, art.content);
			pstm.setInt(4, art.count);
			return pstm.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return 0;
	}

	int delete(int id) {
		String sql = "delete from Article where id = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			return pstm.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return 0;
	}

	int update(Article art) {
		String sql = "update Article " + "set writer = ?, title = ?, content = ?, count = ?" + " where id = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, art.writer);
			pstm.setString(2, art.title);
			pstm.setString(3, art.content);
			pstm.setInt(4, art.count);
			pstm.setInt(5, art.id);
			return pstm.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return 0;
	}

	Article select(int sid) {
		String sql = "select * from article where id = ?";
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, sid);
			rs = pstm.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("id");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				int count = rs.getInt("count");
				return new Article(id, writer, title, content, count);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstm != null) {
				try {
					pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;

	}

	List<Article> selectAll() {
		List<Article> lst = new ArrayList<Article>();
		String sql = "select id, writer, title, content, count " + "from article";
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String writer = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				int count = rs.getInt(5);
				lst.add(new Article(id, writer, title, content, count));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}

	public static void main(String[] args) {
		ArticleDao dao = new ArticleDao();
//		List<Article> list = dao.selectAll();
		List<Article> list1 = new ArrayList<Article>();
		for (int i = 0; i < 10; i++) {
			Article art2 = new Article(0, "강" + i, "제목" + i, "내용" + i, i);
			list1.add(art2);
			list1.stream().forEach((e) -> System.out.println(e));
		}
	}
}

//		for(Article at : list1) {
//			System.out.println(at);
//		}

//		System.out.println(dao.insert(art2));
//		
//		Article art1 = dao.select(3);
//		System.out.println(art1);

//		Article art = dao.select(2);
//		System.out.println(art);
//		for(Article art : list ) {
//			System.out.println(art);

//		list2.stream().forEach((r)->System.out.println(r.writer));
