DROP DATABASE IF EXISTS BDprogSamuelJimenez;
CREATE DATABASE IF NOT EXISTS BDprogSamuelJimenez;
USE BDprogSamuelJimenez;

CREATE TABLE IF NOT EXISTS Usuario (
	codUsuario int unsigned not null auto_increment,
    nombre VARCHAR(50),
    contrasenia VARCHAR(12),
    email VARCHAR(50) UNIQUE,
    edad INT UNSIGNED,
    CONSTRAINT pk_Usuario PRIMARY KEY (codUsuario)
);

insert into Usuario
(codUsuario, nombre, contrasenia, email, edad)
values
(1,'Samuel', 'pass123', 'samuel@gmail.com',28);

CREATE TABLE IF NOT EXISTS Jugadore (
	codJugador int unsigned not null auto_increment,
    apodo VARCHAR(12) UNIQUE,
    sistemaPreferido VARCHAR(25),
    inicioRol DATE,
    numPartidas INT UNSIGNED,
    codUsuario int unsigned,
    CONSTRAINT pk_Jugadore PRIMARY KEY (codJugador),
    CONSTRAINT fk_Jugadore_Usuario FOREIGN KEY (codUsuario)
        REFERENCES Usuario (codUsuario)
        ON DELETE NO ACTION ON UPDATE CASCADE
);

insert into Jugadore
(codJugador, apodo, sistemaPreferido, inicioRol, numPartidas, codUsuario)
values
(1,'Mapacherben','RyF','2010/02/17', 87,1);

CREATE TABLE IF NOT EXISTS Partida (
	codPartida int unsigned not null auto_increment,
    titulo VARCHAR(20),
    numSesiones TINYINT UNSIGNED,
    trasfondo VARCHAR(500),
    fechaInicio DATE,
    codJugador int unsigned,
    CONSTRAINT pk_Partida PRIMARY KEY (codPartida),
    CONSTRAINT fk_Partida_Jugadore FOREIGN KEY (codJugador)
        REFERENCES Jugadore (codJugador)
        ON DELETE NO ACTION ON UPDATE CASCADE
);

insert into Partida
(codPartida, titulo, numSesiones, trasfondo, fechaInicio, codJugador)
values
(1, 'La dama', 3, 'Una extraña carta llega a manos de los aventureros, una misteriosa mujer los reclama', '2022/08/10',1);

select * from Usuario;
select * from Jugadore;
select * from Partida;
