<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

#center {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 370px;
	height: 600px;
	overflow: hidden;
	margin-top: -300px;
	margin-left: -150px;
}

form {
	border: 3px solid #f1f1f1;
	width: 360px;
}

input[type=text], input[type=password] {
	width: 340px;
	height: 10px;
	padding: 10px 10px;
	margin: 2px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

/* button {
    background-color:#f44336 ;
    color: white;
    padding: 10px 10px;
    margin: 2px 0;
    border: none;
    cursor: pointer;
    width: 300px;
} */
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
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
<div id="center">
		<h2>회원 정보 수정</h2>
	<form action="${context}/member.do" method="post">
	<label><b>Password</b></label> 
	<input type="password" placeholder="Enter password" name="pw"><br> 
	<label><b>Phone</b></label>
	<input type="text" placeholder="phone" name="phone" value="${user.phone}"><br>
	<label><b>Email</b></label> 
	<input type="text" placeholder="email" name="email" value="${user.email}"><br> 
	<label><b>주소</b></label><br> 
	<input type="text" placeholder="서울특별시" name="city" style="width: 100px;">
	<input type="text" placeholder="서대문구" name="gu" style="width: 100px;"> 
	<input type="text" placeholder="홍은동" name="dong" style="width: 100px;"> 
	<input type="text" placeholder="나머지 주소" name="bunji" style="width: 340px;"> <br>
	<label><b>자기 소개서</b></label> 
	<input type="text" placeholder="자기 소개" name="intro" style="height: 60px; width: 340px;" value="${user.intro}"><br> 
	<input type="hidden" name="action" value="update">
	<input type="submit" value=" 수정" style="height: 30px; width: 120px;" />
	 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
	<input type="reset" value="취소" style="height: 30px; width: 120px;" /><br> <br> 
	</form>
	
	<label><b>회원 탈퇴 </b></label>
	<form action="${context}/member.do" method="post"> 
	<input type="password" placeholder="비밀 번호를 다시한번 입력하세요" name="pw" /><br>
	<input type="hidden" name="action" value="delete">
	<div class="container" style="background-color: #f1f1f1">
	<button type="subject" class="cancelbtn" style="width: 320px;">회원탈퇴 </button>
	</div>
	</form>
	</div>
	<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>
