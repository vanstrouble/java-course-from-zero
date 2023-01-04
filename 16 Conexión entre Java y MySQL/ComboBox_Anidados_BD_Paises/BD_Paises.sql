# Creamos la base de datos
create database datosPaises; 

# Usamos esa BD
use datosPaises; 

#Creamos la tabla paises
CREATE TABLE `datospaises`.`paises` (
  `idpais` INT NOT NULL AUTO_INCREMENT,
  `nombrePais` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idpais`));
  
#Llenamos los datos de los paises
insert into paises (nombrePais) values 
("Perú"),
("México"),
("Colombia"),
("Ecuador"),
("Argentina"),
("Brasil"),
("España"),
("Paraguay"),
("Italia"),
("Francia");

# Creamos la tabla estados
CREATE TABLE `datospaises`.`estados` (
  `idestado` INT NOT NULL AUTO_INCREMENT,
  `nombreEstado` VARCHAR(45) NOT NULL,
  `idPais` INT NOT NULL,
  PRIMARY KEY (`idestado`),
  INDEX `id_pais_idx` (`idPais` ASC),
  CONSTRAINT `id_pais`
    FOREIGN KEY (`idPais`)
    REFERENCES `datospaises`.`paises` (`idpais`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

#Llenar la tabla estados
insert into estados (nombreEstado,idPais) values
("Amazonas",1),("Áncash",1),("Apurímac",1),("Arequipa",1),("Ayacucho",1),("Cajamarca",1),("Callao",1),("Cusco",1),("Huancavelica",1),("Huánuco",1),("Ica",1),("Junín",1),("La Libertad",1),("Lambayeque",1),("Lima",1),("Loreto",1),("Madre de Dios",1),("Moquegua",1),("Pasco",1),("Piura",1),("Puno",1),("San Martín",1),("Tacna",1),("Tumbes",1),("Ucayali",1),
("Aguascalientes",2),("Baja California",2),("Baja California Sur",2),("Campeche",2),("Chiapas",2),("Chihuahua",2),("Ciudad de México",2),("Coahuila",2),("Colima",2),("Durango",2),("Guanajuato",2),("Guerrero",2),("Hidalgo",2),("Jalisco",2),("México",2),("Michoacán",2),("Morelos",2),("Nayarit",2),("Nuevo León",2),("Oaxaca",2),("Puebla",2),("Querétaro",2),
("Amazonas",3),("Antioquia",3),("Arauca",3),("Atlántico",3),("Bolívar",3),("Boyacá",3),("Caldas",3),("Caquetá",3),("Casanare",3),("Cauca",3),("Cesar",3),("Chocó",3),("Córdoba",3),("Cundinamarca",3),("Guainía",3),("Guaviare",3),("Huila",3),("La Guajira",3),("Magdalena",3),("Meta",3),("Nariño",3),("Norte de Santander",3),("Putumayo",3),("Quindio",3),
("Azuay",4),("Bolívar",4),("Cañar",4),("Carchi",4),("Chimborazo",4),("Cotopaxi",4),("El Oro",4),("Esmeraldas",4),("Galápagos",4),("Guayas",4),("Imbabura",4),("Loja",4),("Los Ríos",4),("Manabí",4),("Morona Santiago",4),("Napo",4),("Orellana",4),("Pastaza",4),("Pichincha",4),("Santa Elena",4),("Santo Domingo de los Tsáchilas",4),("Sucumbíos",4),
("Buenos Aires",5),("Catamarca",5),("Chaco",5),("Chubut",5),("Córdoba",5),("Corrientes",5),("Entre Ríos",5),("Formosa",5),("Jujuy",5),("La Pampa",5),("La Rioja",5),("Mendoza",5),("Misiones",5),("Neuquén",5),("Río Negro",5),("Salta",5),("San Juan",5),("San Luis",5),("Santa Cruz",5),("Santa Fe",5),("Santiago del Estero",5),
("Goiás",6),("Mato Grosso",6),("Distrito Federal",6),("Mato Grosso do Sul",6),("Alagoas",6),("Ceará",6),("Maranhão",6),("Paraíba",6),("Pernambuco",6),("Piauí",6),("Rio Grande do Norte",6),("Bahia",6),("Sergipe",6),("Acre",6),("Amapá",6),("Amazonas",6),("Pará",6),("Rondônia",6),("Roraima",6),("Tocantins",6),("Espírito Santo",6),
("Álava",7),("Albacete",7),("Alicante",7),("Almería",7),("Asturias",7),("Ávila",7),("Badajoz",7),("Barcelona",7),("Burgos",7),("Cáceres",7),("Cádiz",7),("Cantabria",7),("Castellón",7),("Ciudad Real",7),("Córdoba",7),("La Coruña",7),("Cuenca",7),("Gerona",7),("Granada",7),("Madrid",7),("Málaga",7),("Sevilla",7),
("Asunción",8),("Concepción",8),("San Pedro",8),("Cordillera",8),("Guairá",8),("Caaguazú",8),("Caazapá",8),("Itapúa",8),("Misiones",8),("Alto Paraná",8),
("Abruzos",9),("Apulia",9),("Basilicata",9),("Calabria",9),("Lacio",9),("Toscana",9),
("Gran Este",10),("Nueva Aquitania",10),("Auvernia-Ródano-Alpes",10),("Borgoña-Franco Condado",10),("Occitania",10);

#Creamos la tabla ciudades
CREATE TABLE `datospaises`.`ciudades` (
  `idciudad` INT NOT NULL AUTO_INCREMENT,
  `nombreCiudad` VARCHAR(45) NOT NULL,
  `idEstado` INT NOT NULL,
  PRIMARY KEY (`idciudad`),
  INDEX `id_estado_idx` (`idEstado` ASC),
  CONSTRAINT `id_estado`
    FOREIGN KEY (`idEstado`)
    REFERENCES `datospaises`.`estados` (`idestado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

# Llenamos la tabla ciudades
insert into ciudades (nombreCiudad,idEstado) values
("Chachapoyas",1),("Bagua",1),("Bongará",1),("Huaraz",2),("Yungay",2),("Chimbote",2),("Abancay",3),("Uripa",3),("Chincheros",3),("Arequipa",4),("Mollendo",4),("Chivay",4),("Ayacucho",5),("Huanta",5),("Puquio",5),("Cajamarca",6),("Chota",6),("Jaén",6),("Callao",7),("La Perla",7),("La Punta",7),("Cusco",8),("Acomayo",8),("Anta",8),("Huancavelica",9),("Pampas",9),("Yauli",9),("Huanuco",10),("Tingo maria",10),("Panao",10),("Ica",11),("Pisco",11),("Nazca",11),("Junin",12),("Huancayo",12),("Jauja",12),("Trujillo",13),("Chepen",13),("Viru",13),("Chiclayo",14),("Pomalca",14),("Lambayeque",14),("Lima",15),("Cañete",15),("Huaral",15),("Iquitos",16),("Nauta",16),("San lorenzo",16),("Puerto maldonado",17),("Mavila",17),("Alerta",17),("Moquegua",18),("Llo",18),("Omate",18),("Cerro de pasco",19),("Oxapampa",19),("Pozuzo",19),("Piura",20),("Paita",20),("Sullana",20),("Puno",21),("Juliaca",21),("Juli",21),("Tarapoto",22),("Moyobamba",22),("Rioja",22),("Tacna",23),("Tarata",23),("Tomasiri",23),("Tumbes",24),("Zarumilla",24),("Zorritos",24),("Pucallpa",25),("Puerto Esperanza",25),("Requena",25),
("Aguascalientes",26),("Calvillo",26),("Real de asientos",26),("Tijuana",27),("Rosarito",27),("La paz",28),("Loreto",28),("San Francisco de campeche",29),("Ciudad del carmen",29),("Tapachula",30),("Ocosingo",30),("Chihuahua",31),("Ciudad de Juarez",31),("Puebla",32),("Yucatán",32),("Saltillo",33),("Torreón",33),("Colima",34),("Manzanillo",34),("Victoria de durango",35),("Gómez palacio",35),("Guanajuato",36),("León",36),("Acapulco",37),("Taxco de alarcón",37),("Pachuca de soto",38),("Tulancingo",38),("Guadalajara",39),("Zapopan",39),("Ciudad de mexico",40),("Toluca de lerdo",40),("Monterrey",40),("Morelia",41),("Uruapan",41),("Cuernavaca",42),("Cuautla de moreles",42),("San Blas",43),("Tepic",43),("Monterrey",44),("Guadalupe",44),("Oaxaca de Juárez",45),("Santa María Huatulco",45),("Puebla de Zaragoza",46),("Tehuacán",46),("Santiago de Querétaro",47),("Corregidora",47),
("Leticia",48),("La pedrera",48),("Medellín",49),("Yarumal",49),("Arauca",50),("Tame",50),("Barranquilla",51),("Soledad",51),("Cartagena",52),("Magangué",52),("Tunja",53),("Duitama",53),("Manizales",54),("Chinchiná",54),("Florencia",55),("Solano",55),("Yopal",56),("Paz de Ariporo",56),("Popayán",57),("Cali",57),("Valledupar",58),("Aguachica",58),("Quibdó",59),("Nuquí",59),("Montería",60),("Cereté",60),("Soacha",61),("Zipaquirá",61),("Inírida",62),("San Felipe",62),("San José del Guaviare",63),("Miraflores",63),("Neiva",64),("Pitalito",64),("Riohacha",65),("Maicao",65),("Santa Marca",66),("Barranquilla",66),("Villavicencio",67),("Acacías",67),("Pasto",68),("Ipiales",68),("Cúcuta",69),("Pamplona",69),("Mocoa",70),("Puerto Asís",70),("Armenia",71),("Calarcá",71),
("Cuenca",72),("Paccha",72),("Guaranda",73),("San José de Chimbo",73),("Azogues",74),("Guarumales",74),("Tulcán",75),("San Gabriel",75),("Alausí",76),("Chambo",76),("Latacunga",77),("Cantón la Maná",77),("Machala",78),("Zaruma",78),("Camarones",79),("Chinca",79),("Puerto Ayora",80),("Guayaquil",80),("Guayaquil",81),("Milagro",81),("Ivarra",82),("Otavalo",82),("Loja",83),("Maracá",83),("Baba",84),("Babahoyo",84),("Manta",85),("Porto Viejo",85),("Macas",86),("Polora",86),("Archidona",87),("Baeza",87),("Puerto Francisco de Orellana",88),("Nuevo Rocafuerte",88),("Arajuno",89),("Mera",89),("Quito",90),("Cayambe",90),("La Libertad",91),("Salinas",91),("Peripa",92),("Los naranjos",92),("Lumbaquí",93),("Nueva Loja",93),
("Peguajó",94),("Ciudad de Tandil",94),("Tinogasta",95),("Belén",95),("Resistencia",96),("Villa Ángela",96),("Puerto Madryn",97),("Trelew",97),("Ciudad de Cordoba",98),("Villa Carlos Paz",98),("Bella Vista",99),("Berón de Astrada",99),("Paraná",100),("Concordia",100),("Angostura",101),("Alto Alegre",101),("San Salvador de Jujuy",102),("Tilcara",102),("Ciudad de Santa Rosa",103),("General Pico",103),("La Rioja",104),("Chilesito",104),("La Paz",105),("Maipú",105),("Posadas",106),("Puerto Iguazú",106),("Neuquén",107),("Zapala",107);

#Seleccionamos la tabla paises
select * from paises; 

#Seleccionamos la tabla estados
select * from estados;

#Seleccionamos la tabla ciudades
select * from ciudades; 