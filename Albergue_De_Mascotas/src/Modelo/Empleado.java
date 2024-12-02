package Modelo;

public class Empleado {
	private int IdEmpleado;
	private String Nombre;
	private int Edad;
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public Empleado(int idEmpleado, String nombre, int edad) {
		super();
		IdEmpleado = idEmpleado;
		Nombre = nombre;
		Edad = edad;
	}
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
