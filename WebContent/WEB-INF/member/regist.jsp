<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body { margin-left: 0px; margin-top: 0px; margin-right: 0px; margin-bottom: 0px; }
#center { position:absolute; top:50%; left:50%; width:400px; height:400px; overflow:hidden; 
background-color:#FC0; margin-top:-150px; margin-left:-200px;}
input {text-align:center;}
h1 {text-align:center;}
</style>
</head>
<body>
<form action="${context }/member.do" method="post">
<div id="center">
<h1>회원 가입</h1>
&nbsp;&nbsp;I&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D: <input type="text" placeholder="id" name="id"><br>
&nbsp;&nbsp;Password: <input type="text" placeholder="Password" name="pw"><br>
&nbsp;&nbsp;Name&nbsp;&nbsp;&nbsp;&nbsp;    : <input type="text" placeholder="Name" name="name"><br>
&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   : <input type="text" placeholder="이메일 주소" name="email"><br>
&nbsp;&nbsp;Birth&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   : <input type="text" placeholder="1900-01-01" name="birth"><br>
<input type="hidden" name="action" value="regist">
<input type="submit" value="회원가입">
</div>
</form>
</body>
</html>