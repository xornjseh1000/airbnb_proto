<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<style>
body { margin-left: 0px; margin-top: 0px; margin-right: 0px; margin-bottom: 0px; }
#center { position:absolute; top:50%; left:50%; width:400px; height:500px; overflow:hidden; 
 margin-top:-150px; margin-left:-150px;}
form {
    border: 3px solid #f1f1f1;
    width: 350px;
}

input[type=text], input[type=password] {
    width: 300px;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 300px;
}

.cancelbtn {
    width: 300px;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
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
<h2>Login </h2>

<form action="${context}/member.do" method="post">
  <div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="id" required><br>
    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pw" required><br>     
    <input type="hidden" name="action" value="login">
    <input type="submit" value="로그인"><br>
  </div>
  <div class="container" style="background-color:#f1f1f1">
  <button type="button" class="cancelbtn"><a href="regist.jsp ">회원가입</button>
   
  </div>
</form>
</div>
</body>
</html>
