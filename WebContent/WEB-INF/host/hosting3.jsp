<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style type = "text/css">
#center { top:15%; left:40%; width:400px; height:400px; overflow:hidden; margin-left:540px;} 
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
</style>
<jsp:include page="/WEB-INF/global/top.jsp" />
<jsp:include page="/WEB-INF/global/nav.jsp" />
<center><img src="${hostimg}/starthost.jpg" width="100%" height="50%"></center>
<div id="center">
<form action="${context}/host.do" method="post">
		<h1 >  주소입력  </h1><br />
	     <span class="meta">지역을 입력해주세요</span>   <input type="text" name="address1" placeholder = "ex)서울시"/><br /><br />
	     <span class="meta">구를 입력해주세요</span>    <input type="text" name="address2" placeholder = "ex)마포구"/><br /><br />
	     <span class="meta">동을 입력해주세요</span>    <input type="text" name="address3" placeholder = "ex)상암동"/><br /><br />
		 <span class="meta">이하주소를 입력해주세요</span>    <input type="text" name="address4" placeholder = "ex)월드컵APT 104동 1303호"/><br />
		<input type="hidden" name="action" value="regist3">
		<button type="submit" class="button button2" style="margin-left:120px; margin-top:50px" >완료</button>
		 </form>
		 </div>
<jsp:include page="/WEB-INF/global/footer.jsp"/>
<jsp:include page="/WEB-INF/global/end.jsp"/>