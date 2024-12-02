package Modelo;

import java.time.LocalDate;


public class Servicio {
	private int IdServicio;
	private LocalDate Fecha;
	private int IdMascota;
	private int IdCliente2;
	public int getIdServicio() {
		return IdServicio;
	}
	public void setIdServicio(int idServicio) {
		IdServicio = idServicio;
	}
	public LocalDate getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}
	public int getIdMascota() {
		return IdMascota;
	}
	public void setIdMascota(int idMascota) {
		IdMascota = idMascota;
	}
	public int getIdCliente2() {
		return IdCliente2;
	}
	public void setIdCliente2(int idCliente2) {
		IdCliente2 = idCliente2;
	}
	public Servicio(int idServicio, LocalDate fecha, int idMascota, int idCliente2) {
		super();
		IdServicio = idServicio;
		Fecha = fecha;
		IdMascota = idMascota;
		IdCliente2 = idCliente2;
	}
	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
