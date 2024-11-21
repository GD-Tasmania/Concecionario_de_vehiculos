package Model;

public class Automovil extends Vehiculo {
	private int numeroPuertas;
	private String tipoCombustible;
	private String trasmision;
	private String traccion;

	public Automovil(String marca, String modelo, int año, String vin, String color, String placa, int numeroPuertas, String tipoCombustible, String trasmision, String traccion) {
		super(marca, modelo, año, placa, vin, color);
		this.numeroPuertas = numeroPuertas;
		this.tipoCombustible = tipoCombustible;
		this.trasmision = trasmision;
		this.traccion = traccion;
	}

	public int getNumeroPuertas() { return numeroPuertas; }
	public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

	public String getTipoCombustible() { return tipoCombustible; }
	public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

	public String getTrasmision() { return trasmision; }
	public void setTrasmision(String trasmision) { this.trasmision = trasmision; }

	public String getTraccion() { return traccion; }
	public void setTraccion(String traccion) { this.traccion = traccion; }

	@Override
	public String toString() {
		String datosVehiculo = super.toString();
		return datosVehiculo+"Automovil [numeroPuertas=" + numeroPuertas + ", tipoCombustible=" + tipoCombustible + ", trasmision=" + trasmision + ", traccion=" + traccion + "]";
	}
}
