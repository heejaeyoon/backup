<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="vo" class="board.BoardVo"/>
<jsp:useBean id="dao" class="board.BoardDao"/>
<jsp:setProperty name="vo" property="*"/>
<%
	request.setCharacterEncoding("utf-8");
%>
<%
	dao.insert(vo);

// response.sendRedirect(request.getContextPath() + "/board/list.jsp"); <- 아래의 <c:redirect 의 코드와 동일>
%>

<c:redirect url ="${pageContext.request.contextPath}/list.jsp"></c:redirect>