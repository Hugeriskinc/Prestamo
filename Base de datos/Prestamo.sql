create table Referencia(
Id_Referencia numeric(7) not null,
Nombre varchar2(20) not null,
Apellido varchar2(20) not null,
Cedula varchar2(14) not null,
Telefono varchar2(13),
constraint pk_Referencia primary key(Id_Referencia));

create table Empleado(
Id_empleado numeric(7) not null,
Nombre varchar2(20) not null,
Apellido varchar2(20) not null,
Cedula varchar2(14) not null,
Fecha_naci date,
Sexo varchar2(1),
Direccion varchar2(100),
Telefono varchar2(13),
Usuario varchar2(10) not null,
Contrasena varchar2(10) not null,
Fecha_ini date,
Categoria varchar2(3),
id_Referencia numeric(7) not null,
constraint pk_Empleado primary key(Id_empleado),
constraint fk_referencia foreign key(id_Referencia) references Referencia(id_referencia));


create table Tipo_Garante(
Id_Garante numeric(7) not null,
Nombre_completo varchar2(20) not null,
Cedula varchar2(14) not null,
Fecha_naci date,
Sexo varchar2(1),
Direccion varchar2(30),
Telefono varchar2(13),
Tipo varchar2(10),
constraint pk_Tipo_Garante primary key(Id_Garante));

create table Clientes(
Id_cliente numeric(7) not null,
Nombre varchar2(20) not null,
Apellido varchar2(20) not null,
Cedula varchar2(14) not null,
Fecha_naci date,
Sexo varchar2(1),
Direccion varchar2(30),
Telefono varchar2(13),
Correo_elec varchar2(50),
constraint pk_Cliente primary key(Id_cliente));

create table Solicitud(
Id_Solicitud numeric(7) not null,
Nombre_cliente varchar2(20),
Cedula varchar2(15) not null,
Monto_prestamo numeric(20),
Correo_elec varchar2(50),
Tipo_garante varchar2(10),
Fecha_re date,
Id_empleado numeric(7) not null,
Estatus varchar2(20),
constraint pk_solicutid primary key(Id_solicitud)
);

create table Prestamo(
Id_prestamo numeric(10) not null,
Monto_deuda numeric(38),
Monto_restante numeric(38),
Monto_total numeric(38),
Tipo_pago varchar2(20),
Itebis numeric(38),
Ganancias numeric(38),
Id_cliente numeric(7),
Fecha_prestamo date,
Estatus varchar2(10),
constraint pk_Prestamo primary key(Id_prestamo),
constraint fk_Client foreign key(Id_cliente) references Clientes(Id_cliente));

create table Amortizacion(
Id_amortizacion numeric(10),
Monto_total varchar2(20),
Interes varchar2(20),
Plazo varchar2(20),
Cuotas varchar2(20),
DeudaM varchar2(20),
Fecha date,
Id_prestamo numeric(10),
Estado varchar2(20),
constraint fk_Prestamo2 foreign key(Id_prestamo) references Prestamo(Id_prestamo)
);

create table factura(
Id_factura numeric(7) not null,
Id_Cliente numeric(7) not null,
Id_prestamo numeric(7) not null,
Id_empleado numeric(7) not null,
Monto_pagado numeric(38),
Monto_restante numeric(38),
Id_amortizacion numeric(10), 
Fecha date,
constraint pk_Factura primary key(Id_factura),
constraint fk_Cliente1 foreign key(Id_cliente) references Clientes(Id_cliente),
constraint fk_Prestamo1 foreign key(Id_prestamo) references Prestamo(Id_prestamo),
constraint fk_empleado foreign key(Id_empleado) references Empleado(Id_empleado));

create table Ingreso(
id_ingreso numeric(10) not null,
Id_prestamo numeric(10) not null,
Monto numeric(38),
constraint pk_Igreso primary key(Id_ingreso),
constraint fk_Prestamo foreign key(Id_prestamo) references Prestamo(Id_prestamo));

create table Emple_Solici(
Id_empleado numeric(7) not null,
Id_Solicitud numeric(7) not null,
constraint fk_empl foreign key(Id_empleado) references Empleado(Id_empleado),
constraint fk_Soli foreign key(Id_Solicitud) references Solicitud(Id_Solicitud)
);

create table Emple_pres(
Id_Empleado numeric(7) not null,
Id_prestamo numeric(7) not null,
constraint fk_emple foreign key(Id_empleado) references Empleado(Id_empleado),
constraint fk_prestamo3 foreign key(Id_prestamo) references Prestamo(Id_prestamo)
);

drop table Emple_Solici;
drop table Emple_pres;
drop table Factura;
drop table Ingreso;
drop table Prestamo;
drop table Clientes;
drop table Tipo_Garante;
drop table Solicitud;
drop table Empleado;
drop table amortizacion;
drop table Referencia;