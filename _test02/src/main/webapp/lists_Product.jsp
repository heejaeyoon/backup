<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, model.product.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

<!--/////////////////// 회원메뉴바 - 커스텀태그 호출 ////////////////-->
<product:product_mem />
<!-- // -->

<!--//////////////////// 비회원메뉴바 - 커스텀태그 호출 //////////////-->
<product:product_noMem />
<!-- //  -->
<!-- ////////////////////////////////////////////////////////////////////// -->
<!-- 상품목록 forEach출력///////////////////////////////////////////////////// -->
<!-- ////////////////////////////////////////////////////////////////////// -->
<c:forEach var="vo" items="${productList}">
	<!--  -->
	<div class="col-md-4 pt-4 px-md-2 px-lg-3">
		<div class="card h-100 px-lg-5 card-span">
			<div class="card-body d-flex flex-column justify-content-around">
				<div class="text-center pt-5">
					<h5 class="my-4">${vo.pName}</h5>
				</div>
				<ul class="list-unstyled">
					<li class="mb-2"><span class="me-2"><i
							class="fas fa-circle text-primary" style="font-size: .5rem">
						</i></span>${vo.price} 원</li>
					<li class="mb-2"><span class="me-2"><i
							class="fas fa-circle text-primary" style="font-size: .5rem">
						</i></span>재고 ${vo.cnt } 개</li>
				</ul>
				<div class="text-center my-5">
					<div class="d-grid">
						<form action="control.jsp" method="post" name="form1">
							<input type="hidden" name="action" value="basketAdd">
							<!-- <input type="hidden" name="action" value="buy"> -->
							<input type="hidden" name="pnum" value="${vo.pnum }"> <input
								type="number" value="1" name="buyCnt" required>
							<button class="btn btn-danger hover-top btn-glow border-0"
								value="check" type="submit">장바구니 담기</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- // -->
	
</c:forEach>
</body>
</html>