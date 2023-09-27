create database banco_join_Cliente_s;
use banco_join_Cliente_s;

CREATE TABLE cliente(
id	INT PRIMARY KEY auto_increment,
nome VARCHAR(50),
email VARCHAR(50)
);

CREATE TABLE pedidos(
id INT PRIMARY KEY auto_increment,
cliente_id INT,
produto VARCHAR (100),
valor DOUBLE 
);

insert into cliente values(1,"lucas","lukkas@gmail.com"),
(2,"leo","leoo@gmail.com"),
(3,"joao","jao@gmail.com");

insert into pedidos values(3003,1,"iphone",5000),
(3344,2,"PS5",4599.99),
(33,3,"celta",12000);



SELECT Pedidos.ID, Clientes.Nome AS NomeDoCliente, Pedidos.Produto, Pedido.Valor
FROM Pedidos
INNER JOIN Clientes ON Pedidos.ClienteID = Clientes.ClienteID;