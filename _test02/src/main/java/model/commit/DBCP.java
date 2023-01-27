package model.commit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBCP {// [JNDI] --- context.xml에서 커넥션 풀 자원등록했던 거에 접근할 수 있게된다.
	// Connection 연결
	public static Connection getConnection() {
		Connection conn = null;

		try {

			Context initContext = new InitialContext();
			// DBCP를 설정한 context.xml로부터 받아옴

			// lookup을 통해서 DataSource(DBCP)에 접근
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/orcl");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	// CLOSE
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

//------참고
//getConnection
//기존 JDBC에 비해서 코드가 다소 간결해짐을 볼 수 있다.
//그 이유는 JDBC는 드라이버를 로드, DB연결을 반복하였었는데,
//위의 작업이 DBCP에 설정을 해놓음으로써(==자원 확보) → JNDI에서만 DBCP를 연결하면 확보된 Connection을 가져다 주기 때문입니다.

//close
//위 DBCP 설명에서 언급되기로는 "자원 반납체크" 를 하기 때문에 close를 안하여도 되지만
//하지만 개발자가 미리 close를 해준다면 반납하는 시간을 줄여줄 수가 있다.
//해서 결론은, 안닫아도 되지만 close를 해주는 것을 권장 합니다.
