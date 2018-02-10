CREATE  DATABASE  test;
use test;
create table Students          ---创建表，设置表中列 
(
ID int identity(1,1) primary key, --自增  主键
Name nvarchar(50) not null , -- 可变长度，每个字符占用两个字节 最多50个字节
age int 
)


INSERT INTO  Students(Name) VALUES ('asd')