<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.ArrayList,model.Ordermember.*, model.review.*"
	errorPage="errorPage.jsp"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="ordermemberDAO"
	class="model.Ordermember.OrderMemberDAO" />
<jsp:useBean id="reviewDAO" class="model.review.ReviewDAO" />

<jsp:useBean id="ordermemberVO" class="model.Ordermember.OrderMemberVO"
	scope="session" />
<jsp:setProperty property="*" name="ordermemberVO" />

<jsp:useBean id="reviewVO" class="model.review.ReviewVO" />
<jsp:setProperty property="*" name="reviewVO" />

<%     
	String action = request.getParameter("action");

//login.jsp에서 받아옴
// 로그인이 완료되면 선택된 모드에 따라 페이지 이동 
if(action.equals("loginCheck")){// 로그인 성공
	if(ordermemberDAO.loginCheck(ordermemberVO)){
		// 소비자or점주 사용자가 선택한 모드를 가져옴
 		String mod = request.getParameter("mod");

 			// 사용자 계정 저장 - (세션단위)
			// userID로 모든 속성의 데이터를 받아옴
			ordermemberVO = ordermemberDAO.memSelectOne(ordermemberVO);	 			
			session.setAttribute("ordermemberVO", ordermemberVO);//set->set..?

 			if(mod.equals("소비자")){	 				
 				// 주 페이지 이동
 				response.sendRedirect("control.jsp?action=list");	
 			}
 			else if(mod.equals("점주")){
 				pageContext.forward("admin.jsp");
 			}
 		
	}
	// 로그인 실패
	else{
		out.println("<script>alert('로그인에 실패하였습니다.'); history.go(-1); </script>");
		}


// 리뷰 주 페이지 이동(list)
if(action.equals("list")){
	// 전체 리뷰
	// 리뷰 목록을 주기위해 datas 파라미터 전송~
	ArrayList<ReviewVO> datas = reviewDAO.RVSelectAll();
	request.setAttribute("datas", datas); 	
	pageContext.forward("lists_review.jsp");
	}

// 회원가입 데이터 생성
if(action.equals("signup")){
	boolean signup = ordermemberDAO.memInsert(ordermemberVO);
	request.setAttribute("signup", signup);
	pageContext.forward("signupApply.jsp");	
	
	}
if(signup){
    %>
<h2 class="text-danger">고객님!</h2>
<h2>회원가입이 완료되었습니다. :D</h2>
</div>
<div class="col-12">
	<div class="card card-span rounded-2 mb-3">
		<div class="row"></div>
	</div>
</div>
<div class="text-center">
	<a class="text-light" href="login.jsp"><button
			class="btn btn-primary px-5">
			<i class="fas fa-phone-alt me-2"></i>로그인 이동
		</button></a> <br> <br> <br> <a class="text-light" href="index.html"><button
			class="btn btn-primary px-5">
			<i class="fas fa-phone-alt me-2"></i>처음으로
		</button></a>
</div>
</div>
</div>
<%
		}
		else {
	%>
<h2 class="text-danger">고객님!</h2>
<h2>중복된 아이디가 있어 가입 진행이 불가합니다.</h2>
</div>
<div class="col-12">
	<div class="card card-span rounded-2 mb-3">
		<div class="row"></div>
	</div>
</div>
<div class="text-center">
	<a class="text-light" href="signUp.html"><button
			class="btn btn-primary px-5">
			<i class="fas fa-phone-alt me-2"></i>회원가입 이동
		</button></a> <br> <br> <br> <a class="text-light" href="index.html"><button
			class="btn btn-primary px-5">
			<i class="fas fa-phone-alt me-2"></i>처음으로
		</button></a>
</div>
</div>
</div>


<%
		}
	
%>


