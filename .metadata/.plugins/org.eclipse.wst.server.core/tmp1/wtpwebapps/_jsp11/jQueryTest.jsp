<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="aa"></div>
<h1></h1>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script>
$(function(){
	var list = ['123', '<h2>3.45</h2>', '테스트', '2023년1월'];
	console.log(list);
	$("h1").html(list);
});
</script>
</body>
</html>




