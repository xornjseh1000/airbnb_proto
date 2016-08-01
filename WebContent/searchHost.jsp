<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body { margin-left: 0px; margin-top: 0px; margin-right: 0px; margin-bottom: 0px; }
#center { position:absolute; top:50%; left:50%; width:800px; height:30px; overflow:hidden; 
background-color:#FC0; margin-top:-100px; margin-left:-500px;}
input {text-align:center;}
h1 {text-align:center;}
</style>
</head>
<body>

<form  action="searchHostResult.jsp">
<div id="center">


<input  type="text" placeholder="서울특별시" value="">
<input type="text" placeholder="체크인일자2000-01-01" value="">
<input type="text" placeholder="체크아웃일자" value="">
<input type="text" placeholder="숙박인원-숫자만 입력" value="">
<input type="submit" value="검색">




</div>
</form>

</body>


</html>