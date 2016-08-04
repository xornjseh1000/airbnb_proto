create sequence seq
increment by 1
start with 1000
nocycle;
==============================================
create table city(
	seq number constraint city_pk primary key,
	address varchar2(100),
	explain varchar2(1000),
	review varchar2(500),
	price varchar2(50),
	option2 varchar2(50),
	local2 varchar2(100),
	facilities varchar2(500),
	policy varchar2(100),
	house_type varchar2(20),
	language varchar2(20),
	photo varchar2(50),
	room number,
	toilet number,
	bed number,
	count number,
	id varchar2(20),
	constraint city_member_fk foreign key (id)
	references member(id) on delete cascade 
);
===============================================
create view city_member as
select
	c.seq,
	c.address,
	c.explain,
	c.review,
	c.price,
	c.option2,
	c.local2,
	c.facilities,
	c.policy,
	c.house_type,
	c.language,
	c.photo,
	c.room,
	c.toilet,
	c.bed,
	c.count,
	m.id
from member m, city c
where m.id = c.id;
===========================================================
select * from city_member;
delete from city_member where id ='hong';
