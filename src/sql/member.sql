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

update member set pw = '1' , email = '1', phone = '1', address = '1', intro = '1' where id = 'hong';
delete from member where id ='oh';
select * from member;
update member set pw ='1' where id = 'hong';

insert into member(id,pw,name,gender,email,birth,phone,address,intro,sns,profile_img) 
values('hong','1','홍길동','남','hong@test.com','1989,02,22','010-7143-0222','default','default','default','default.jpg');