<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<title>호스팅2</title>
<jsp:include page = "../global/hosT.jsp"/>
<style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 16px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    -webkit-transition-duration: 0.4s;
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
		
  
	<span class="meta">이용가능한 침실갯수를 입력해주세요</span><select>
	<option value="room">1</option>
    <option value="room">2</option>
    <option value="room">3</option>
    <option value="room">4</option>
	</select><br />
	<span class="meta">게스트가 사용할 수 있는 침대갯수를 입력해주세요</span><select>
	<option value="bed">1</option>
    <option value="bed">2</option>
    <option value="bed">3</option>
    <option value="bed">4</option>
	</select><br />
	<span class="meta">숙박가능 인원을 입력해주세요</span><select>
	<option value="people">1</option>
    <option value="people">2</option>
    <option value="people">3</option>
    <option value="people">4</option>
    <option value="people">5</option>
	</select><br />
	<span class="meta">이용 가능 화장실숫자를 입력해주세요</span><select>
	<option value="toilet">1</option>
    <option value="toilet">2</option>
    <option value="toilet">3</option>
	</select><br /><br />
	<span class="meta">간단히 설명해주세요</span><br /> <input type="text" name="explain" /><br /><br />
	
								<h1 >  주소입력  </h1><br />
	     <span class="meta">지역을 입력해주세요</span>   <input type="text" name="address1" placeholder = "ex)서울시"/><br /><br />
	     <span class="meta">구를 입력해주세요</span>    <input type="text" name="address2" placeholder = "ex)마포구"/><br /><br />
	     <span class="meta">동을 입력해주세요</span>    <input type="text" name="address3" placeholder = "ex)상암동"/><br /><br />
		 <span class="meta">이하주소를 입력해주세요</span>    <input type="text" name="address4" placeholder = "ex)월드컵APT 104동 1303호"/><br />
	
	<a href="hosting.jsp"><button class="button button2">이전</button></a>
		<input type="submit" class="button button2" ><a href="hosting3.jsp">다음</a>
	</div>
</body>
</html>