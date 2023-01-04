create database tienda;
use tienda;

create table producto (
	idProducto int not null auto_increment,
    codigo varchar(45) not null,
    nombre varchar (45) not null,
    precio decimal (10,2) not null,
    cantidad int not null,
    primary key (idProducto)
);

insert into producto (codigo, nombre, precio, cantidad) values 
("001", "Frituras", 1.5, 100),
("002", "Chocolates", 1.3, 200),
("003", "Galletas", 2.5, 250),
("004", "Bombones", 1.8, 200),
("005", "Jabones", 2.5, 60),
("006", "Vegetales", 0.5, 59);

select * from producto;