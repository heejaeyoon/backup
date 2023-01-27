<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- control.jsp로 action=login 파라미터가 보내지며, -->
	<!-- 사용자 데이터는 userID, userPW, mod가 보내짐 -->

	<form class="row" name="form1" method="post" action="control.jsp">
		<input type="hidden" name="action" value="login">
		<div class="mb-3">
			<label class="form-label visually-hidden" for="inputName">ID</label>
			<input class="form-control form-quriar-control" id="userID"
				type="text" name="userID" placeholder="아이디를 입력하세요." required
				minlength="4" maxlength="10" />
		</div>
		<div class="mb-3">
			<label class="form-label visually-hidden" for="inputName">PW</label>
			<input class="form-control form-quriar-control" id="userPW"
				type="password" name="userPW" placeholder="비밀번호를 입력하세요." required
				minlength="4" maxlength="10" />
		</div>
		<div class="d-grid">
			<button class="btn btn-primary" type="submit">
				로그인 하기<i class="fas fa-paper-plane ms-2"></i>
			</button>
		</div>
	</form>
	<br>
	<!-- 회원가입 페이지 이동(클릭시) -->
	<div class="d-grid">
		<a href="signUp.html"><button class="btn btn-primary"
				id="signUpBtn">
				회원가입 하기<i class="fas fa-paper-plane ms-2"></i>
			</button></a>
	</div>

</body>
</html>