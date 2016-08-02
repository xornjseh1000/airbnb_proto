<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<style>
body { margin-left: 0px; margin-top: 0px; margin-right: 0px; margin-bottom: 0px; }
#center { position:absolute; top:50%; left:50%; width:380px; height:600px; overflow:hidden; 
 margin-top:-300px; margin-left:-150px;}
form {
    border: 3px solid #f1f1f1;
    width: 360px;
}

input[type=text], input[type=password] {
    width: 300px;
    padding: 10px 10px;
    margin: 2px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color:#f44336 ;
    color: white;
    padding: 10px 10px;
    margin: 2px 0;
    border: none;
    cursor: pointer;
    width: 300px;
}

.cancelbtn {
    width: 300px;
    padding: 10px 10px;
    background-color: #4CAF50;
}

.imgcontainer {
    text-align: center;
    margin: 5px 0 5px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 10px;
}

span.psw {
    float: right;
    padding-top: 10px;
}
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 400px;
    }
}
</style>
<body>
<div id="center">
<h2>회원 가입 </h2>
<form action="${context}/member.do" method="post">
  <div class="container">
   <label><b>ID</b></label><br>
    <input type="text" placeholder="Enter ID" name="id" required><br>
  
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="name" required><br>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pw" required><br>
     <label><b>Email</b></label>
    <input type="text" placeholder="email" name="email" required><br>

    <label><b>생년월일</b></label>
    <input type="text" placeholder="year" name="year" required>
    <input type="text" placeholder="month" name="month" required>
    <input type="text" placeholder="day" name="day" required>
    <br>
  	<input type="hidden" name="action" value="regist">
    <input type="submit" value="회원가입"><br>
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
  <button type="button" class="cancelbtn"><a href="${context}/member.do?page=login">Login</button>
   
  </div>
</form>
</div>
</body>
</html>