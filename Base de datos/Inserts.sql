insert into Empleado(Id_Empleado, Nombre_emp, Apellido_emp, Cedula_emp, Sexo_emp, Direccion_emp, Telefono_emp, Celular_emp, Usuario_emp, Contrasena_emp, Fecha_ini_emp, Categoria_emp)
values(1, 'Oscar', 'Ortiz', '402-2387933-5', 'm', 'Jaragua #48', '8293510616', '829-351-0616', 'Oscar', 'Oscar3031', '05/09/25', 'ADM');

insert into Referencia(id_referencia, nombre, apellido, cedula, telefono)
values(1, 'Jose', 'Perez', '048-0988765-8', '809-525-0967');

insert into Clientes(Id_Cliente, nombre, apellido, cedula, fecha_naci, sexo, direccion, telefono, correo_elec)
values(1, 'Juan', 'Perez', '048-9876587-6', '29/04/1990', 'm', 'Jara', '809-876-7865', 'dsfae_');

insert into tipo_Garante(id_Garante, nombre_completo, cedula, Fecha_naci, Sexo, Direccion, telefono)
values(1, 'Juan', '809234', '04/09/2017', 'm', 'Jara', '214294');

insert into Solicitud_prestamo(ID_solicitud, ID_Cliente, ID_GaranSolid, ID_GaranPren, ID_GaranHipo, Monto, Plazo, Fecha_solicitud, Tipo_Prestamo)
values(1, 1, null, null, null, 500000, '12 meses', '18/04/2018', 'Pendiente');

insert into Prestamo(Id_prestamo, Monto_deuda, Monto_restante, Monto_total, Itebis, Ganancias, Id_cliente, Fecha_prestamo, Estatus)
values(1, 150000,100000,170000,2000,20000,1,'12/09/2017', 'Pendiente');

insert into Ingreso(Id_ingreso, Id_prestamo, Monto)
values(1, 1, 1203344);

insert into Emple_pres(Id_Empleado ,Id_prestamo)
values (1, 1);

insert into Emple_Solici(Id_empleado, Id_Solicitud)
values(1, 1);

insert into solicitud_prestamo(id_solicitud, ID_Cliente, ID_GaranSolid, ID_GaranPren, ID_GaranHipo, Monto, Plazo, Fecha_solicitud, Tipo_Prestamo)
values(2, 1, 1, null, null, 50000, 12, '20/04/2018', 'Personal');

delete from empleado where Id_empleado = 4;