<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
#logincenter { position:absolute; top:50%; left:50%; width:50%; height:50%; overflow:hidden; 
 margin-top:-220px; margin-left:-150px;}
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

#container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" /><br><br><br>
<div id="logincenter">
<h2>Login</h2>
<form action="${context}/member.do" method="post">
  <div id="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="id" required><br>
    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pw" required><br>     
    <input type="hidden" name="action" value="login">
   <button type="submit">Login </button>
  </div>
  <div id="container" style="background-color:#f1f1f1">
  <button type="button" class="cancelbtn"><a href="${context}/member.do?page=regist">Create an Account</button>
  </div>
</form>
</div>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>