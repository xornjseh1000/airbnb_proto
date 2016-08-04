<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
#book {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
    font-size:80%;
}

td, th {
   
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
.flex-container {
	display: -webkit-flex;
	display: flex;
	-webkit-flex-flow: row wrap;
	flex-flow: row wrap;
	text-align: left;
	margin-top: 50px;
	margin-left: 250px;
}

.flex-container>* {
	padding: 5px;
	-webkit-flex: 1 100%;
	flex: 1 100%;
}

.article {
	text-align: left;
}

.nav {
	background: #eee;
}

.nav ul {
	list-style-type: none;
	padding: 0;
}

.nav ul a {
	text-decoration: none;
}

@media all and (min-width: 500px) {
	.nav {
		text-align: left;
		-webkit-flex: 5 auto;
		flex: 1 auto;
		-webkit-order: 1;
		order: 1;
	}
	.article {
		-webkit-flex: 5 0px;
		flex: 5 0px;
		-webkit-order: 2;
		order: 2;
	}

}

p {
	margin: 0;
	font-size: 80%;
}
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
<center><img src="${bookimg}/bnb.png" width="100%" height="50%"></center>
<div class="flex-container">
<nav class="nav">
<div class="container">
<table id ="book">
  <tr>
    <th>숙소정보</th>
    <th>이 숙소는 숙소로서의 편의 시설을 갖추고 있습니다</th>
    <th>상세정보</th>
  </tr>
  <tr>
    <td rowspan="6">숙소</td>
    <td>주소: ${city.address}</td>
    <td></td>
  </tr>
  <tr>
    <td>화장실: ${city.toilet}</td>
    <td></td>
   
  </tr>
  <tr>
    <td>침대 갯수: ${city.bed}</td>
    <td></td>
  
  </tr>
  <tr>
    <td>침실: ${city.room}</td>
    <td></td>
   
  </tr>
  <tr>
    <td>숙소 유형: ${city.houseType}</td>
    <td></td>
    
  </tr>
  <tr>
    <td>숙박 가능 인원: ${city.count}</td>
    <td></td>
  </tr>
   <tr>
    <td rowspan="2">시설</td>
    <td>${city.facilities}</td>
    <td></td>
  </tr>
   <tr>
    <td></td>
    <td></td>
    
  </tr>
   <tr>
    <td rowspan="3">가격</td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td> </td>
    <td> </td>
  </tr>
    <tr>
    <td> </td>
    <td></td>
  </tr>
  <tr>
    <td rowspan="2">설명</td>
    <td>${city.explain}</td>
    <td></td>
  </tr>
  <tr>
    
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td rowspan="2">숙소이용규칙</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    
    <td> </td>
    <td></td>
  </tr>
  <tr>
    <td rowspan="2">안전규칙</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td ></td>
    <td>  </td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  
</table>
		</div>
		</nav>

		<article class="article">
		<h2>예약하기</h2>
		<br>
<form action="${context}/book.do" method="post">
<div id="center">
<input type="text" placeholder="체크인일자2000-01-01" name="check_in" size="25"><br>
<input type="text" placeholder="체크아웃일자" name="check_out" size="25"><br>
<input type="text" placeholder="숙박인원-숫자만 입력" name="count" size="25"><br>
<table>
  <tr>
    <th>00,000원 0박</th>
    <th style="float: right">000,000원</th>
  </tr>
  <tr>
    <td>서비스 수수료</td>
    <td style="float: right">00,000원</td>
  </tr>
  <tr>
    <td>합계 </td>
    <td style="float: right">00,000원</td>
  </tr>
</table>
<input type="hidden" value="${city.address}" name="address">
<input type="hidden" value="${city.houseType}" name="house_type">
<input type="hidden" value="${city.room}" name="room">
<input type="hidden" value="${city.toilet}" name="toilet">
<input type="hidden" value="${city.bed}" name="bed">
<input type="hidden" value="${city.facilities}" name="facilities">
<input type="hidden" value="${city.explain}" name="explain">

<input type="hidden" name="action" value="booking">
<input type="submit" value="즉시예약" style="width: 200px">
</div>
</form>
</article>
</div>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>


