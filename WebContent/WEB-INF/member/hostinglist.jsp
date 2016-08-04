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
		-webkit-flex: 0 0px;
		flex: 1 0px;
		-webkit-order: 1;
		order: 1000;
	}

}

p {
	margin: 0;
	font-size: 80%;
}
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
<jsp:include page="../member/mypageframe.jsp" />
<center><img src="${bookimg}/bnb.png" width="70%" height="50%"></center>
<div class="flex-container">
<nav class="nav">
<div class="container">
<table id ="book">
  <tr>
    <th>숙소정보</th>
    <th>예약정보</th>
    <th></th>
  </tr>
  <tr>
    <td rowspan="6">숙소</td>
    <td>주소${city.address}</td>
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
		<h2>호스팅 취소하기</h2>
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
		<form action="${context}/host.do" method="post">
		<input type="hidden" name="address" value="${city.address}">
		<input type="hidden" name="action" value="delete">
		<input type="submit" value="호스팅 취소" style="width: 200px">
		</form>
		</article>
		</div>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>


