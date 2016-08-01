<!-- 테이블 확인해보기 -->
select * from member;

<!-- 레지스트(회원가입) -->
insert into member(id,pw,name,gender,email,birth,phone,address,intro,sns,profile_img) values(?,?,?,?,?,?,?,?,?,?,?);
<!-- address, intro, sns는 차후 update문에서 사용할 예정으로 초기값 default로 set profile_img 초기값 default.jpg로 set -->

<!-- 수정 -->
update member set pw=?, email=?, phone=?, address=?, intro=?; 

<!-- 탈퇴 -->
delete from member where id =? and pw=?;
delete from member where id ='2';

<!-- 검색 -->
select * from member where id = ?;


delete from member(id,pw,name,gender,email,birth,phone,address,intro,sns,profile_img) values(2,2,2,2,2,2,2,2,2,2,2);
