<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Web Programming</h1>
	<input id="in" /><button id="btn">클릭</button>
	<ul id="itemList">
		<li>HTML</li>
		<li>CSS</li>
		<li>JS</li>
	</ul>
<script>
btn.addEventListener("click", function() {
	  var inT = document.getElementById("in").value;
	  var txNode = document.createTextNode(inT);
	  var newLi = document.createElement("li");deqas
	  newLi.appendChild(txNode);
	  var orgLi = document.getElementById("itemList");
	  orgLi.appendChild(newLi);
	});
// var newP = document.createElement("li")
// var txNode = document.createTextNode("테스트");
// newP.appendChild(txNode);
// document.getElementById("itemList").appendChild(newP);

</script>
</body>

</html>