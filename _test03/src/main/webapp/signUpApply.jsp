<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ordermemberVO" class="model.Ordermember.OrderMemberVO" scope="session"/>
<jsp:useBean id="datas" class="java.util.ArrayList" scope="request"/>

<li class="nav-item px-2"><a class="nav-link" aria-current="page" href="control.jsp?action=logout">
              	로그아웃</a></li>
<li class="nav-item px-2"><a class="nav-link" href="insert_review.jsp?onum=<%=ordermemberVO.getOnum()%>">
              	리뷰작성</a></li>

<!-- 검색 -->
<form action="control.jsp" method="post">
  <input type="hidden" name="action" value="search">
  <input class="form-control border-200" name="search" type="search" placeholder="Search" aria-label="Search" style="background:#FDF1DF;" />
</form>

<a class="btn btn-primary order-1 order-lg-0 ms-lg-3" href="control.jsp?action=userreview&onum=<%=ordermemberVO.getOnum()%>">
            	내 리뷰보기</a>

<!-- 중략 -->

<%	for(ReviewVO vo : (ArrayList<ReviewVO>) datas){
	
	%>
            <div class="col-md-4 pt-4 px-md-2 px-lg-3">
              <div class="card h-100 px-lg-5 card-span">
                <div class="card-body d-flex flex-column justify-content-around">
                  <div class="text-center pt-5">
                    <h5 class="my-4"><%=vo.getTitle() %></h5>
                  </div>
                  <ul class="list-unstyled">
                    <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span><%= vo.getWriter() %></li>
                    <li class="mb-2"><span class="me-2"><i class="fas fa-circle text-primary" style="font-size:.5rem">
                    </i></span><%=vo.getWdate() %></li>
                  </ul>
                  <p><%=vo.getContent() %></p>
                  <div class="text-center my-5">
                    <div class="d-grid">
                      <button class="btn btn-danger hover-top btn-glow border-0" type="submit">Learn more</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
<%

	}
%>           
</body>
</html>