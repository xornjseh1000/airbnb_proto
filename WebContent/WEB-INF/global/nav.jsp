<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<ul>
<a href="${context}/global.do?page=index"><img src="${globalimg}/airbnb.jpg" height="50px" width="100px"></a>

	 <li style="float:right"><a href="${context}/member.do?action=logout">${logout.msgLogout}</a></li>
	 <li style="float:right"><a href="${context}/member.do?page=mypage">${user.msgUpdate}</a></li>
  <li style="float:right"><a href="${context}/member.do?page=login">로그인</a></li>
    <li style="float:right"><a href="${context}/member.do?page=regist">회원가입</a></li>
    <li style="float:right"><a href="${context}/guide.do">도움말</a></li>
     <li style="float:right"><a href="${context}/book.do?action=booklist&page=booklist">예약하기</a></li>
    <li style="float:right"><a href="${context}/host.do?action=temp">호스팅하기</a></li>
    
   
</ul>
