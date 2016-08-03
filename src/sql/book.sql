create sequence seq2
increment by 1
start with 1000
nocycle;

create table book(
	seq2 number constraint book_pk primary key,
	address varchar2(100),
	check_in varchar2(20),
	check_out varchar2(20),
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
	constraint book_member_fk foreign key (id)
	references member(id) on delete cascade
);
drop view book_member;


select * from book;
select * from book_member;

create view book_member as
select 
	b.seq2,
	b.address,
	b.check_in,
	b.check_out,
	b.explain,
	b.review,
	b.price,
	b.option2,
	b.local2,
	b.facilities,
	b.policy,
	b.house_type,
	b.language,
	b.photo,
	b.room,
	b.toilet,
	b.bed,
	b.count,
	m.id
from member m, book b
where m.id = b.id;

select * from city_member where address like '서울시%';


 SELECT distinct regexp_substr(A.TXT, '[^,]+', 1, LEVEL) TXT
   FROM (SELECT '서울시,중랑구,신내동,좋은 집' TXT FROM dual) A
CONNECT BY LEVEL <= length(regexp_replace(A.TXT, '[^|]+',''))+1
;

select distinct city_member

select id,SUBSTRING(name,0,charindex(',',name))as firstname
,SUBSTRING(name,charindex(',',name),len(name)+1)as lastname from spilt

delete from book_member where id = 'hong';

