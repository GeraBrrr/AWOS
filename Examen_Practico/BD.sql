create database CURP;
create table Curp (
	nombre varchar(20) not null,
    primer_apellido varchar(20) not null,
	segundo_apellido varchar(20) not null,
    sexo char(2) not null,
    estado varchar(30) not null,
    fecha_nac date not null
);