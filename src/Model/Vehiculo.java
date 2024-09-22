package Model;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private String placa;
	
	public Vehiculo(String marca, String modelo, int año, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", placa=" + placa + "]\n";
	}
	
}
