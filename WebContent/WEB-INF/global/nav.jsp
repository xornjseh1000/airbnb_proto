<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
ul{
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: white;
}

li {
    float: left;
    border-right:1px solid #bbb;
}

li:last-child {
    border-right: none;
}

li a {
    display: #FFA7A7;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #EAEAEA;
}

.active {
    background-color: white;
}
</style>
<ul>
<a href="${context}/global.do?page=index"><img src="${globalimg}/airbnb.png" style="float:left; height:50px; width:100px; margin-right:50px;"></a>
<li style="float:right"><a href="${context}/member.do?action=logout">${user.msgLogout}</a></li>
<li style="float:right"><a href="${context}/member.do?action=mypage">${user.name}</a></li>
<li style="float:right"><a href="${context}/member.do?page=login">로그인</a></li>
<li style="float:right"><a href="${context}/member.do?page=regist">회원가입</a></li>
<li style="float:right"><a href="${context}/global.do?action=helpcenter&page=helpcenter">도움말</a></li>
<li style="float:right"><a href="${context}/book.do?action=booklist">예약하기</a></li>
<li style="float:right"><a href="${context}/host.do?action=temp">호스팅하기</a></li>
 

</ul>
