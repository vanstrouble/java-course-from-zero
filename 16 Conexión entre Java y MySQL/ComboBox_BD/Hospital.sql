create database hospital;
use hospital;

create table especialidades (
	idEspecialidad int not null auto_increment,
    nombreEspecialidad varchar (45) not null,
    primary key (idEspecialidad)
);
drop table if exists especialidades;

insert into especialidades (nombreEspecialidad) values 
("Anestesiología"),
("Anatomía Patológica"),
("Cardiología"),
("Cardiología Intervencionista"),
("Cirugía General"),
("Dermatología"),
("Gastroenterología"),
("Ginegología y Obstetricia"),
("Hematología"),
("Medicina Aeroespacial");
delete from especialidades;

select * from especialidades;

create table medicos (
	idMedico int not null auto_increment,
    nombre varchar (45) not null,
    apellido varchar (45) not null,
    turno varchar (45) not null,
    cedula_profesional varchar (45) not null,
    idEspecialidad int not null,
    primary key (idMedico),
    index id_especialidad_idx (idMedico ASC),
    constraint id_especialidad foreign key (idEspecialidad) references especialidades (idEspecialidad) 
		on delete no action
        on update no action
);
drop table if exists medicos;

insert into medicos (nombre, apellido, turno, cedula_profesional, idEspecialidad) values
("Aideé", "Correa", "Matutino", "AB123", 10),
("Pedro", "Vázquez", "Matutino", "PV123", 8),
("Juan", "Rojas", "Vespertino", "JR123", 1),
("Guillermo", "Contreras", "Vespertino", "GC123", 2),
("Jorge", "Moreno", "Matutino", "JM123", 3),
("Josue", "López", "Vespertino", "JL123", 4),
("Michele", "Gaytan", "Vespertino", "MG123", 5),
("Janitzi", "González", "Vespertino", "JG123", 6),
("Gabriela", "González", "Matutino", "GG123", 7),
("Karen", "Sanchez", "Vespertino", "KS123", 8),
("Karen", "Contreras", "Matutino", "KC123", 9),
("Arely", "Contreras", "Matutino", "AC123", 10),
("Sandra", "Barcenas", "Vespertino", "SB123", 1),
("Corina", "Suarez", "Matutino", "CS123", 2),
("Karina", "Hernández", "Vespertino", "KH123", 3),
("Roberto", "Cabrera", "Vespertino", "RC123", 4),
("Carlos", "Salmeron", "Matutino", "CS223", 5),
("Blanca", "Rivera", "Vespertino", "BR123", 6),
("Carmen", "Solís", "Matutino", "CS323", 7),
("Andrea", "Cardoso", "Matutino", "AC123", 10);
delete from medicos;

select * from medicos;

