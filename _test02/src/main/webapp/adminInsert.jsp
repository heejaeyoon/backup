<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="control.jsp" >
 	  	    <input type="hidden" name="action" value="ADInsert">
            <div class="col-md-4 pt-4 px-md-2 px-lg-3">
              <div class="card h-100 px-lg-5 card-span">
                <div class="card-body d-flex flex-column justify-content-around">
                  <div class="text-center pt-5">
                  <ul class="list-unstyled">
                  <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span>상품명: <input type="text" name="pName" required></li>
                    <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span>금액: <input type="text" name="price" required></li>
                    <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span>재고개수: <input type="text" name="cnt" required></li>
                  </ul>
                  <div class="text-center my-5">
                    <div class="d-grid">		
                      
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <button class="btn btn-danger hover-top btn-glow border-0" value="check" type="submit">추가하기</button>
            <!-- // -->	  
 	 	 	</form>

</body>
</html>