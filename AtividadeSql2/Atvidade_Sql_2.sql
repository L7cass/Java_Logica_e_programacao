
create database Atividades_1FN_2;
use Atividades_1FN_2;


create table livro(
id integer primary key auto_increment,
titulo varchar(50),
Autor varchar(100),
isbn varchar (50),
ano int 
);

insert into livro Value(null,"turma da monica", "mauricio de souza", "12345678900",1999),
(null,"dom casmurro", "machado de assis", "23475689319" ,1987),
(null,"harry potter", "JK rowiling", "09876543211",2003); 

select * from livro ;