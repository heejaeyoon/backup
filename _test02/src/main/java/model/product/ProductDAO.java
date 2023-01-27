package model.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.commit.DBCP;



/*해당 테이블이 "상품"인 만큼,
주 페이지인 메인페이지에서 상품목록을 보여주어야 한다.
CUD부분에서는 모두 기존 방식과 동일하지만,
여기서 또 언급될 만한 것이 SELECT_ALL 부분인데
아래 두 가지 기능을 사용할 예정이므로 해당 쿼리문이 작성 되었습니다.
 └> String sql_SELECT_ALL = "SELECT * FROM PRODUCT WHERE PNAME LIKE ? ORDER BY PNUM DESC";
(1)  상품목록
실제로 쇼핑몰 사이트에 접속을 해보면,최근에 등록된 상품순으로 정렬되어 나와있습니다. (==신상품 순)
그 부분을 ORDER BY를 통해 DESC(내림차순) 처리를 해줄 것입니다. --- 상품등록이 되면 PK가 증가 되기 때문
상품 목록 이라함은 == SELECT_ALL 이니 해당 쿼리문에 해당 명령을 추가해주었습니다.
(2) 검색기능
이전 게시물인 게시판 프로그램의 경우, DAO를 보면 사용기능마다 SQL문의 변수를 생성했기 때문에 다소 비효율적이라 볼 수 있었습니다.
해서 이번에는 같은 쿼리문에서 두가지 기능을 수행하고 싶었습니다. (유지보수 및 효율증가---메서드 절약)
이를 위해 검색기능이 있었기 때문에 LIKE문을 추가해주었습니다.
LIKE문이 왜 필요했냐 라고 한다면 . . .
검색을 할 때에는 검색내용이 참조될 모든 데이터가 나와야 합니다.
해서 "%" 문자를 통해 글자의 개수를 정해주지 않아 모든 데이터가 나올 수 있도록 해줍니다.
그런데 여기에서 "같은 쿼리문인데, 검색과 상품목록을 어떻게 데이터를 받는건가요??" 라고 해볼 수 있습니다.
 → 인자를 "문자(String)"으로 받아 검색 시에는 사용자 입력문자를 넣어주고, 상품목록 출력 시에는 공백"" 을 넣어주면, 사용목적에 맞게 데이터를 출력할 수가 있게 됩니다.*/


public class ProductDAO {
	// sql문
	String sql_INSERT = "INSERT INTO PRODCUT (PNUM, PNAME, PRICE, CNT) VALUES "
			+ "((SELECT NVL(MAX(PNUM), 0)+1 FROM PRODUCT),?,?,?)";
	String sql_SELECT_ALL = "SELECT * FROM PRODUCT WHERE PNAME LIKE ? ORDER BY PNUM DESC";
	String sql_SELECT_ONE = "SELECT = FROM PRODUCT WHERE PNUM=?";
	String sql_UPDATE = "UPDATE PRODUCT SET PNAME=?, PRICE=? CNT=? WHERE PNUM=?";
	String sql_DELETE = "DELETE FROM PRODUCT WHERE PNUM=?";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//상품 추가
	public boolean productInsert(ProductVO vo) {
		try {
			conn = DBCP.getConnection();
			pstmt = conn.prepareStatement(sql_INSERT);
			pstmt.setString(1, vo.getpName());  // 관리자 입력정보 - PNAME삽입
			pstmt.setInt(2, vo.getPrice()); //관리자 입력정보 - price 삽입
			pstmt.setInt(3, vo.getCnt()); // '' -cnt 삽입
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("업데이트 오류");
			return false;
		} finally {
			DBCP.close(conn, pstmt);
		}
		return true;
	}
	
	//물품 전체 목록,검색기록
	public ArrayList<ProductVO> prodcutList(String str){
		ArrayList<ProductVO> datas = new ArrayList<ProductVO>();
		try {
			conn = DBCP.getConnection();
			pstmt = conn.prepareStatement(sql_SELECT_ALL);
			pstmt.setString(1, "%"+str+"%"); //인자값으로 SELECT 출력
			rs = pstmt.executeQuery(); // SELECT RESULT 받음
			
			while(rs.next()) { //데이터가 N개 이상이므로 반복문으로 데이터를 받아온다 
				ProductVO data= new ProductVO(); //ARList 에 add할 --인스턴스화
				data.setPnum(rs.getInt("PNUM")); //select 한 DB데이터를 객체에 set 
				data.setpName(rs.getString("PNAME")); // ""
				data.setPrice(rs.getInt("PRICE")); // ""
				data.setCnt(rs.getInt("CNT")); // ""
				datas.add(data); // 인덱스단위로 객체 삽입
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("product 오류 발생");
		} finally {
			DBCP.close(conn, pstmt);
		}
			return datas;
	}
			
	//단일 상품 조회
	public ProductVO productData(ProductVO vo) {
		ProductVO data = null;
		try {
			conn = DBCP.getConnection();
			pstmt = conn.prepareStatement(sql_SELECT_ONE);
			pstmt.setInt(1, vo.getPnum());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				data = new ProductVO();
				data.setPnum(rs.getInt("PNUM")); // select한 DB데이터를 → 객체에 set
				data.setpName(rs.getString("PNAME")); // ""
				data.setPrice(rs.getInt("PRICE")); // ""
				data.setCnt(rs.getInt("CNT")); // ""
			}
			rs.close(); // close
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("productData 오류발생");
		}finally {
			DBCP.close(conn, pstmt); // DB접근 객체 close
		}

		return data; // data반환 ( 이때, 위 조건문이 실행되지 않았다면 null로 반환된다. )
	}
	
	// [상품변경]
	public boolean productUpdate(ProductVO vo) {
       
		try {
			conn = DBCP.getConnection(); // DB연결
			pstmt = conn.prepareStatement(sql_UPDATE);
			pstmt.setString(1, vo.getpName()); // 관리자 업뎃 정보 - PNAME삽입
			pstmt.setInt(2, vo.getPrice()); // 관리자 업뎃 정보 - PRICE삽입
			pstmt.setInt(3, vo.getCnt()); // 관리자 업뎃 정보 - CNT 삽입
			pstmt.setInt(4, vo.getPnum()); // PK인 PNUM을 통해, 위 정보를 update 하게 됨
			pstmt.executeUpdate();  // Query문 업데이트
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("productUpdate 오류발생");
			return false; // 오류가 발생했다면 false반환
		}finally {
			DBCP.close(conn, pstmt); // DB접근 객체 close
		}
		
		return true; // 정상적으로 등록이 되었다면 true 반환
	}
	
	// [상품삭제]
	public boolean productDelete(ProductVO vo) {
     
		try {
			conn = DBCP.getConnection(); // DB연결
			pstmt = conn.prepareStatement(sql_DELETE);
			pstmt.setInt(1, vo.getPnum()); // PK인 PNUM을 통해 상품삭제 진행
			pstmt.executeUpdate();  // Query문 업데이트
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("productDelete 오류발생");
			return false; // 오류가 발생했다면 false반환
		}finally{
			DBCP.close(conn, pstmt); // DB접근 객체 close
		}
		return true; // 정상적으로 등록이 되었다면 true 반환
	}
}

