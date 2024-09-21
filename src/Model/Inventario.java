package Model;

import java.util.ArrayList;

public class Inventario {
	private int disponibilidad;
	private ArrayList<Vehiculo> vehiculos;
	
	
	public Inventario(int disponibilidad, ArrayList<Vehiculo> vehiculo) {
		this.disponibilidad = disponibilidad;
		this.vehiculos = vehiculo;
	}
	
	public int getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	public ArrayList<Vehiculo> getVehiculo() {
		return vehiculos;
	}
	public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
		this.vehiculos = vehiculo;
	}
}
