<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
// 결제 여부 재확인
	function buy(){
		result = confirm("결제를 진행하시겠습니까?");
		if(result==true){
			document.form1.submit();
		}
		else{
			return;
		}
	}
</script>        

          <!-- 메뉴바 -->
          <ul class="navbar-nav ms-auto pt-2 pt-lg-0 font-base">
                          <li class="nav-item px-2"><a class="nav-link" aria-current="page" href="control.jsp?action=logout">
              	로그아웃</a></li> <!-- 로그아웃 -->
            </ul>
            <div class="dropdown d-none d-lg-block">
              <button class="btn bg-soft-warning ms-2" id="dropdownMenuButton1" type="submit" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-search text-warning"></i></button>
              <div class="dropdown-menu dropdown-menu-lg-end p-0 rounded" aria-labelledby="dropdownMenuButton1" style="top:55px">
                <form action="control.jsp" method="post">
                  <!-- 검색 -->
                  <input type="hidden" name="action" value="search"> 
                  <input class="form-control border-200" name="search" type="search" placeholder="Search" aria-label="Search" style="background:#FDF1DF;" />
                </form>
              </div>
            </div><a class="btn btn-primary order-1 order-lg-0 ms-lg-3" href="control.jsp?action=mypage">
            	마이페이지</a> <!-- 마이페이지 -->


		    <!--////////////// 커스텀태그 호출  ////////////////-->
		    <basket:basket/> 
		    <!-- //////////////////// -->


</body>
</html>