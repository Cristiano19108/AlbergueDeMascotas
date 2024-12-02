package Modelo;

public class Cliente2 {
	private int IdCliente2;
	private String Nombre;
	private String Apellido;
	private String Domicilio;
	private int Num_Telefonico;
	public int getIdCliente2() {
		return IdCliente2;
	}
	public void setIdCliente2(int idCliente2) {
		IdCliente2 = idCliente2;
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
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public int getNum_Telefonico() {
		return Num_Telefonico;
	}
	public void setNum_Telefonico(int num_Telefonico) {
		Num_Telefonico = num_Telefonico;
	}
	public Cliente2(int idCliente2, String nombre, String apellido, String domicilio, int num_Telefonico) {
		super();
		IdCliente2 = idCliente2;
		Nombre = nombre;
		Apellido = apellido;
		Domicilio = domicilio;
		Num_Telefonico = num_Telefonico;
	}
	public Cliente2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
