create database usuarios;

use usuarios;

#Creamos la tabla tipo_usuarios
CREATE TABLE `usuarios`.`tipo_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
insert into tipo_usuario (nombre) values ("Administrador"),("Usuario");

SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
SET SQL_MODE='ALLOW_INVALID_DATES';

#Creamos la tabla usuario
CREATE TABLE `usuarios`.`usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(100) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `ultima_sesion` DATETIME NULL DEFAULT '0000-00-00 00:00:00',
  `idTipo_usuario` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `idTipoUsuario_idx` (`idTipo_usuario` ASC),
  CONSTRAINT `idTipoUsuario`
    FOREIGN KEY (`idTipo_usuario`)
    REFERENCES `usuarios`.`tipo_usuario` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
drop table if exists usuario;    

select * from tipo_usuario;

select * from usuario;
