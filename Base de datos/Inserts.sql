insert into Empleado(Id_Empleado, Nombre_emp, Apellido_emp, Cedula_emp, Sexo_emp, Direccion_emp, Telefono_emp, Celular_emp, Usuario_emp, Contrasena_emp, Fecha_ini_emp, Categoria_emp)
values(1, 'Oscar', 'Ortiz', '402-2387933-5', 'm', 'Jaragua #48', '8293510616', '829-351-0616', 'Oscar', 'Oscar3031', '05/09/25', 'ADM');

insert into Referencia(id_referencia, nombre, apellido, cedula, telefono)
values(1, 'Jose', 'Perez', '048-0988765-8', '809-525-0967');

insert into Clientes(Id_Cliente, nombre, apellido, cedula, fecha_naci, sexo, direccion, telefono, correo_elec)
values(1, 'Juan', 'Perez', '048-9876587-6', '29/04/1990', 'm', 'Jara', '809-876-7865', 'dsfae_');

insert into tipo_Garante(id_Garante, nombre_completo, cedula, Fecha_naci, Sexo, Direccion, telefono)
values(1, 'Juan', '809234', '04/09/2017', 'm', 'Jara', '214294');

insert into solicitud(Id_Solicitud, Nombre_cliente, Cedula, Monto_prestamo, Correo_elec, Tipo_garante, Fecha_re, Id_empleado)
values(1, 'Oscar', '401-0987654-3', 1234, 'oscar_', 'jo', '02/09/2017', 1);

insert into Prestamo(Id_prestamo, Monto_deuda, Monto_restante, Monto_total, Itebis, Ganancias, Id_cliente, Fecha_prestamo, Estatus)
values(1, 150000,100000,170000,2000,20000,1,'12/09/2017', 'Pendiente');

insert into Ingreso(Id_ingreso, Id_prestamo, Monto)
values(1, 1, 1203344);

insert into Emple_pres(Id_Empleado ,Id_prestamo)
values (1, 1);

insert into Emple_Solici(Id_empleado, Id_Solicitud)
values(1, 1);

insert into solicitud(id_solicitud, Nombre_cliente, cedula, Monto_prestamo, Correo_elec, Tipo_garante, Fecha_re, id_empleado, Estatus)
values(4, 'Oscar', 'Ortiz', 12000, 'oscar_ortiz30@hotmail.es', 'Hipotecari', '13/11/2013', 1, 'Aprobado');

delete from Clientes where Id_Cliente = 5;