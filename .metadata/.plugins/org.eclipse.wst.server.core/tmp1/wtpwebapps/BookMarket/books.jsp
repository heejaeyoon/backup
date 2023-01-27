<%@page import="dto.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dao.BookRepository"%>   
<!DOCTYPE html>
<html>
<head>
<link rel="Stylesheet" href="./resources/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>도서 목록</title>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서 목록</h1>
			
		</div>
	</div>
	<%
		BookRepository dao = BookRepository.getInstance();
		ArrayList<Book> listofBooks = dao.getAllBooks();
	%>
	<div class="container">
		<%
			for(int i=0; i< listofBooks.size(); i++){
				Book book = listofBooks.get(i);
		%>
		<div class="row">
			 <div class="col-md-3" align="center">
			 	<img src="c:/upload/<%=book.getFilename()%>" style="width: 50%">
			 </div>
			 <div class="col-md-7">
				<p><h5><b>[<%=book.getCategory()%>] <%=book.getName()%></b></h5>
				<p style="padding-top: 20px"><%=book.getDescription().substring(0, 100)%>...
				<p><%=book.getAuthor()%> | <%=book.getPublisher()%> | <%=book.getUnitPrice()%>원
			</div>
			<div class="col-md-2" style="padding-top: 70px">
			<a><a href="./book.jsp?id=<%=book.getBookId()%>"
					class="btn btn-secondary" role="button">상세정보 &raquo;</a>
		</div>
	</div>
	<hr>
		<%
			}
		%>
		
	</div>	
	<jsp:include page="footer.jsp" />
</head>
<body>

</body>
</html>