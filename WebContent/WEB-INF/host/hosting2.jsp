<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
#center { position:absolute; top:10%; left:10%; width:500px; height:700px; overflow:hidden; }
#center2 { position:absolute; top:10%; left:60%; width:500px; height:700px; overflow:hidden; }
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
	<form action="${context}/host.do" method="post">
	<div id = center>
	<h1>호스팅 상태를 등록해주세요</h1>
	<span>이용가능한 침실갯수를 입력해주세요</span><select name="room">
	<option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
	</select><br />
	<span>게스트가 사용할 수 있는 침대갯수를 입력해주세요</span><select name="bed">
	<option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
	</select><br />
	<span>숙박가능 인원을 입력해주세요</span><select name="count">
	<option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
	</select><br />
	<span>이용 가능 화장실숫자를 입력해주세요</span><select name="toilet">
	<option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
	</select><br />
	
	<h2><span>내부 시설 설정</span><br /></h2>
	<input type="checkbox" name ="facilities" value="wifi"/>WI-FI
	<input type="checkbox" name ="facilities" value="kitchen"/>부엌
	<input type="checkbox" name ="facilities" value="washer"/>세탁기<br /><br />
	<input type="checkbox" name ="facilities" value="heating"/>난방
	<input type="checkbox" name ="facilities" value="breakfast"/>아침식사
	<input type="checkbox" name ="facilities" value="aircondition"/>에어컨<br /><br />
	<input type="checkbox" name ="facilities" value="cableTV"/>케이블TV
	<input type="checkbox" name ="facilities" value="smoking"/>흡연
	<input type="checkbox" name ="facilities" value="gamemachine"/>오락기<br />
	
	<h2><span>외부 시설 설정</span><br /></h2>
	<input type="checkbox" name ="facilities" value="pool"/>수영장
	<input type="checkbox" name ="facilities" value="gym"/>헬스장
	<input type="checkbox" name ="facilities" value="free-parking"/>주차<br /><br />
	<input type="checkbox" name ="facilities" value="lift"/>엘레베이터
	<input type="checkbox" name ="facilities" value="gardon"/>정원
	<input type="checkbox" name ="facilities" value="BBQ"/>바베큐가능<br /><br />
	</div>
	<div id = center2>
	<h1><span>간단히 설명해주세요</span><br/></h1>
	<input type="text" name="explain" /><br/><br/>						
	<input type="hidden" name="action" value="regist2">
	<input type="hidden" name="page" value="hosting3">
	<a href="hosting.jsp"><button class="button button2">이전</button></a>
	<button type="submit" class="button button2">다음</button>
	</div>	
	</form>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>