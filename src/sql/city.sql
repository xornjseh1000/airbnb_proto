create sequence seq
increment by 1
start with 1000
nocycle;

drop sequence seq; 

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
	id varchar2(20),
	constraint city_member_fk foreign key (id)
	references member(id) on delete cascade 
);

create view book_city as
select
from book b,city c

select * from city;
select * from book;
drop table city;
  
insert into city(
address,
explain,
review,
price,
option2,
local2,
facilities,
policy,
house_type,
language,
photo,
room,
toilet,
bed,
id) 
values('서울시,중랑구,신내동,중앙하이츠아파트,2동,1511호',
'우리동네',
'default',
'500000',
'direct',
'신내동',
'default',
'default',
'apart',
'korean',
'default.jpg',
'1',
'2',
'2',
'hong');




