create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	gender varchar2(10),
	email varchar2(50),
	birth varchar2(20),
	phone varchar2(15),
	address varchar2(100),
	intro varchar2(500),
	sns varchar2(30),
	profile_img varchar2(20)
);
===========================================================
select * from member;
update member set pw ='1' where id = 'hong';