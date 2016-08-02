<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script
script src="https://maps.googleapis.com/maps/api/js"></script>

<style>
.flex-container {
    display: -webkit-flex;
    display: flex;
    -webkit-flex-flow: row wrap;
    flex-flow: row wrap;
    text-align: left;
}

.flex-container > * {
    padding: 5px;
    -webkit-flex: 1 100%;
    flex: 1 100%;
}

.article {
    text-align: left;
}

header {background: black;color:white;}
footer {background: #aaa;color:white;}
.nav {background:#eee;}

.nav ul {
    list-style-type: none;
 padding: 0;
}
   
.nav ul a {
 text-decoration: none;
}

@media all and (min-width: 768px) {
    .nav {text-align:left;-webkit-flex: 5 auto;flex:1 auto;-webkit-order:1;order:1;}
    .article {-webkit-flex:5 0px;flex:5 0px;-webkit-order:2;order:2;}
    footer {-webkit-order:3;order:3;}
}
</style>
</head>
<body>

<div class="flex-container">
<header>
  <h3>서울특별시 검색 결과</h3>
</header>

<nav class="nav">
<div class="container">
    <label><b>날    짜:</b></label>
    <input size="5" align="right" type="text" placeholder="체크인" name="checkin" required>
    <input size="5" align="right" type="text" placeholder="체크아웃" name="checkout" required>
    <input size="5" align="right" type="text" placeholder="숙박인원명수" name="numbder" required>
    <br>
    <label><b>숙소유형:</b></label>
    집전체 <input size="5" align="right" type="checkbox" name="host_type" >
    개인실 <input size="5" align="right" type="checkbox" name="host_type" >
    다인실 <input size="5" align="right" type="checkbox" name="host_type" >
    
    <br>

    <label><b>가격범위:</b></label>
    <input size="6" align="right" type="text" placeholder="최저가격" name="price_low" required>
    <input size="6" align="right" type="text" placeholder="최고가격" name="price_high" required><br>
    
    
    <br><br>
<img alt="" src="seoul.jpg" style="width:200px;height:200px;">   
<img alt="" src="busan.jpg" style="width:200px;height:200px;">  <br> 
<b href="book.jsp ">서울 호스팅 예약하기 &nbsp; &nbsp; &nbsp; &nbsp;</b>
<b href="book.jsp ">부산 호스팅 예약하기</b><br>
<img alt="" src="london.jpg" style="width:200px;height:200px;">   
<img alt="" src="swiss.jpg" style="width:200px;height:200px;">  <br>
<b href="book.jsp ">런던 호스팅 예약하기 &nbsp; &nbsp; &nbsp; &nbsp;</b>
<b href="book.jsp ">스위스 호스팅 예약하기</b><br> 

  </div>
</nav>

<article class="article">
  <h2>서울특별시 검색 결과</h2><br>
  <img src="map.jpg" alt=""  />




</body>




</article>

<!-- <footer>Copyright � W3Schools.com</footer> -->
</div>

</body>
</html>

