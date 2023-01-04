create database escuela;
use escuela;

create table persona (
	idPersona int not null auto_increment,
    nombre varchar(50) not null,
    domicilio varchar(200) not null,
    celular varchar (10) null,
    correo_electronico varchar(50) null,
    fecha_nacimiento date null,
    genero varchar(10) not null,
    primary key (idPersona)
);
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

select * from persona;

insert into persona (nombre, domicilio, celular, correo_electronico, genero) 
values ("Pedro", "Libertad 30, Padre Hidalgo", "1234567890", "pedrovqz9@gmail.com", "Masculino");

insert into persona (nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) 
values ("Aideé", "Gatitos 14, Zona Centro", "0987654321", "aidee.cov@gmail.com", "1997-09-03", "Femenino");