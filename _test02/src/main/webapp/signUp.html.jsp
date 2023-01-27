<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form class="row" name="join" id="join" method="post"
	action="control.jsp">
	<input type="hidden" name="action" value="signup">
	<div class="mb-3">
		<label class="form-label visually-hidden" for="inputName">성명</label> <input
			class="form-control form-quriar-control joinCheck" id="inputName"
			type="text" name="userName" placeholder="성함을 입력하세요." required
			maxlength="10" />
	</div>

	<div class="mb-3">
		<label class="form-label visually-hidden" for="inputName">ID</label> <input
			class="form-control form-quriar-control joinCheck" id="inputName"
			type="text" name="userID" placeholder="아이디를 입력하세요." required
			minlength="4" maxlength="10" />
	</div>

	<div class="mb-3">
		<label class="form-label visually-hidden" for="inputName">PW</label> <input
			class="form-control form-quriar-control joinCheck  " id="inputName"
			type="password" name="userPW" placeholder="비밀번호를 입력하세요." required
			minlength="4" maxlength="10" />
	</div>

	<span id="consentBox">
		<h5>개인정보 처리방침</h5> <!-- 개인정보 방침 text 중략 -->
	</span> <span> <label class="select" id="check"> <input
			type="radio" id="agree" value="check" name="select">동의
	</label> <label class="select" id="noneCheck"> <input type="radio"
			value="noneCheck" name="select" checked="checked">비동의
	</label>
	</span>
	<div class="d-grid">
		<button class="btn btn-primary" type="submit">
			회원가입<i class="fas fa-paper-plane ms-2"></i>
		</button>
	</div>
</form>
</body>
</html>