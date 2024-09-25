package Model;

import java.util.Date;

public class Venta {
	private Cliente cliente;
	private Vehiculo vehiculo;
	private Date fecha;
	private double precio;
	
	public Venta(Cliente cliente, Vehiculo vehiculo, Date fecha, double precio) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fecha = fecha;
		this.precio = precio;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Venta [cliente=" + cliente + ", vehiculo=" + vehiculo + ", fecha=" + fecha + ", precio=" + precio + "]";
	}
}
