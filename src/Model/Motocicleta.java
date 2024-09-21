package Model;

public class Motocicleta extends Vehiculo {
	private String tipoManillar;
	private int numeroRuedas;
	private String tipoFreno;
	private double cilindraje;
	
	public Motocicleta(String marca, String modelo, int año, String tipoManillar, int numeroRuedas, String tipoFreno, double cilindraje) {
		super(marca, modelo, año);
		this.tipoManillar = tipoManillar;
		this.numeroRuedas = numeroRuedas;
		this.tipoFreno = tipoFreno;
		this.cilindraje = cilindraje;
	}

	public String getTipoManillar() {
		return tipoManillar;
	}
	public void setTipoManillar(String tipoManillar) {
		this.tipoManillar = tipoManillar;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getTipoFreno() {
		return tipoFreno;
	}
	public void setTipoFreno(String tipoFreno) {
		this.tipoFreno = tipoFreno;
	}

	public double getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(double cilindraje) {
		this.cilindraje = cilindraje;
	}
}
