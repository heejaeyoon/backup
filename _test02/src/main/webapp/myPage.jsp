<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function del(){
			result = confirm("정말 회원탈퇴를 하시겠습니까?"); //alert(알림창), confirm(선택창) 
			if(result==true){
				document.form1.action.value="myPageDelete"; 
				document.form1.submit();
			}
			else{//아무일도 일어나지않음
				return;
			}
			
		}
	</script>

    <div class="row justify-content-center">
            <div class="col-md-8 col-lg-5 text-center mb-3">
              <h3 class="text-danger">마이페이지</h3>
            </div>
          </div>


	<form action="control.jsp" method="post" name="form1">
	<input type="hidden" name="action" value="myPageUpdate">
	<input type="hidden" name="mnum" value="${memberVO.mnum}">
		<section class="py-7" id="services" container-xl="container-xl">
        <div class="container">
          <div class="row h-100 justify-content-center">
            <!--  -->
            <div class="col-md-4 pt-4 px-md-2 px-lg-3">
              <div class="card h-100 px-lg-5 card-span">
                <div class="card-body d-flex flex-column justify-content-around">
                	<br><br><br>
                   <h6>아이디  ${memberVO.userID }</h6>
                   <br>
			           <h6>비밀번호 변경</h6>
			           <input type="password" maxlength="20" name="userPW" value="${memberVO.userPW}" required>
                  <br>
                    <br><br>
		                <h6>성명</h6>
		                <input type="text" maxlength="30" name="userName" value="${memberVO.userName}" required>
                  <div class="text-center my-5">
                    <div class="d-grid">
                      <input type="submit" value="수정" class="btn btn-danger hover-top btn-glow border-0">
                      <br>
                      <button class="btn btn-danger hover-top btn-glow border-0" onClick="del()">회원탈퇴</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <!-- // -->
           </div>
           </div>
           </section>
   </form>


</body>
</html>