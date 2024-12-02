package Modelo;

public class Administrador {
	
private int IdAministrador;
private String Nombre;
private int IdEmpleado;
private int IdMascota;
private int IdCliente1;
private int IdCliente2;
private int IdServicio;
private int IdAdopcion;

public int getIdAministrador() {
	return IdAministrador;
}
public void setIdAministrador(int idAministrador) {
	IdAministrador = idAministrador;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public int getIdEmpleado() {
	return IdEmpleado;
}
public void setIdEmpleado(int idEmpleado) {
	IdEmpleado = idEmpleado;
}
public int getIdMascota() {
	return IdMascota;
}
public void setIdMascota(int idMascota) {
	IdMascota = idMascota;
}
public int getIdCliente1() {
	return IdCliente1;
}
public void setIdCliente1(int idCliente1) {
	IdCliente1 = idCliente1;
}
public int getIdCliente2() {
	return IdCliente2;
}
public void setIdCliente2(int idCliente2) {
	IdCliente2 = idCliente2;
}
public int getIdServicio() {
	return IdServicio;
}
public void setIdServicio(int idServicio) {
	IdServicio = idServicio;
}
public int getIdAdopcion() {
	return IdAdopcion;
}
public void setIdAdopcion(int idAdopcion) {
	IdAdopcion = idAdopcion;
}
public Administrador(int idAministrador, String nombre, int idEmpleado, int idMascota, int idCliente1, int idCliente2,
		int idServicio, int idAdopcion) {
	super();
	IdAministrador = idAministrador;
	Nombre = nombre;
	IdEmpleado = idEmpleado;
	IdMascota = idMascota;
	IdCliente1 = idCliente1;
	IdCliente2 = idCliente2;
	IdServicio = idServicio;
	IdAdopcion = idAdopcion;
}
public Administrador() {
	super();
	// TODO Auto-generated constructor stub
}

}
