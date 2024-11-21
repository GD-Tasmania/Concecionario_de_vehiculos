package Model;

import java.time.LocalDate;

public class Mantenimiento {
	private String tipoMantenimiento;
	private LocalDate fecha;
	private double costo;
	private Vehiculo vehiculo;
	
	public Mantenimiento(String tipoMantenimiento, double costo, Vehiculo vehiculo) {
		this.tipoMantenimiento = tipoMantenimiento;
		this.fecha = LocalDate.now();
		this.costo = costo;
		this.vehiculo = vehiculo;
	}
	
	public String getTipoMantenimiento() { return tipoMantenimiento; }
	public void setTipoMantenimiento(String tipoMantenimiento) { this.tipoMantenimiento = tipoMantenimiento; }
	
	public LocalDate getFecha() { return fecha; }
	public void setFecha(LocalDate fecha) { this.fecha = fecha; }
	
	public double getCosto() { return costo; }
	public void setCosto(double costo) { this.costo = costo; }
	
	public Vehiculo getVehiculo() { return vehiculo; }
	public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

	@Override
	public String toString() {
		return "Mantenimiento [tipoMantenimiento=" + tipoMantenimiento + ", fecha=" + fecha + ", costo=" + costo
				+ ", \nvehiculo=" + vehiculo + "]";
	}
}
