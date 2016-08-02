<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="top.jsp"/>
<link rel="stylesheet" href="${css}/global.css" />
<jsp:include page="header.jsp"/>
	<jsp:include page="nav.jsp"/>
	<div id="section">
		<h2>회원관리</h2>
		<p>London is the capital city of England. It is the most populous city in the United Kingdom,
		with a metropolitan area of over 13 million inhabitants.</p>
		<p>Standing on the River Thames, London has been a major settlement for two millennia,
		its history going back to its founding by the Romans, who named it Londinium.</p>
	</div>
	
	<jsp:include page="footer.jsp"/>
	<jsp:include page="end.jsp"/>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String ctx =application.getContextPath(); %>

<!doctype html>
<body data-locale="ko">
	<div id="navi" data-canvas="true" data-show-memo="false"
		data-show-link="false"
		title="상단 부분">
		<div data-obj-id="6Fv8G" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 550px; width: 100px; height: 30px;">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class=""><a href="<%=ctx %>/guide/guide.jsp ">도움말</a></div>
		</div>
		<div data-obj-id="p5jim" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 670px; width: 100px; height: 30px;"
			data-link-to="page:GNusC">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class=""><a href="<%=ctx %>/member/regist.jsp ">회원가입</a></div>
		</div>
		<div data-obj-id="Rl0On" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 792px; width: 100px; height: 30px;">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class=""><a href="<%=ctx %>/member/login.jsp ">로그인</a></div>
		</div>
		<div data-obj-id="jyU2R" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 430px; width: 101px; height: 30px;">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class=""><a href="<%=ctx %>/host/host.jsp ">호스팅하기</a></div>
		</div>
	</div>
	
	
>>>>>>> refs/remotes/origin/dev_inchul
