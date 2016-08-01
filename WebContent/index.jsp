<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
	<html lang="en">
	<head>
	<style>
	body{
	background-image: url('${img}/host.jpg');
	background-size : 700px 700px
	}
	.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
#center { position:absolute; top:70%; left:50%; width:400px; height:400px; overflow:hidden; 
	</style>
		<meta charset="UTF-8" />
		<title>호스팅 등록시작하기!!!</title>
	</head>
	<body>
	
	<div id = center>
		
		<a href="${context}/hosting.jsp" class="button" >Start</a>
			
		</div>
	</body>
	</html>