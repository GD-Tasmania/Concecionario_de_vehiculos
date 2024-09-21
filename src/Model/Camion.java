package Model;

public class Camion extends Vehiculo {
	private double capacidadCarga;
	private String tipoCamion;
	private double longitud;
	private int numeroEjes;
	
	public Camion(String marca, String modelo, int año, double capacidadCarga, String tipoCamion, double longitud, int numeroEjes) {
		super(marca, modelo, año);
		this.capacidadCarga = capacidadCarga;
		this.tipoCamion = tipoCamion;
		this.longitud = longitud;
		this.numeroEjes = numeroEjes;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public String getTipoCamion() {
		return tipoCamion;
	}
	public void setTipoCamion(String tipoCamion) {
		this.tipoCamion = tipoCamion;
	}

	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}
	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	}
	
}
