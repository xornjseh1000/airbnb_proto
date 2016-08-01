<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<form  action="login.jsp">
<div id="center">
<h1>회원 가입</h1>

&nbsp;&nbsp;I&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;D: <input  type="text" placeholder="id" value=""><br>
&nbsp;&nbsp;Password: <input type="text" placeholder="Password" value=""><br>
&nbsp;&nbsp;Name&nbsp;&nbsp;&nbsp;&nbsp;    : <input type="text" placeholder="Name" value=""><br>
&nbsp;&nbsp;Gender&nbsp;&nbsp;&nbsp;&nbsp;  : <input type="text" placeholder="성별" value=""><br>
&nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   : <input type="text" placeholder="이에밀 주소" value=""><br>
&nbsp;&nbsp;Birth&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   : <input type="text" placeholder="1900-01-01" value=""><br>
&nbsp;&nbsp;phone&nbsp;&nbsp;&nbsp;&nbsp;   : <input type="text" placeholder="010-0000-0000" value=""><br>
&nbsp;&nbsp;Address&nbsp;&nbsp;&nbsp;: <input type="text" placeholder="주소" value=""><br>
&nbsp;&nbsp;Intro&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   : <input type="text" placeholder="자기 소개" value=""><br>
&nbsp;&nbsp;SNS&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" placeholder="관련 SNS" value=""><br>
&nbsp;&nbsp;profileImg: <input type="text" placeholder="소개 이미지" value=""><br>



<br>
<center><input type="submit" value="Submit">
</center></div>
</form>

</body>


</html>