package Model;

import java.util.ArrayList;

import Controller.VentaInventario;

public class Inventario implements VentaInventario {
	private int disponibilidad;
	private Vehiculo vehiculo;
	
	
	public Inventario(int disponibilidad, Vehiculo vehiculo) {
		this.disponibilidad = disponibilidad;
		this.vehiculo = vehiculo;
	}
	
	public int getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Inventario [disponibilidad=" + disponibilidad + ", \nvehiculo=" + vehiculo + "]\n";
	}

	@Override
	public int disminuirInventario() {
		this.disponibilidad = this.disponibilidad-1;
		return this.disponibilidad;
	}
}
