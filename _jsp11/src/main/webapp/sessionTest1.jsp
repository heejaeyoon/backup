<%@page import="jdbc.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Dept dept = new Dept(10, "test", "SEOUL");
session.setAttribute("tt", dept);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=dept.getDeptno() %>
<%=dept.getDname() %>
<%=dept.getLoc() %>
</body>
</html>