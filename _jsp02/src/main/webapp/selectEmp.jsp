<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<%
	int x = Integer.parseInt(request.getParameter("deptno"));
	Class.forName("oracle.jdbc.OracleDriver");
	out.println("드라이버 로딩");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user	= "SCOTT";
	String password = "tiger";
	Connection conn = DriverManager.getConnection(url, user, password);
	out.println("DB 연결");
	
	String sql = "select * from emp where deptno = ?";
	PreparedStatement pstm = conn.prepareStatement(sql);
	pstm.setInt(1,x);
	ResultSet rs = pstm.executeQuery();
	
	while(rs.next()){ %>
	<tr><td><%= rs.getInt("empno")	%></td>
	<td><%= rs.getString("ename") %></td>
	<td><%=	rs.getString("job")	%></td>
	<td><%=	rs.getString("deptno")	%></td>
	<td><%= rs.getInt("sal") %></td></tr>
	

<%	
}	
%>
</table>


</body>
</html>