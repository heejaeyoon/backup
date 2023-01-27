<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- control.jsp로 actiom:loginChck 파라미터가 보내지며, -->
	<!-- 사용자 데이터는 userID, userPW, mod가 보내짐 -->

	<!-- 사용자 작성부분 -->
	<form class="row" name="form1" method="post" action="control.jsp">
		<input type="hidden" name="action" value="loginCheck">
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
		<div class="mb-3">
			<label class="form-label visually-hidden" for="inputName">고객선택</label>
			<span class="memberSelect"><input type="radio" name="mod"
				value="소비자" checked />소비자</span> <span class="memberSelect"><input
				type="radio" name="mod" value="점주" />점주</span>
		</div>
		<div class="d-grid">
			<button class="btn btn-primary" type="submit">
				로그인 하기<i class="fas fa-paper-plane ms-2"></i>
			</button>
		</div>
	</form>
	<div class="d-grid">
		<a href="signUp.html"><button class="btn btn-primary signUpBtn"
				type="submit">
				회원가입 하기<i class="fas fa-paper-plane ms-2"></i>
			</button></a>
	</div>
	<!-- <div class="d-grid">
                  <a href="memberList.jsp"><button class="btn btn-primary signUpBtn" type="submit">가입내역 확인<i class="fas fa-paper-plane ms-2"></i></button></a>
                </div> -->

	<form class="row" name="join" id="join" method="post"
		action="control.jsp">
		<input type="hidden" name="action" value="signup">
		<div class="mb-3">
			<label class="form-label visually-hidden" for="inputName">성명</label>
			<input class="form-control form-quriar-control joinCheck"
				id="inputName" type="text" name="userName" placeholder="성함을 입력하세요."
				required maxlength="10" />
		</div>

		<div class="mb-3">
			<label class="form-label visually-hidden" for="inputName">ID</label>
			<input class="form-control form-quriar-control joinCheck"
				id="inputName" type="text" name="userID" placeholder="아이디를 입력하세요."
				required minlength="4" maxlength="10" />
		</div>

		<div class="mb-3">
			<label class="form-label visually-hidden" for="inputName">PW</label>
			<input class="form-control form-quriar-control joinCheck  "
				id="inputName" type="password" name="userPW"
				placeholder="비밀번호를 입력하세요." required minlength="4" maxlength="10" />
		</div>

		<span id="consentBox">
			<h5>개인정보 처리방침</h5> <br> <!-- 중략: 개인정보처리 텍스트 -->
		</span> <span> <label class="select" id="check"> <input
				type="radio" id="agree" value="동의" name="select">동의
		</label> <label class="select" id="noneCheck"> <input type="radio"
				value="비동의" name="select" checked="checked">비동의
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