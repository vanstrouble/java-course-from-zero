create database tiempo;
use tiempo;

create table TablaFecha (
	idFecha int not null auto_increment,
    fecha date not null,
    primary key (idFecha)
);
drop table TablaFecha;

select * from TablaFecha;