<%@page import="jdbc.Emp"%>
<%@page import="jdbc.EmpDeptDao"%>
<%@page import="org.apache.jasper.compiler.JavacErrorDetail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	EmpDeptDao edd = EmpDeptDao.getInstance();
	String empnoS = request.getParameter("empno");
	String mgrS = request.getParameter("mgr");
	String salS = request.getParameter("sal");
	String commS = request.getParameter("comm");
	String deptnoS = request.getParameter("deptno");
	
	int emp = Integer.parseInt(request.getParameter(empnoS);
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	int mgr = Integer.parseInt(request.getParameter(mgrS);
	String hiredete = request.getParameter("hiredate");
	int sal = Integer.parseInt(request.getParameter(salS);
	int comm = Integer.parseInt(request.getParameter(commS);
	int deptno = Integer.parseInt(request.getParameter(deptnoS);
	
	try {
		int emp = Integer.parseInt(request.getParameter(empnoS);
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		int mgr = Integer.parseInt(request.getParameter(mgrS);
		String hiredete = request.getParameter("hiredate");
		int sal = Integer.parseInt(request.getParameter(salS);
		int comm = Integer.parseInt(request.getParameter(commS);
		int deptno = Integer.parseInt(request.getParameter(deptnoS);
		
		Emp emp = new Emp(empno,ename,job,mgr,hiredate,sal,comm,deptno);
		int result = edd.insertEmpTemp(emp)
		out.println(result+"")		
	} catch(java.lang.NumberFormatException e){
		int emp = 0;
		String ename = request.getParameter("ename");
		String job = request.getParameter("job");
		int mgr = 0;
		String hiredete = request.getParameter("hiredate");
		int 0;
		int 0;
		int 0;
	}
	

%>
</body>
</html>