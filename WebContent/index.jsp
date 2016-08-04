<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/global/top.jsp"/>
<jsp:include page="/WEB-INF/global/nav.jsp"/>
<img src="${memberimg}/airbnb_main_back.jpg" alt="" style="width: 100%; height: 100%;">
<form action="${context}/book.do" method="post">
	<div style="text-align:center">
		<input type="text" placeholder="떠나고싶은 도시를 검색해주세요" style="width: 500px; height:30px" name="search"> 
		<input type="hidden" name="action" value="search">
		<input type="submit" value="검색">
	</div>
</form><br><br>
<div style="text-align:center">
<a href="${context}/host.do?action=temp"><img src="${globalimg}/gohosting.jpg" alt="" style="width:70%; height:70%;"></a>
</div>
<jsp:include page="/WEB-INF/global/guide.jsp"/>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>