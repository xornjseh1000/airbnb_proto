<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body { margin-left: 0px; margin-top: 0px; margin-right: 0px; margin-bottom: 0px; }
#center { position:absolute; top:50%; left:50%; width:300px; height:100px; overflow:hidden; 
background-color:#FC0; margin-top:-150px; margin-left:-100px;}
input {text-align:center;}
</style>
</head>
<body>

<form  action="${context}/member.do" mathod="post">
<div id="center">
<center>ID: <input style="center" type="text" placeholder="id" name="id"></center>
Password: <input type="text" placeholder="Password" name="pw"><br><br>
<input type="hidden" name="action" value="login">
<center><input type="submit" value="로그인"><button type="button" ><a href="${context}/member.do?page=regist">회원 가입</button></center></a></div>
</form>

</body>


</html>