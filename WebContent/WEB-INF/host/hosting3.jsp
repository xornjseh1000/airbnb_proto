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
div{   height: 200px;
    width: 60%;
    background-color: powderblue;
}
#center { position:absolute; top:10%; left:30%; width:500px; height:700px; overflow:hidden; }
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
<form action=""></form>
		<h1 >  주소입력  </h1><br />
	     <span class="meta">지역을 입력해주세요</span>   <input type="text" name="address1" placeholder = "ex)서울시"/><br /><br />
	     <span class="meta">구를 입력해주세요</span>    <input type="text" name="address2" placeholder = "ex)마포구"/><br /><br />
	     <span class="meta">동을 입력해주세요</span>    <input type="text" name="address3" placeholder = "ex)상암동"/><br /><br />
		 <span class="meta">이하주소를 입력해주세요</span>    <input type="text" name="address4" placeholder = "ex)월드컵APT 104동 1303호"/><br />
		 <input type="submit" class="button button2" ><a href="hosting4.jsp">완료</a>
<jsp:include page="/WEB-INF/global/end.jsp"/>