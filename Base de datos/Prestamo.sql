create TABLESPACE Prestamo
datafile 'c:/Prestamo/Prestamo.dbf'
size 50m;

grant select any table to ADM;
grant select on system.empleado to adm;
GRANT SELECT, INSERT, UPDATE, DELETE ON Empleado TO ADM;


Create Table Clientes(
ID_cliente number not null,
Nombre_cli varchar2(20) not null,
Apellido_cli varchar2(20) not null,
Cedula_cli varchar2(14) not null,
Sexo_cli varchar2(1),
Ciudad_cli Varchar2(50),
Sector_cli Varchar2(50),
Calle_cli Varchar2(50),
NCasa_cli Varchar2(20),
Telefono_cli varchar2(13),
Celular_cli varchar2(13) not null,
Correo_cli varchar2(50),
constraint pk_Clientes primary key(Id_cliente))
tablespace prestamo;

Create Table Cliente_Empleo(
ID_Empleo number,
ID_Cliente number,
Nombre_Empresa Varchar2(75),
Direccion_Empresa Varchar2(200),
Puesto Varchar(50),
Ingresos_Clientes Number(9,2),
Constraint PK_Cliente_Empleo Primary Key (ID_Empleo,ID_Cliente),
Constraint FK_Cliente_Empleo Foreign Key (ID_Cliente) References Clientes(ID_Cliente))
tablespace prestamo;

Create Table Garantia_solidaria(
Id_GaranSolid number,
Nombre_solid varchar2(20) not null,
Cedula_solid varchar2(14) not null,
Sexo_solid varchar2(1),
Direccion_solid varchar2(200),
Telefono_solid varchar2(13),
Direccion_Empleo varchar2(200),
constraint pk_Garantia_Solidaria primary key(Id_GaranSolid))
tablespace prestamo;

Create Table Garantia_Hipotecaria(
ID_GaranHipo number,
Direccion_Vivienda Varchar2(200),
Tipo_Vivienda Varchar2(50),
Nombre_Dueno Varchar2(50),
Cedula_Dueno Varchar2(14),
Titulo_Propiedad Varchar2(50),
Constraint PK_Garantia_Hipotecaria Primary Key (ID_GaranHipo ))
tablespace prestamo;

Create Table Garantia_Prendaria(
ID_GaranPren number,
Marca_Vehiculo Varchar2(30),
Modelo_Vehiculo Varchar2(30),
Año_Vehiculo Date,
Matricula_Vehiculo Varchar2(15),
Dueno_vehiculo Varchar2(50),
Direccion_Dueno Varchar2(200),
Constraint PK_Garantia_Prendaria Primary Key (ID_GaranPren))
tablespace prestamo;

Create Table EMPLEADO(
ID_empleado number,
Nombre_emp varchar2(20) not null,
Apellido_emp varchar2(20) not null,
Cedula_emp varchar2(14) not null,
Sexo_emp varchar2(1),
Direccion_emp varchar2(100),
Telefono_emp varchar2(13),
Celular_emp varchar2(13),
Usuario_emp varchar2(10) not null,
Contrasena_emp varchar2(10) not null,
Fecha_ini_emp date,
Categoria_emp varchar2(3),
Constraint pk_Empleado primary key(Id_empleado))
tablespace prestamo;

create or REPLACE view Empleado as select * from empleado;

create table Solicitud_prestamo(
ID_solicitud Number,
ID_Cliente Number,
ID_GaranSolid Number null,
ID_GaranPren number null,
ID_GaranHipo number null,
Monto Number(9,2),
Plazo Varchar2(50),
Fecha_solicitud date,
Tipo_Prestamo Varchar2(25),
Constraint pk_solicitud_Prestamo Primary Key (ID_solicitud),
Constraint FK_Clientes_Solicitud Foreign Key (ID_Cliente) References Clientes (ID_Cliente),
Constraint FK_solidaria_solicitud Foreign Key (ID_GaranSolid) References Garantia_solidaria (ID_GaranSolid),
Constraint FK_prendaria_solicitud Foreign Key (ID_GaranPren) References Garantia_Prendaria (ID_GaranPren),
Constraint FK_hipotecaria_solicitud Foreign Key (ID_GaranHipo) References Garantia_Hipotecaria (ID_GaranHipo))
tablespace prestamo;


Create Table Prestamo_concedido(
ID_Prestamo number,
ID_solicitud Number,
Tasa_Interes Number(3),
Estado Varchar2(30),
Categoria Varchar2(10),
Fecha_Prestamo date,
Constraint PK_Prestamo_Concedido Primary Key (ID_Prestamo),
Constraint FK_Prestamo_Solicitud Foreign Key (ID_Solicitud) References Solicitud_Prestamo (ID_Solicitud))
tablespace prestamo;

Create Table Amortizacion(
ID_Amortizacion Number,
ID_Prestamo Number,
Cuotas Number(9,2),
Capital Number(9,2),
Interes number(9,2),
Monto Number(9,2),
Constraint PK_Amortizacion Primary Key (ID_Amortizacion),
Constraint FK_Amortizacion_Prestamo Foreign Key (ID_Prestamo) References Prestamo_Concedido (ID_Prestamo))
tablespace prestamo;

Create Table Facturacion(
ID_Factura Number,
ID_Amortizacion Number,
Fecha_Factura Date,
Constraint PK_Facturacion Primary Key (ID_Factura),
Constraint FK_Factura_Amortizacion Foreign Key (ID_Amortizacion) References Amortizacion (ID_Amortizacion))
tablespace prestamo;

Drop table clientes;
drop table cliente_Empleo;
drop table Empleado;
drop table garantia_Solidaria;
drop table garantia_prendaria;
drop table garantia_hipotecaria;
Drop table Solicitud_prestamo;
Drop table Prestamo_concedido;
Drop table Amortizacion;

create user ADM_Prestamo identified by Administrador;