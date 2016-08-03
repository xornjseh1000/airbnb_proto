create table book(
	address varchar2(100) constraint book_pk primary key,
	check_in varchar2(20),
	check_out varchar2(20),
	count number,
	id varchar2(20),
	constraint book_member_fk foreign key (id)
	references member(id) on delete cascade
);

insert into book(ADDRESS,CHECK_IN,CHECK_OUT,COUNT,ID) 
 values('1','2','3','4','hong');
 
insert into member(id,pw,name,gender,email,birth,phone,address,intro,sns,profile_img) 
values('hong','1','홍길동','남','hong@test.com','1989,02,22','010-7143-0222','default','default','default','default.jpg');

select * from book;

drop view wishlist;
create view wishlist as
select 
b.address,
b.check_in,
b.check_out,
b.count,
m.id
from member m, book b
where m.id = b.id;

