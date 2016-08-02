<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/global/top.jsp"/>
<jsp:include page="/WEB-INF/global/nav.jsp"/>
<img src="${memberimg}/airbnb_main_back.jpg" alt="" style="width: 100%; height: 100%;">
<form action="searchHostResult.jsp">
	<div id="mainbook">
		<input type="text" placeholder="서울특별시" value=""> 
		<input type="text" placeholder="체크인일자2000-01-01" value=""> 
		<input type="text" placeholder="체크아웃일자" value=""> 
		<input type="text" placeholder="숙박인원-숫자만 입력" value=""> 
		<input type="submit" value="검색">
	</div>
</form>
<jsp:include page="/WEB-INF/global/end.jsp"/>