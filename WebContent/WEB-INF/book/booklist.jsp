<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
	table#list {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}
td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}
tr:nth-child(even) {
    background-color: #dddddd;
}
p{text-align: center;}
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
<center><img src="${bookimg}/booklist.jpg" width="1410px" height="400px"></center><br>
<h2 style="text-align:center">여행하고싶은 여행지를 선택해주세요!</h2><br>
<div style="text-align: center">
<table id="list">
	<tr>
	    <td>숙소소개</td>
	    <td>주소</td>
	    <td>집 유형</td>
	    <td>방 갯수</td>
	    <td>화장실 갯수</td>
	    <td>침대 갯수</td>
	    <td>수용 가능 인원</td>
	</tr>
	<c:forEach var="city" items="${list}">
	<tr>

		<td><a href="${context}/book.do?action=find_by&page=book&keyword=${city.address}">${city.explain}</a></td>
	    <td>${city.address}</td>
	    <td>${city.houseType}</td>
	    <td>${city.room}</td>
	    <td>${city.toilet}</td>
	    <td>${city.bed}</td>
	    <td>${city.count}</td>
	     
	
	</tr>
</c:forEach>
</table>
</div>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>