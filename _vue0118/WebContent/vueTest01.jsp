<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<head>
    <title>Vue.js sample</title>
    <link rel="stylesheet" href="style.css" >
    <script src="https://cdn.jsdelivr.net/npm/vue@2.5.17/dist/vue.js"></script>
</head>
<body>
<div id="app">
    <p> {{ myText }} </p>
    <p v-text="myText"></p>
    <p v-html="myText"></p>
</div>
<script>

    new Vue({
        el: '#app',
        data: {
            myText: '<h2>hello</h2>' 
        }
    })
</script>
</body>
</html>