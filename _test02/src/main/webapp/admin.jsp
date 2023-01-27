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
	function ADdelete(){
		console.log(document.form1.action);
		document.form1.action.value="ADdelete";
		document.form1.submit();
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
                <!-- 검색 -->
                <form action="control.jsp" method="post">
                  <input type="hidden" name="action" value="search">
                  <input class="form-control border-200" name="search" type="search" placeholder="Search" aria-label="Search" style="background:#FDF1DF;" />
                </form>
              </div>
            </div><a class="btn btn-primary order-1 order-lg-0 ms-lg-3" href="adminInsert.jsp">
            	상품추가</a> <!-- 상품 추가 -->


 		<!-- ////////////////////////////////////////////////////////////////////// -->
 		<!-- 상품목록 forEach출력///////////////////////////////////////////////////// -->
 		<!-- ////////////////////////////////////////////////////////////////////// -->
 	  <c:forEach var="vo" items="${productList}">
 	  	    <!--  -->
 	  	    <form action="control.jsp" >
 	  	    <input type="hidden" name="action" value="ADUpdate">
 	  	    <input type="hidden" name="pnum" value="${vo.pnum }">
            <div class="col-md-4 pt-4 px-md-2 px-lg-3">
              <div class="card h-100 px-lg-5 card-span">
                <div class="card-body d-flex flex-column justify-content-around">
                  <div class="text-center pt-5">
                    <input type="text" name="pName" value="${vo.pName}" required>  
                    <a href="control.jsp?action=ADDelete&pnum=${vo.pnum }"><img id="ADdeleteBtn" src="assets/img/deleteBtn.png" /></a>
                  </div>
                  <ul class="list-unstyled">
                    <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span><input type="text" name="price" value="${vo.price}" required>원</li>
                    <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span><input type="text" name="cnt" value="${vo.cnt }"> 개</li>
                  </ul>
                  <div class="text-center my-5">
                    <div class="d-grid">		
                      
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <button class="btn btn-danger hover-top btn-glow border-0" name="oneProduct" value="check" type="submit">수정하기</button>
            <!-- // -->	  
 	 	 	</form>
 	  </c:forEach>

</body>
</html>