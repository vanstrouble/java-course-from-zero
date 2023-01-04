create database persona;
use persona;

create table gustospersona (
	id int not null auto_increment,
    genero varchar (45) not null,
    edad int not null,
    futbol boolean null,
    basquet boolean null,
    tennis boolean null,
    natacion boolean null,
    beisbol boolean null,
    primary key (id)
);
drop table if exists gustospersona;

select * from gustospersona;
