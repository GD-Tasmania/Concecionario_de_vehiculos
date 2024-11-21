package Model;

import java.time.LocalDate;
import java.util.Date;

public class Venta {
	private Cliente cliente;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private double precio;
	
	public Venta(Cliente cliente, Vehiculo vehiculo, double precio) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fecha = LocalDate.now();
		this.precio = precio;
	}
	
	public Cliente getCliente() { return cliente; }
	public void setCliente(Cliente cliente) { this.cliente = cliente; }
	
	public Vehiculo getVehiculo() { return vehiculo; }
	public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
	
	public LocalDate getFecha() { return fecha; }
	public void setFecha(LocalDate fecha) { this.fecha = fecha; }
	
	public double getPrecio() { return precio; }
	public void setPrecio(double precio) { this.precio = precio;}

	@Override
	public String toString() {
		return "Venta [cliente=" + cliente + ", vehiculo=" + vehiculo + ", \nfecha=" + fecha + ", precio=" + precio + "]\n";
	}
}
