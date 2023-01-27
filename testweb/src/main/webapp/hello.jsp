<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
연습입니다.
<%
	for(int i = 0; i<10; i++ ){
	out.println("<h1>JSP 연습</h1>");
	out.println(LocalTime.now());
	}
	
%>
</body>
</html>