package Modelo;

import java.time.LocalDate;

public class Adopcion {
	private int IdAdopcion;
	private int IdCliente2;
	private int IdMascota;
	private LocalDate FechaAdopcion;
	private int IdEmpleado;
	public int getIdAdopcion() {
		return IdAdopcion;
	}
	public void setIdAdopcion(int idAdopcion) {
		IdAdopcion = idAdopcion;
	}
	public int getIdCliente2() {
		return IdCliente2;
	}
	public void setIdCliente2(int idCliente2) {
		IdCliente2 = idCliente2;
	}
	public int getIdMascota() {
		return IdMascota;
	}
	public void setIdMascota(int idMascota) {
		IdMascota = idMascota;
	}
	public LocalDate getFechaAdopcion() {
		return FechaAdopcion;
	}
	public void setFechaAdopcion(LocalDate fechaAdopcion) {
		FechaAdopcion = fechaAdopcion;
	}
	public int getIdEmpleado() {
		return IdEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}
	public Adopcion(int idAdopcion, int idCliente2, int idMascota, LocalDate fechaAdopcion, int idEmpleado) {
		super();
		IdAdopcion = idAdopcion;
		IdCliente2 = idCliente2;
		IdMascota = idMascota;
		FechaAdopcion = fechaAdopcion;
		IdEmpleado = idEmpleado;
	}
	public Adopcion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
