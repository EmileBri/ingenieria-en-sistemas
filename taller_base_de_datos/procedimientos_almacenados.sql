use Ejercicio

create table Producto(
Id_Del_Producto char(10) primary key,
NombreProducto char(10),
Stock int,
precio varchar (10),
precioV int
);

insert into Producto(Id_Del_Producto,NombreProducto,Stock,precio,precioV)
values(1,'Jeans',12,12,5)


--PROCEDIMIENTO ALMACENADO

--INSERT

alter procedure insertar_producto
@idProducto char(20),
@nombre char(20),
@existencia char (20),
@precio char (20),
@precioV char (20)
as
declare @total int
select @total=count(Id_Del_Producto) from Producto where Id_Del_Producto=@idProducto or NombreProducto=@nombre
if (@total<1)
	begin insert into Producto values (@idProducto,@nombre,@existencia,@precio,@precioV)
end
	else 
		begin
			print 'Este producto ya ha sido ingresado anteriormente'
end

exec insertar_producto 2,'pantalones',30,800,1000



--DELETE

create procedure eliminar_producto
@idProducto char(20)
as
declare @final int
select @final=count(Id_Del_Producto) from Producto where Id_Del_Producto=@idProducto 
if (@final=1)
	begin
		delete from Producto where Id_Del_Producto=@idProducto
end
	else 
		begin
			print 'Este producto ya ha sido eliminado anteriormente'
end

exec eliminar_producto 4


--UPDATE

create procedure actualizarDatos_producto
@idProducto char(20),
@nombre char(10),
@existencia char (20),
@precio char (20),
@precioV char (20)
as
	begin
		update Producto set  NombreProducto=@nombre,Stock=@existencia,precio=@precio,precioV=@precioV where Id_Del_Producto = @idProducto

end


exec actualizarDatos_producto 3,'Sudaderas',20,800,1000

select * from Producto