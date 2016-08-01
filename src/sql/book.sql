create table book(
	address varchar2(100) constraint book_pk primary key,
	check_in varchar2(20),
	check_out varchar2(20),
	count number,
	id varchar2(20),
	constraint book_member_fk foreign key (id)
	references member(id) on delete cascade
);

drop view wishlist;

select * from wishlist;

create view wishlist as
select 
b.address,
b.check_in,
b.check_out,
b.count,
m.id
from member m, book b
where m.id = b.id;


select * from city;
