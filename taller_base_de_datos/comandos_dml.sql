create database Tarea1_3

use Tarea1_3

create table Territorio(
Id char(20) primary key,
Ubicacion nvarchar(30),
Tipo_territorio varchar(40)
);


create table Empleado(
Numero_De_Empleado char(20) primary key,
Nombre nvarchar (10),
Apellido nvarchar (10),
Direccion nvarchar(20),
Genero nvarchar(10),
Salario varchar(10),
Telefono char(30)
);


create table Orden_De_Compra(
Numero_Compra char(30) primary key,
Clave_Rastreo char(30),
Fecha_Compra nvarchar(30)
);


create table Producto(
Id_Producto char(30) primary key,
Marca nvarchar (10),
Peso char(20),
Stock char(20)
);


create table Orden_Producto(
Numero_de_Compra char(30),
CONSTRAINT Numero_deCompra FOREIGN KEY (Numero_de_Compra)REFERENCES Orden_De_Compra(Numero_Compra),
Id_del_Producto char(30),
CONSTRAINT Id_delProducto FOREIGN KEY (Id_del_Producto)REFERENCES Producto(Id_Producto)
);


create table Cliente(
Id char(30) primary key,
Numero_De_Telefono char(10),
Nombre nvarchar(30),
Apellido nvarchar(30),
Direccion nvarchar(30),
Genero nvarchar (30)
);


create table Grupo_Clientes(
Id char(30) primary key,
Nombre_Del_Grupo varchar(30)
);


create table Proveedor(
Id_del_Proveedor char(30) primary key,
Nombre nvarchar(40),
Direccion nvarchar(30),
Telefono char(10)
);


create table Producto_Proveedor(
Id_del_Producto char(30),
CONSTRAINT IdDel_Producto FOREIGN KEY (Id_del_Producto)REFERENCES Producto(Id_Producto),
Id_Proveedor char(30),
CONSTRAINT Id_DelProveedor FOREIGN KEY (Id_Proveedor)REFERENCES Proveedor(Id_del_Proveedor)
);


insert into Territorio(Id,Ubicacion,Tipo_territorio)
values(6866,'Canada','Privado')

insert into Empleado(Numero_De_Empleado,Nombre,Apellido,Direccion,Genero,Salario,Telefono)
values(6868,'Daniel','Medrano','Victoria','Hombre',30500,8341267412)

insert into Orden_De_Compra(Numero_Compra, Clave_Rastreo, Fecha_Compra)
values(7973,1243,06-04-2020)

insert into Producto(Id_Producto,Marca,Peso,Stock)
values(9798,'Samsung',700,8)

insert into Orden_Producto(Numero_de_Compra,Id_del_Producto)
values(8982,6543)

insert into Cliente(Id,Numero_De_Telefono,Nombre,Apellido,Direccion,Genero)
values(8763,8343456523,'Edna','Wong','Aldama','Mujer')

insert into Grupo_Clientes(Id,Nombre_Del_Grupo)
values(7978,'Estudiantes')

insert into Proveedor(Id_del_Proveedor,Nombre,Direccion,Telefono)
values(5678,'Giovanni','Azteca',8346789876)

insert into Producto_Proveedor(Id_del_Producto,Id_Proveedor)
values(6789,9876)

