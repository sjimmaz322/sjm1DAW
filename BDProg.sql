DROP DATABASE IF EXISTS BDprogSamuelJimenez;
CREATE DATABASE IF NOT EXISTS BDprogSamuelJimenez;
USE BDprogSamuelJimenez;

CREATE TABLE IF NOT EXISTS usuarios (
	codUsuario int unsigned not null auto_increment,
    nombre VARCHAR(50),
    contrasenia VARCHAR(12),
    email VARCHAR(50) UNIQUE,
    edad INT UNSIGNED,
    CONSTRAINT pk_usuarios PRIMARY KEY (codUsuario)
);

insert into usuarios
(codUsuario, nombre, contrasenia, email, edad)
values
(1,'Samuel', 'pass123', 'samuel@gmail.com',28);

CREATE TABLE IF NOT EXISTS jugadores (
	codJugador int unsigned not null auto_increment,
    apodo VARCHAR(12) UNIQUE,
    sistemaPreferido VARCHAR(25),
    inicioRol DATE,
    numPartidas INT UNSIGNED,
    codUsuario int unsigned,
    CONSTRAINT pk_jugadores PRIMARY KEY (codJugador),
    CONSTRAINT fk_jugadores_usuarios FOREIGN KEY (codUsuario)
        REFERENCES usuarios (codUsuario)
        ON DELETE NO ACTION ON UPDATE CASCADE
);

insert into jugadores
(codJugador, apodo, sistemaPreferido, inicioRol, numPartidas, codJugador)
values
(1,'Mapacherben','RyF','2010/02/17', 87, 1);

CREATE TABLE IF NOT EXISTS partidas (
	codPartida int unsigned not null auto_increment,
    titulo VARCHAR(20),
    numSesiones TINYINT UNSIGNED,
    trasfondo VARCHAR(500),
    fechaInicio DATE,
    codJugador int unsigned,
    CONSTRAINT pk_partidas PRIMARY KEY (codPartida),
    CONSTRAINT fk_partidas_jugadores FOREIGN KEY (codJugador)
        REFERENCES jugadores (codJugador)
        ON DELETE NO ACTION ON UPDATE CASCADE
);

insert into partidas
(codPartida, titulo, numSesiones, trasfondo, fechaInicio, codJugador)
values
(1, 'La dama', 3, 'Una extraña carta llega a manos de los aventureros, una misteriosa mujer los reclama', '2022/08/10',1);

select * from usuarios;
select * from jugadores;
select * from partidas;
