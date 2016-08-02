<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style type = "text/css">
#center { position:absolute; top:20%; left:30%; width:400px; height:400px; overflow:hidden;} 
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
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
	<div id = center>
	<span class = "meta"><h1>어떤 유형의 숙소인가요?</h1></span>	<br /><br /><br /><br />
	<form action="${context}/host.do" method="post">
	<input type="radio" name = "housetype" value = "all"/> 집 전체 <br /><br />
	<input type="radio" name = "housetype" value = "single"/> 개인실 <br /><br />
	<input type="radio" name = "housetype" value = "multi"/> 다인실 <br /><br /><br /><br />
	<input type="hidden" name="action" value="regist">
	<input type="hidden" name="page" value="hosting2">
	<input type="submit" value="다음">
	</form>
	<a href="${context}/host.do?page=host"><button class="button button2">이전</button></a>
	</div>
<jsp:include page="/WEB-INF/global/end.jsp"/>