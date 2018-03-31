Create Table Clientes(
ID_cliente numeric(7) not null,
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
constraint pk_Clientes primary key(Id_cliente));

select * from clientes;

Create Table Cliente_Empleo(
ID_Empleo numeric(7),
ID_Cliente numeric(7),
Nombre_Empresa Varchar2(75),
Direccion_Empresa Varchar2(200),
Puesto Varchar(50),
Ingresos_Clientes Numeric(9,2),
Constraint PK_Cliente_Empleo Primary Key (ID_Empleo,ID_Cliente),
Constraint FK_Cliente_Empleo Foreign Key (ID_Cliente) References Clientes(ID_Cliente));

Create Table Garantia_solidaria(
Id_GaranSolid numeric(7),
Nombre_solid varchar2(20) not null,
Cedula_solid varchar2(14) not null,
Sexo_solid varchar2(1),
Direccion_solid varchar2(200),
Telefono_solid varchar2(13),
Direccion_Empleo varchar2(200),
constraint pk_Garante_Persona primary key(Id_Garante));

Create Table Garantia_Hipotecaria(
ID_GaranHipo Numeric(7),
Direccion_Vivienda Varchar2(200),
Tipo_Vivienda Varchar2(50),
Nombre_Dueno Varchar2(50),
Cedula_Dueno Varchar2(14),
Titulo_Propiedad Varchar2(50),
Constraint PK_Garantia_Hipotecaria Primary Key (ID_GaranHipo )
);

Create Table Garantia_Prendaria(
ID_GaranPren Numeric(7),
Marca_Vehiculo Varchar2(30),
Modelo_Vehiculo Varchar2(30),
Año_Vehiculo Date,
Matricula_Vehiculo Varchar2(15),
Dueno_vehiculo Varchar2(50),
Direccion_Dueno Varchar2(200),
Constraint PK_Garantia_Prendaria Primary Key (ID_GaranPren) 
);

Create Table Empleado(
ID_empleado Numeric(7) not null,
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
Constraint pk_Empleado primary key(Id_empleado));

select * from empleado;
drop table empleado;

create user ADM identified by Administrador;