package Model;

public class Motocicleta extends Vehiculo {
	private String tipoManillar;
	private int numeroRuedas;
	private String tipoFreno;
	private double cilindraje;
	
	public Motocicleta(String marca, String modelo, int año, String vin, String color, String placa, String tipoManillar, int numeroRuedas, String tipoFreno, double cilindraje) {
		super(marca, modelo, año, placa, vin, color);
		this.tipoManillar = tipoManillar;
		this.numeroRuedas = numeroRuedas;
		this.tipoFreno = tipoFreno;
		this.cilindraje = cilindraje;
	}

	public String getTipoManillar() { return tipoManillar; }
	public void setTipoManillar(String tipoManillar) { this.tipoManillar = tipoManillar; }

	public int getNumeroRuedas() { return numeroRuedas; }
	public void setNumeroRuedas(int numeroRuedas) { this.numeroRuedas = numeroRuedas; }

	public String getTipoFreno() { return tipoFreno; }
	public void setTipoFreno(String tipoFreno) { this.tipoFreno = tipoFreno; }

	public double getCilindraje() { return cilindraje; }
	public void setCilindraje(double cilindraje) { this.cilindraje = cilindraje; }
	
	@Override
	public double calculoCostoMantenimiento(double costo) {
		return costo+30000;
	}

	@Override
	public String toString() {
		String datosVehiculo = super.toString();
		return datosVehiculo + "Motocicleta [tipoManillar=" + tipoManillar + ", numeroRuedas=" + numeroRuedas + ", tipoFreno=" + tipoFreno + ", cilindraje=" + cilindraje + "]";
	}
	
	
}
