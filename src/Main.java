import Service.Concecionario;

import javax.swing.JOptionPane;

import Model.*;

public class Main {
	public static Concecionario c = new Concecionario();
	public static void main(String[] args) {
		// Cliente
		Cliente cliente = new Cliente("Tito", "SENA", "3218056116", "TITO23@GMAIL.COM");
		Cliente cliente2 = new Cliente("Tito2", "SENA2", "3218056116", "TITO23@GMAIL.COM2");
		c.agregarCliente(cliente);
		c.agregarCliente(cliente2);
		c.buscarCliente("Tito", "3218056116");
		Cliente lucho = c.buscarCliente("Tito", "3218056116");
		c.actualizarCliente("lucho", "UNIVERSIDAD", "3207787962", "LUCHO2@gmail.com", lucho);
		c.eliminarCliente("lucho", "3207787962");
		System.out.println("------------------------");
		
		
		// Vehiculo
		Vehiculo vehiculo = new Motocicleta("marca", "modelo", 2020, "placa", "tipo manillar", 4, "tipo de freno", 199.0);
		c.agregarVehiculo(vehiculo);
		Vehiculo vehiculo2 = new Motocicleta("marca2", "modelo2", 2020, "placa2", "tipo manillar2", 4, "tipo de freno2", 199.0);
		c.agregarVehiculo(vehiculo2);

		Vehiculo mcquen = c.buscarVehiculo("placa");
		String marca = "marca3";
		String modelo = "modelo3";
		int año = 2018;
		String placa = "placa3";
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el nuevo tipo de automovil:\n1. Automovil\n2. Motocicleta\n3. Camion"));
		if(opcion == 1) {
			System.out.println("Automovil");
		} else if(opcion == 2) {
			System.out.println("Motocicleta");
			String tipoManillar = "tipo manillar 3";
			int numeroRuedas = 3;
			String tipoFreno = "tipo freno 3";
			double cilindraje = 125.0;
			Vehiculo vActualizado = new Motocicleta(marca, modelo, año, placa, tipoManillar, numeroRuedas, tipoFreno, cilindraje);
			//c.actualizarVehiculo(mcquen, vActualizado);
		}
		//c.eliminarVehiculo("placa3");
		System.out.println("-------------------------");
		registrarVenta();
		registrarVenta2();
		int filtro = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el tipo de filtro:\n1. Cliente\n2. Vehiculo\n3. Fecha"));
		// Luego pide los datos del cliente, nombre-telefono, luego busca ese cliente y lo trae, y ese es el que se pasa por parametro.
		c.consultarVentas(cliente2, vehiculo2, null, filtro);
	}
	
	public static void registrarVenta() {
		String nombre = "Tito2";
		String telefono = "3218056116";
		String placa = "placa2";
		
		Cliente cliente = c.buscarCliente(nombre, telefono);
		Vehiculo vehiculo = c.buscarVehiculo(placa);
		
		Venta venta = new Venta(cliente, vehiculo, null, 5000000);
		c.registrarVenta(venta);
	}
	public static void registrarVenta2() {
		String nombre = "Tito2";
		String telefono = "3218056116";
		String placa = "placa";
		
		Cliente cliente = c.buscarCliente(nombre, telefono);
		Vehiculo vehiculo = c.buscarVehiculo(placa);
		
		Venta venta = new Venta(cliente, vehiculo, null, 6000000);
		c.registrarVenta(venta);
	}
}
