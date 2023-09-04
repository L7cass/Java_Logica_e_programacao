

create database Atividades_1FN;
use Atividades_1FN;

create table livro(
id integer primary key auto_increment,
titulo varchar(50),
Autores varchar(100),
ano int 
);

insert into livro Value("chapeuzinho vermelho", "mauricio de souza, Machado de Assis", 1980),
("the whicher", "walt disney, mickey mouse, pernalonga ", 2007),
("mcquenn", "Mate, tony stark",2017); 

select * from livro ;

