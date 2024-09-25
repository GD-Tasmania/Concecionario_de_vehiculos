package Model;

import java.util.Date;

public class Mantenimiento {
	private String tipoMantenimiento;
	private Date fecha;
	private double costo;
	private Vehiculo vehiculo;
	
	public Mantenimiento(String tipoMantenimiento, Date fecha, double costo, Vehiculo vehiculo) {
		this.tipoMantenimiento = tipoMantenimiento;
		this.fecha = fecha;
		this.costo = costo;
		this.vehiculo = vehiculo;
	}
	
	public String getTipoMantenimiento() {
		return tipoMantenimiento;
	}
	public void setTipoMantenimiento(String tipoMantenimiento) {
		this.tipoMantenimiento = tipoMantenimiento;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Mantenimiento [tipoMantenimiento=" + tipoMantenimiento + ", fecha=" + fecha + ", costo=" + costo
				+ ", vehiculo=" + vehiculo + "]";
	}
}
