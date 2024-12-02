package Modelo;

public class Cliente1 {
	private int IdCliente1;
	private String Nombre;
	private String Apellido;
	private int Nu_Telefonico;
	public int getIdCliente1() {
		return IdCliente1;
	}
	public void setIdCliente1(int idCliente1) {
		IdCliente1 = idCliente1;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getNu_Telefonico() {
		return Nu_Telefonico;
	}
	public void setNu_Telefonico(int nu_Telefonico) {
		Nu_Telefonico = nu_Telefonico;
	}
	public Cliente1(int idCliente1, String nombre, String apellido, int nu_Telefonico) {
		super();
		IdCliente1 = idCliente1;
		Nombre = nombre;
		Apellido = apellido;
		Nu_Telefonico = nu_Telefonico;
	}
	public Cliente1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
