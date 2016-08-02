<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
.flex-container {
	display: -webkit-flex;
	display: flex;
	-webkit-flex-flow: row wrap;
	flex-flow: row wrap;
	text-align: left;
	margin-top: 300px;
	margin-left: 100px;
}

.flex-container>* {
	padding: 5px;
	-webkit-flex: 1 100%;
	flex: 1 100%;
}

.article {
	text-align: left;
}

footer {
	background: #aaa;
	color: white;
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
	footer {
		-webkit-order: 3;
		order: 3;
	}
}

p {
	margin: 0;
	font-size: 80%;
}
</style>
</head>
<body>

	<div class="flex-container">


		<nav class="nav">
		<div class="container">
			<label><b>★[신규오픈!] 지하철 5분 교통좋은 깔끔 조용한 스튜디오!!</b></label><br> <a>
				강남구, 서울 한국</a><a> 후기</a> <font color="red">★★★★★</font><br> <img
				alt="" src="booking_icon.jpg"><br> <a> 집전체</a>&nbsp;
			&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; <a> 숙박인원 3명</a>&nbsp; &nbsp;&nbsp;
			&nbsp; &nbsp; &nbsp; <a> 침실 0개</a>&nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
			&nbsp; &nbsp; <a> 침대 1개</a><br>
			<article>
			<h1>상세 설명</h1>


			<p>올림픽 공연 관람에 최적!!</p>
			<p>천호역(5,8호선)에서 도보로 6분!</p>
			<p>강동역에서는 도보로 3분!</p>

			<p>@ 지하철, 버스 등 교통이 매우 편리합니다.</p>
			<p>@ 원️룸 오피스텔로 매우 깔끔하고 조용하며, 안전합니다!</p>
			<p>@ ️올림픽 공원, 잠실, 롯데월드가 10분거리!!</p>

			<p>생활 도구/주방 용품/와이파이 및 비품 보유</p>
			<p>올림픽 공원 콘서트, 공연 관람하러 많이 오십니다</p>
			<p>여행자, 회사 연수, 시험 보러 오시는 분들께 완벽한 장소입니다!</p>

			<p>호스트에게 연락하기</p>
			</article>
			<jsp:include page="book_under.jsp" />
		</div>
		</nav>

		<article class="article">
		<h2>예약하기</h2>
		<br>
		<form  action="booking_result.jsp">
<div id="center">



<input type="text" placeholder="체크인일자2000-01-01" value="" size="25"><br>
<input type="text" placeholder="체크아웃일자" value="" size="25"><br>
<input type="text" placeholder="숙박인원-숫자만 입력" value="" size="25"><br>

<table >
  <tr>
    <th>50,000원 2박</th>
    <th style="float: right">100,000원</th>
  </tr>
  <tr>
    <td>서비스 수수료</td>
    <td style="float: right">10,000원</td>
  </tr>
  <tr>
    <td>합계 </td>
    <td style="float: right">110,000원</td>
  </tr>
</table>
<input type="submit" value="즉시예약" style="width: 200px">




</div>
</form>
</body>


</article>

<!-- <footer>Copyright � W3Schools.com</footer> -->


</body>
</html>

