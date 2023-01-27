package board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JdbcUtil;

public class BoardDao {
	private JdbcUtil ju;
	
	public BoardDao() {
		ju = JdbcUtil.getInstance();
	}
	
	//삽입(C)
	public int insert(BoardVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "insert into BOARD (NUM,TITLE,WRITER,CONTENT,REGDATE,CNT)"
				+ "values(BOARD_SEQ.nextval,?,?,?,sysdate,0)";
		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			ret= pstmt.executeUpdate();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} //풀에 반환
			}
		}
		
		return ret;
	}
	
	//조회(R)
	
	public List<BoardVo> selectAll(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select NUM,TITLE,WRITER,CONTENT,REGDATE,CNT FROM BOARD order by NUM desc";
		ArrayList<BoardVo> ls = new ArrayList<BoardVo>();
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVo vo = new BoardVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						new Date(rs.getDate(5).getTime()),
						rs.getInt(6));	
				ls.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} //풀에 반환
			}
		}
		return ls;
	}
	
	public BoardVo selectOne(int num){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select NUM,TITLE,WRITER,CONTENT,REGDATE,CNT FROM BOARD where NUM = ?";
		BoardVo vo = null;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				updateCnt(num); //조회수 증가
				vo = new BoardVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						new Date(rs.getDate(5).getTime()),
						rs.getInt(6)+1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} //풀에 반환
			}
		}
		return vo;
	}
	
	//수정(U)
	public int update(BoardVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "update BOARD set TITLE=?,CONTENT= ? WHERE NUM= ?";

		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getNum());
			ret= pstmt.executeUpdate();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} //풀에 반환
			}
		}
		
		return ret;
	}
	
	public int updateCnt(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "update BOARD set CNT=CNT+1 WHERE NUM= ?";

		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			ret= pstmt.executeUpdate();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} //풀에 반환
			}
		}
		
		return ret;
	}
	
	
	//삭제(D)
	public int delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "delete from BOARD where NUM=? ";

		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			ret= pstmt.executeUpdate();
			return ret;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				} //풀에 반환
			}
		}
		
		return ret;
	}
}

