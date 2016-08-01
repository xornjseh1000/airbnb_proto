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
</style>
<body>

		<h1>호스팅 상태를 등록해주세요</h1>
		<div>
	<span class="meta">이용가능한 침실갯수를 입력해주세요</span><br /> <input type="text" name="room" /><br />
	<span class="meta">게스트가 사용할 수 있는 침대갯수를 입력해주세요</span><br /> <input type="text" name="bed" /><br />
	<span class="meta">숙박가능 인원을 입력해주세요</span><br /> <input type="text" name="count" /><br />
	<span class="meta">이용 가능 화장실숫자를 입력해주세요</span><br /> <input type="text" name="restroom" /><br /><br />
	</div>
								<h1>	주소입력	</h1><br /><br />
								<div>
	     <span class="meta">지역을 입력해주세요</span>   <input type="text" name="address1" /><br /><br />
	     <span class="meta">구를 입력해주세요</span>    <input type="text" name="address2" /><br /><br />
	     <span class="meta">동을 입력해주세요</span>    <input type="text" name="address3" /><br /><br />
	<span class="meta">이하주소를 입력해주세요</span>    <input type="text" name="address4" /><br />
	</div>
	<a href="hosting.jsp"><button class="button button2">이전</button></a>
		<input type="submit" class="button button2" ><a href="hosting3.jsp">다음</a>
	
</body>
</html>