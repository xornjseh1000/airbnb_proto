<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/global/top.jsp"/>
<jsp:include page="/WEB-INF/global/nav.jsp"/>
<img src="${memberimg}/airbnb_main_back.jpg" alt="" style="width: 100%; height: 100%;">
<form action="${context}/book.do">
	<div style="text-align:center">
		<input type="text" placeholder="서울특별시" value=""> 
		<input type="text" placeholder="체크인일자2000-01-01" value=""> 
		<input type="text" placeholder="체크아웃일자" value=""> 
		<input type="text" placeholder="숙박인원-숫자만 입력" value=""> 
		<input type="hidden" name="page" value="booklist">
		<input type="submit" value="검색">
	</div>
</form><br><br>
<div style="text-align:center">
<a href="${context}/host.do?action=temp"><img src="${globalimg}/gohosting.jpg"/></a>
</div>
<jsp:include page="/WEB-INF/global/guide.jsp"/>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>