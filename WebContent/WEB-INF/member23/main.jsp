<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!doctype html>
<style>
#center { position:absolute; top:50%; left:50%; width:800px; height:30px; overflow:hidden; 
background-color:#FC0; margin-top:-10px; margin-left:-400px;}
 </style>
<body data-locale="ko">
	<div id="navi" data-canvas="true" data-show-memo="false"
		data-show-link="false" title="상단 부분">
		<div data-obj-id="6Fv8G" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 650px; width: 100px; height: 30px;">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class="">
				<a href="/guide/guide.jsp ">도움말</a>
			</div>
		</div>
		<div data-obj-id="p5jim" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 770px; width: 100px; height: 30px;"
			data-link-to="page:GNusC">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class="">
				<a href="/member/regist.jsp ">회원가입</a>
			</div>
		</div>
		<div data-obj-id="Rl0On" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 892px; width: 100px; height: 30px;">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class="">
				<a href="login.jsp ">로그인</a>
			</div>
		</div>
		<div data-obj-id="jyU2R" data-obj-type="element"
			data-text-editable="true" class=""
			style="position: absolute; top: 22px; left: 530px; width: 101px; height: 30px;">
			<div data-text-content="true"
				style="font-size: 10px; color: rgb(255, 255, 255); line-height: 2.5em; border-radius: 4px; text-align: center; background-color: rgb(52, 152, 219);"
				class="">
				<a href="host.jsp ">호스팅하기</a>
			</div>
		</div>
	</div>
	<br>
	<img src="airbnb_main_back.jpg" alt=""
		style="width: 100%; height: 100%;">
	<br>

	<form action="searchHostResult.jsp">
		<div id="center">


			<input type="text" placeholder="서울특별시" value=""> <input
				type="text" placeholder="체크인일자2000-01-01" value=""> <input
				type="text" placeholder="체크아웃일자" value=""> <input
				type="text" placeholder="숙박인원-숫자만 입력" value=""> <input
				type="submit" value="검색">




		</div>
	</form>