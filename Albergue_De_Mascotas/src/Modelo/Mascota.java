package Modelo;

public class Mascota {
	private int IdMascota;
	private String Nombre;
	private String Raza;
	private int Edad;
	private boolean Sexo;
	public int getIdMascota() {
		return IdMascota;
	}
	public void setIdMascota(int idMascota) {
		IdMascota = idMascota;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public boolean isSexo() {
		return Sexo;
	}
	public void setSexo(boolean sexo) {
		Sexo = sexo;
	}
	public Mascota(int idMascota, String nombre, String raza, int edad, boolean sexo) {
		super();
		IdMascota = idMascota;
		Nombre = nombre;
		Raza = raza;
		Edad = edad;
		Sexo = sexo;
	}
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
