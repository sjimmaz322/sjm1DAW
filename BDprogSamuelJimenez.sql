drop database if exists BDprogSamuelJimenez;

create database if not exists BDprogSamuelJimenez;

use BDprogSamuelJimenez;

create table if not exists usuarios
(
nombre varchar(50),
contrasenia varchar(12) unique,
email varchar(50) unique,
edad int unsigned,

constraint pk_usuarios primary key (email)
);

create table if not exists jugador
(
apodo varchar(12) unique,
sistemaPreferido varchar(25),
inicioRol date,
numPartidas int unsigned,
email varchar(50) unique,

constraint pk_jugador primary key (apodo),
constraint fk_jugador_usuario foreign key (email)
	references usuarios(email)
    on delete no action on update cascade
);

create table if not exists partida
(
titulo varchar(20),
numSesiones tinyint unsigned,
trasfondo varchar(500),
fechaInicio date,
apodo varchar(12),

constraint pk_partida primary key (titulo),
constraint fk_partida_jugador foreign key (apodo)
	references jugador(apodo)
    on delete no action on update cascade
    
);
    
DELIMITER $$
CREATE PROCEDURE cambiarNombres (in newname varchar(45), in oldname varchar(45))
BEGIN
update usuarios set nombre=newname where nombre=oldname;
END $$
DELIMITER ;