create database CURP;
create table CURP (
ID int (2) not null,
Nombre varchar(20) not null,
Apellido_paterno varchar(20) not null,
Apellido_materno varchar(20) not null,
Sexo varchar(2) not null,
Abr_estado varchar(2) not null,
dia_nac varchar(2) not null,
mes_nac varchar(2) not null,
anio_nac varchar(2) not null,
CURP varchar (20)
);

insert into CURP (ID, Nombre, Apellido_paterno, Apellido_materno, Sexo, Abr_estado, dia_nac, mes_nac, anio_nac, curp)
values (1, "Gerardo", "Castro", "Barrera", "H", "MS", "20","03","03", "CABG030320HMSSRRA1");