package Model;

import java.util.ArrayList;

public class Inventario {
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
}
