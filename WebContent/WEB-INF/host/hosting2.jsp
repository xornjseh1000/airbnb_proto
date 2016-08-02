<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>호스팅2</title>
</head>
<style>
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 16px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    cursor: pointer;
}
.button2 {
    background-color: white;
    color: black;
    border: 2px solid #008CBA;
}

.button2:hover {
    background-color: #008CBA;
    color: white;
}
div{   height: 200px;
    width: 60%;
    background-color: powderblue;
}
#center { position:absolute; top:10%; left:30%; width:500px; height:700px; overflow:hidden; }
</style>
<body>
	<div id = center>
		<h1>호스팅 상태를 등록해주세요</h1>
		<form action="${context}/host.do" method="post">
	<span class="meta">이용가능한 침실갯수를 입력해주세요</span><br /> <input type="text" name="room" /><br />
	<span class="meta">게스트가 사용할 수 있는 침대갯수를 입력해주세요</span><br /> <input type="text" name="bed" /><br />
	<span class="meta">숙박가능 인원을 입력해주세요</span><br /> <input type="text" name="count" /><br />
	<span class="meta">이용 가능 화장실숫자를 입력해주세요</span><br /> <input type="text" name="toilet" /><br /><br />
	<span class="meta">간단히 설명해주세요</span><br /> <input type="text" name="explain" /><br /><br />
		<h1 >  주소입력  </h1><br />
	<span class="meta">지역을 입력해주세요</span>   <input type="text" name="address1" placeholder = "ex)서울시"/><br /><br />
	<span class="meta">구를 입력해주세요</span>    <input type="text" name="address2" placeholder = "ex)마포구"/><br /><br />
	<span class="meta">동을 입력해주세요</span>    <input type="text" name="address3" placeholder = "ex)상암동"/><br /><br />
 	<span class="meta">이하주소를 입력해주세요</span>    <input type="text" name="address4" placeholder = "ex)월드컵APT 104동 1303호"/><br />
	<input type="hidden" name="action" value="regist2">
	<input type="submit" class="button button2" value="등록">
	</form>
	<a href="hosting.jsp"><button class="button button2">이전</button></a>
	
	</div>
</body>
</html>