1

SELECT * FROM public.students11
ORDER BY id ASC 

2

select * from students11 where age>20;

3

update students11 set email='rahul@gmail.com' where id=5;


4
delete age from students11 where age>18;

5
select * from students11 Order by marks desc limit 1 offset 1;




create table stu(
sid int primary key,
sname varchar(20),
sage int
)
insert into stu values(1,'Rahul',22),(2,'priya',21),(3,'Akash',23)

select * from stu;


create table couse(
cid int primary key,
sid int,
cname varchar(30)
);
insert into couse values(101,1,'Java'),(102,2,'python'),(103,1,'SQL');

select * from couse;

select s1.sname,c1.cname from stu s1 inner join couse c1 on c1.cid=s1.sid;

