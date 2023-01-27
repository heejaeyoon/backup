<%@page import="com.sun.xml.internal.bind.CycleRecoverable.Context"%>
,
<!-- DBCP 자동 import-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.ArrayList,model.member.*, model.product.*"
	errorPage="errorPage.jsp"%>

<%
// 다국어 처리
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
%>
<!-- 빈즈 클래스 -->
<jsp:useBean id="memberDAO" class="model.member.MemberDAO" />
<jsp:useBean id="productDAO" class="model.product.ProductDAO" />
<jsp:useBean id="basketList" class="java.util.ArrayList" scope="session" />

<jsp:useBean id="memberVO" class="model.member.MemberVO" />
<jsp:useBean id="productVO" class="model.product.ProductVO" />

<jsp:setProperty property="*" name="memberVO" />
<jsp:setProperty property="*" name="productVO" />

<%
//  변수 저장 = 사용자 요청목적
String action = request.getParameter("action");

// [메인페이지 이동]
if (action.equals("list")) {
	// 전체 리뷰
	ArrayList<ProductVO> productList = productDAO.productList("");
	request.setAttribute("productList", productList);

	// 로그인하여 session이 존재한다면,
	if (session.getAttribute("memberVO") != null) {
		// 로그인정보를 객체에 저장
		MemberVO data = (MemberVO) session.getAttribute("memberVO");

		// 관리자 계정이라면 -> 관리 페이지 이동
		if (data.getUserID().equals("admin") && data.getUserPW().equals("admin")) {
	pageContext.forward("admin.jsp");
	return;
		}
	} // if문종료

	//사용자는 기본페이지 이동
	pageContext.forward("lists_product.jsp");
}
// [로그인] 
if (action.equals("login")) {
	memberVO = memberDAO.MemData(memberVO);
	// 로그인 성공(null로 반환받지 않았다면)
	if (memberVO != null) {
		// 사용자 계정 저장(세션단위)			
		session.setAttribute("memberVO", memberVO);
		// 메인페이지로 이동
		response.sendRedirect("control.jsp?action=list");
	}
	// 로그인 실패
	else {
		out.println("<script>alert('로그인에 실패하였습니다.'); history.go(-1); </script>");
	}
}

// [로그아웃]
if (action.equals("logout")) {
	session.invalidate();
	response.setContentType("UTF-8");
	pageContext.forward("index.jsp");
}
//[회원가입]
if (action.equals("signup")) {
	boolean signup = memberDAO.signUp(memberVO);
	request.setAttribute("signup", signup);
	pageContext.forward("signupApply.jsp");

}
// [검색기능]
if (action.equals("search")) {
	//검색 내용을 가져옴
	String search = request.getParameter("search");
	request.setAttribute("search", search);

	// dao를 활용하여 검색기록을 list로 받음
	ArrayList<ProductVO> searchDatas = productDAO.productList(search);
	request.setAttribute("searchDatas", searchDatas); // request로 속성설정

	pageContext.forward("search_List.jsp");

}
//[회원정보 수정]
if (action.equals("myPageUpdate")) {
	if (memberDAO.MemUpdate(memberVO)) {
		System.out.println("update완료");
		session.setAttribute("memberVO", memberVO); //변경된 정보 → 다시 set
		response.sendRedirect("control.jsp?action=list");
	}
	//미반영 : false
	else {
		System.out.println("update실패");
		throw new Exception("DB update 오류 발생!");
	}
}
// [회원탈퇴]
if (action.equals("myPageDelete")) {
	if (memberDAO.MemDelete(memberVO)) {
		session.invalidate();
		response.sendRedirect("index.jsp");
	} else {
		throw new Exception("DB 삭제 오류 발생!");
	}
}
// [장바구니 함 이동]
if (action.equals("basket")) {
	// 비회원이 장바구니함에 접속한다면 → 뒤로가기
	if (session.getAttribute("memberVO") == null) {
		out.println("<script>alert('회원 이용만 가능합니다.'); history.go(-1); </script>");
		return;
	}
	pageContext.forward("basket.jsp");
}
// [장바구니 추가]
if (action.equals("basketAdd")) {
	// 비회원이 장바구니 담기 버튼을 클릭시 → 뒤로가기
	if (session.getAttribute("memberVO") == null) {
		out.println("<script>alert('회원 이용만 가능합니다.'); history.go(-1); </script>");
		return;
	}

	// basketList에 저장된 데이터가 없다면(== 최종생성이라면)
	if (basketList.size() == 0) {
		basketList = new ArrayList<ProductVO>(); //객체화
		session.setAttribute("basketList", basketList); // session 재설정
	}

	// 사용자가 선택한 구매개수 변수에 저장
	int buyCnt = Integer.parseInt(request.getParameter("buyCnt"));

	// 사용자가 선택한 물품인 pnum으로 모든 데이터를 받아옴(상품명, 재고 등)
	productVO = productDAO.productData(productVO);

	// DB에 저장된 상품의 재고량이 더 적다면, 뒤로가기(==재고부족)
	if (buyCnt > productVO.getCnt()) {
		out.println("<script>alert('선택제품의 재고수량이 부족하여 주문이 불가합니다.'); history.go(-1);</script>");
		return;
	}
	// 위에서 return이 되지 않았으면
	// 데이터를 받아온 객체에 → 사용자 구매개수를 set
	productVO.setCnt(buyCnt);

	// 장바구니List에 → 사용자가 선택한 물품 add
	basketList.add(productVO);

	// 알림창으로 사용자 안내 후, 뒤로가기
	out.println("<script>alert('정상적으로 바구니에 담았습니다!'); history.go(-1);</script>");

}
// [장바구니 단일삭제]
if (action.equals("basketDelete")) {
	// 선택한 상품의 index를 parameter로 받아 변수에 저장
	int index = Integer.parseInt(request.getParameter("index"));
	// 해당 index로 장바구니List을 remove
	basketList.remove(index);
	// 본페이지(control.jsp)에서 → 메인페이지로 이동
	response.sendRedirect("control.jsp?action=list");
}
//[결제하기]
if (action.equals("pay")) {
	// forEach - 장바구니에 담은 상품만큼 반복
	for (ProductVO vo : (ArrayList<ProductVO>) basketList) {
		ProductVO data = new ProductVO(); // 임시 data - 인스턴스화
		data.setPnum(vo.getPnum()); // 상품의 pnum을 data에 저장
		data = productDAO.productData(data); // DAO를 통해 데이터 정보를 모두 받아옴

		// 결제한 재고수량 차감 (현재 DB재고에서 - 사용자가 구매한 수량)
		data.setCnt(data.getCnt() - vo.getCnt());

		// 재고 UPDATE
		boolean payApply = productDAO.productUpdate(data);

		// 반영결과 request로 전송
		request.setAttribute("payApply", payApply);

		// 재고업데이트 == 구매완료
		if (payApply) {
	session.removeAttribute("basketList"); // 구매한 장바구니의 데이터 삭제
	pageContext.forward("buyApply.jsp");
		} else {//구매실패
	System.out.println("update실패");
	throw new Exception("프로그램에 이상이 발견되었습니다!");
		}
	}
}
//관리자 - 상품 추가
if (action.equals("ADInsert")) {
	// 상품 등록이 되었다면,
	if (productDAO.productInsert(productVO)) {
		//다시 본페이지로 이동
		response.sendRedirect("control.jsp?action=list");
	} else {
		throw new Exception("관리자 상품추가 오류 발생!");
	}
}
// 관리자 - 상품 삭제
if (action.equals("ADDelete")) {
	// delete 수행(PK인 pnum으로 상품 삭제가능!)
	if (productDAO.productDelete(productVO)) {
		//다시 본페이지로 이동
		response.sendRedirect("control.jsp?action=list");
	} else { // 오류가 발생되어 delete 수행되지않았다면, errorPage이동
		throw new Exception("관리자 상품삭제 오류 발생!");
	}
}
// 관리자 - 상품 변경
if (action.equals("ADUpdate")) {
	// update 수행
	if (productDAO.productUpdate(productVO)) {
		//다시 본페이지로 이동
		response.sendRedirect("control.jsp?action=list");
	} else { // 오류가 발생되어 update 수행되지않았다면, errorPage이동
		throw new Exception("관리자 상품변경 오류 발생!");
	}
}
%>