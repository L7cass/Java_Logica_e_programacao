create database Atividades_1FN_3;
use Atividades_1FN_3;


create table produto(
id integer primary key auto_increment,
nome varchar(50),
categoria varchar(100),
quantidade int,
ano int 
);

insert into produto Value(null,"batom", "chocolate", 540,9.99),
(null,"manteiga", "frios", 203 ,12.99),
(null,"oreo", "biscoito",198,8.68); 

select * from produto ;