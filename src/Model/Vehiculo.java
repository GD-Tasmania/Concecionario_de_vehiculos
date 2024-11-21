package Model;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private String vin;
	private String color;
	private String placa;
	
	public Vehiculo(String marca, String modelo, int año, String vin, String color, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.vin = vin;
		this.color = color;
		this.placa = placa;
	}
	
	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }
	
	public String getModelo() { return modelo; }
	public void setModelo(String modelo) { this.modelo = modelo; }
	
	public int getAño() { return año; }
	public void setAño(int año) { this.año = año; }
	
	public String getVin() { return vin; }
	public void setVin(String vin) { this.vin = vin; }
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
	public String getPlaca() { return placa; }
	public void setPlaca(String placa) { this.placa = placa; }
	
	public double calculoCostoMantenimiento(double costo) {
		return costo+100000;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", vin=" + vin + ", color=" + color
				+ ", placa=" + placa + "]";
	}
}
