import Service.Concecionario;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.*;

public class Main {
	public static Concecionario c = new Concecionario();
	public static Inventario inventario = new Inventario(0, null);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		String menu = menu();
		
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
			if (opcion >= 1 && opcion <= 5) {
				int opcSubMenu = Integer.parseInt(JOptionPane.showInputDialog(null, getSubMenu(opcion)));
				opcionesSubMenu(opcion, opcSubMenu);
			}
		} while(opcion != 6);
	}
	
	/* ---------- MENUS ---------- */
	private static String menu() {
		String menu = "Ingrese una opcion:\n"
				+ "1. Vehiculos.\n"
				+ "2. Clientes.\n"
				+ "3. Ventas.\n"
				+ "4. Inventario.\n"
				+ "5. Mantenimiento.\n"
				+ "6. Salir.";
		return menu;
	}
	
	private static String getSubMenu(int menu) {
		String subMenu = "Ingrese una opcion:\n";
		switch (menu) {
		case 1:
			subMenu += "1. Buscar vehiculo.\n"
					+ "2. Añadir vehiculo.\n"
					+ "3. Actualizar información del vehículo.\n"
					+ "4. Eliminar vehiculo.\n"
					+ "5. Volver";
			break;
		case 2:
			subMenu += "1. Buscar cliente.\n"
					+ "2. Añadir cliente.\n"
					+ "3. Actualizar información del cliente.\n"
					+ "4. Eliminar cliente.\n"
					+ "5. Volver";
			break;
		case 3:
			subMenu += "1. Registrar venta.\n"
					+ "2. Consultar ventas.\n"
					+ "3. Volver";
			break;
		case 4:
			subMenu += "1. Registrar vehiculo en el inventario.\n"
					+ "2. Actualizar inventario.\n"
					+ "3. Eliminar vehiculo del inventario.\n"
					+ "4. Consultar inventario.\n"
					+ "5. Volver.";
			break;
		case 5:
			subMenu += "1. Registrar mantenimiento.\n"
					+ "2. Consultar mantenimiento.\n"
					+ "3. Volver";
			break;
		default:
			break;
		}
		return subMenu;
	}
	
	private static void opcionesSubMenu(int opcion, int subMenu) {
		switch (opcion) {
		case 1:
			opcionesVehiculos(subMenu);
			break;
		case 2:
			opcionesClientes(subMenu);
			break;
		case 3:
			opcionesVentas(subMenu);
			break;
		case 4:
			opcionesInventario(subMenu);
			break;
		case 5:
			opcionesMantenimiento(subMenu);
			break;
		default:
			break;
		}
	}
	
	/* ---------- VEHICULOS ---------- */
	public static void opcionesVehiculos(int subMenu) {
		switch (subMenu) {
		case 1:
			buscarVehiculo();
			break;
		case 2:
			agregarVehiculo();
			break;
		case 3:
			actualizarVehiculo();
			break;
		case 4:
			eliminarVehiculo();
			break;
		default:
			break;
		}
	}
	
	public static void buscarVehiculo() {
		String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
		Vehiculo vehiculo = c.buscarVehiculo(placa);
		if(vehiculo != null) {			
			JOptionPane.showMessageDialog(null, vehiculo.toString());
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no existe");
		}
	}
	
	public static void agregarVehiculo() {
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de vehiculo: \n"
				+ "1. Automóvil.\n" + "2. Motocicleta.\n" + "3. Camion."));
		
		String marca = JOptionPane.showInputDialog("Ingrese la marca: ");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
		int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricación: "));
		String vin = JOptionPane.showInputDialog("Ingrese el VIN: ");
		String color = JOptionPane.showInputDialog("Ingrese el color: ");
		String placa = JOptionPane.showInputDialog("Ingrese la placa: ");
		
		if(tipo == 1) {
			int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas: "));
			String tipoCombustible = JOptionPane.showInputDialog("Ingrese el tipo de combustible: ");
			String trasmision = JOptionPane.showInputDialog("Ingrese el tipo de trasmisión: ");
			String traccion = JOptionPane.showInputDialog("Ingrese el tipo de tracción: ");
			
			Vehiculo vehiculo = new Automovil(marca, modelo, año, vin, color, placa, numeroPuertas, tipoCombustible, trasmision, traccion);
			JOptionPane.showMessageDialog(null, c.agregarVehiculo(vehiculo));
		} else if(tipo == 2) {
			String tipoManillar = JOptionPane.showInputDialog("Ingrese el tipo de manillar: ");
			int numeroRuedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas: "));
			String tipoFrenos = JOptionPane.showInputDialog("Ingrese el tipo de frenos: ");
			double cilindraje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cilindraje: "));
			
			Vehiculo vehiculo = new Motocicleta(marca, modelo, año, vin, color, placa, tipoManillar, numeroRuedas, tipoFrenos, cilindraje);
			JOptionPane.showMessageDialog(null, c.agregarVehiculo(vehiculo));
		} else if(tipo == 3){
			double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga: "));
			String tipoCamion = JOptionPane.showInputDialog("Ingrese el tipo de camión: ");
			double longitud = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud: "));
			int numeroEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ejes: "));
			
			Vehiculo vehiculo = new Camion(marca, modelo, año, vin, color, placa, capacidad, tipoCamion, longitud, numeroEjes);
			JOptionPane.showMessageDialog(null, c.agregarVehiculo(vehiculo));
		} else {
			JOptionPane.showMessageDialog(null, "Opcion incorrecta");
		}
	}
	
	public static void actualizarVehiculo() {
		String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo: ");
		Vehiculo vehiculo = c.buscarVehiculo(placa);
		
		if(vehiculo != null) {
			String marca = JOptionPane.showInputDialog("Ingrese la marca: ");
			String modelo = JOptionPane.showInputDialog("Ingrese el modelo: ");
			int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricación: "));
			String vin = JOptionPane.showInputDialog("Ingrese el VIN: ");
			String color = JOptionPane.showInputDialog("Ingrese el color: ");
			
			int tipo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el nuevo tipo de automovil:\n1. Automovil\n2. Motocicleta\n3. Camion"));
			
			if(tipo == 1) {
				int numeroPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas: "));
				String tipoCombustible = JOptionPane.showInputDialog("Ingrese el tipo de combustible: ");
				String trasmision = JOptionPane.showInputDialog("Ingrese el tipo de trasmisión: ");
				String traccion = JOptionPane.showInputDialog("Ingrese el tipo de tracción: ");
				
				JOptionPane.showMessageDialog(null, c.actualizarVehiculo(vehiculo, marca, modelo, año, vin, color, placa, numeroPuertas, tipoCombustible, trasmision, traccion));
			} else if(tipo == 2) {
				String tipoManillar = JOptionPane.showInputDialog("Ingrese el tipo de manillar: ");
				int numeroRuedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ruedas: "));
				String tipoFrenos = JOptionPane.showInputDialog("Ingrese el tipo de frenos: ");
				double cilindraje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el cilindraje: "));
				
				JOptionPane.showMessageDialog(null, c.actualizarVehiculo(vehiculo, marca, modelo, año, vin, color, placa, tipoManillar, numeroRuedas, tipoFrenos, cilindraje));
			} else if(tipo == 3){
				double capacidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga: "));
				String tipoCamion = JOptionPane.showInputDialog("Ingrese el tipo de camión: ");
				double longitud = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud: "));
				int numeroEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ejes: "));
				
				JOptionPane.showMessageDialog(null, c.actualizarVehiculo(vehiculo, marca, modelo, año, vin, color, placa, capacidad, tipoCamion, longitud, numeroEjes));
			} else {
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no existe");
		}
	}
	
	public static void eliminarVehiculo() {
		String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
		JOptionPane.showMessageDialog(null, c.eliminarVehiculo(placa));
	}
	
	/* ---------- CLIENTES ---------- */
	public static void opcionesClientes(int subMenu) {
		switch (subMenu) {
		case 1:
			buscarCliente();
			break;
		case 2:
			agregarCliente();
			break;
		case 3:
			actualizarCliente();
			break;
		case 4:
			eliminarCliente();
			break;
		default:
			break;
		}
	}
	
	public static void buscarCliente() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
		String telefono = JOptionPane.showInputDialog("Ingrese el telefono:");
		Cliente cliente = c.buscarCliente(nombre, telefono);
		if(cliente != null) {			
			JOptionPane.showMessageDialog(null, cliente.toString());
		} else {
			JOptionPane.showMessageDialog(null, "El cliente no existe");
		}
	}
	
	public static void agregarCliente() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
		String direccion = JOptionPane.showInputDialog("Ingrese la direccion:");
		String telefono = JOptionPane.showInputDialog("Ingrese el telefono:");
		String correo = JOptionPane.showInputDialog("Ingrese el correo:");
		Cliente cliente = new Cliente(nombre, direccion, telefono, correo);
        
        JOptionPane.showMessageDialog(null, c.agregarCliente(cliente));
	}
	
	public static void actualizarCliente() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
		String telefono = JOptionPane.showInputDialog("Ingrese el telefono:");
		Cliente cliente = c.buscarCliente(nombre, telefono);
		
		if(cliente != null) {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
			telefono = JOptionPane.showInputDialog("Ingrese el telefono: ");
			String direccion = JOptionPane.showInputDialog("Ingrese la direccion:");
			String correo = JOptionPane.showInputDialog("Ingrese el correo:");
			JOptionPane.showMessageDialog(null, c.actualizarCliente(cliente, nombre, direccion, telefono, correo));
		} else {
			JOptionPane.showMessageDialog(null, "El cliente no existe");
		}
	}
	
	public static void eliminarCliente() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
		String telefono = JOptionPane.showInputDialog("Ingrese el telefono:");
		JOptionPane.showMessageDialog(null, c.eliminarCliente(nombre, telefono));
	}
	
	/* ---------- VENTAS ---------- */
	public static void opcionesVentas(int subMenu) {
		switch (subMenu) {
		case 1:
			registrarVenta();
			break;
		case 2:
			consultarVentas();
			break;
		default:
			break;
		}
	}
	
	public static void registrarVenta() {
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
		String celular = JOptionPane.showInputDialog("Ingrese el celular del cliente:");
		Cliente cliente = c.buscarCliente(nombre, celular);
		
		String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
		Vehiculo vehiculo = c.buscarVehiculo(placa);
		
		if(actualizarInventario(vehiculo) == true) {
			double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la venta"));
			
			Venta venta = new Venta(cliente, vehiculo, precio);
			JOptionPane.showMessageDialog(null, c.registrarVenta(venta));
		}
	}
	
	public static void consultarVentas() {
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de filtro: \n"
				+ "1. Por cliente.\n" + "2. Por vehiculo.\n" + "3. Por fecha."));
		
		if(tipo==1) {
			String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
			String celular = JOptionPane.showInputDialog("Ingrese el celular del cliente:");
			Cliente cliente = c.buscarCliente(nombre, celular);
			
			JOptionPane.showMessageDialog(null, c.consultarVentas(cliente));
		} else if(tipo==2) {
			String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
			Vehiculo vehiculo = c.buscarVehiculo(placa);
			
			JOptionPane.showMessageDialog(null, c.consultarVentas(vehiculo));
		} else if(tipo==3) {
			int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la venta: "));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la venta (numero): "));
			int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de la venta: "));
			LocalDate fecha = LocalDate.of(año, mes, dia);
			JOptionPane.showMessageDialog(null, c.consultarVentas(fecha));
		} else {
			consultarVentas();
		}
	}
	
	/* ---------- INVENTARIO ---------- */
	public static void opcionesInventario(int subMenu) {
		switch (subMenu) {
		case 1:
			registrarVehiculoInventario();
			break;
		case 2:
			actualizarInventario();
			break;
		case 3:
			eliminarVehiculoInventario();
			break;
		case 4:
			consultarInventario();
			break;
		default:
			break;
		}
	}
	
	public static void registrarVehiculoInventario() {
		String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo:");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo:");
		Vehiculo vehiculo = c.buscarVehiculo(marca, modelo);

		if(vehiculo != null) {
			int disponibilidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible: "));
			Inventario vInventaio = new Inventario(disponibilidad, vehiculo);
			JOptionPane.showMessageDialog(null, c.registrarVehiculosInventario(vInventaio));
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no existe");
		}
	}
	
	public static boolean actualizarInventario(Vehiculo vehiculo) {
		Inventario inventario = c.buscarVehiculoInventario(vehiculo);
		if(inventario != null) {
			JOptionPane.showMessageDialog(null, c.actualizarInventario(inventario.disminuirInventario(), inventario));
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no esta agregado en el inventario");
			return false;
		}
	}
	
	public static void actualizarInventario() {
		String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo:");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo:");
		Vehiculo vehiculo = c.buscarVehiculo(marca, modelo);
		if(vehiculo != null) {
			int disponibilidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible: "));
			
			Inventario inventario = c.buscarVehiculoInventario(vehiculo);
			if(inventario != null) {
				JOptionPane.showMessageDialog(null, c.actualizarInventario(disponibilidad, inventario));
			} else {
				JOptionPane.showMessageDialog(null, "El vehiculo no esta agregado en el inventario");
			}
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no existe");
		}
		
	}
	
	public static void eliminarVehiculoInventario() {
		String marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo:");
		String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehiculo:");
		Vehiculo vehiculo = c.buscarVehiculo(marca, modelo);
		if(vehiculo != null) {
			Inventario inventario = c.buscarVehiculoInventario(vehiculo);
			if(inventario != null) {				
				JOptionPane.showMessageDialog(null, c.eliminarVehiculosInventario(inventario));
			} else {
				JOptionPane.showMessageDialog(null, "El vehiculo no esta agregado en el inventario");
			}
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no existe");
		}
	}
	
	public static void consultarInventario() {
		String mensaje = "";
		for (Inventario inventario : c.mostrarInventario()) {
			mensaje += inventario.toString();
		}
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	/* ---------- MANTENIMIENTO ---------- */
	public static void opcionesMantenimiento(int subMenu) {
		switch (subMenu) {
		case 1:
			registrarMantenimiento();
			break;
		case 2:
			consultarMantenimiento();
			break;
		default:
			break;
		}
	}
	
	public static void registrarMantenimiento() {
		// String tipoMantenimiento, double costo, Vehiculo vehiculo
		String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
		Vehiculo vehiculo = c.buscarVehiculo(placa);
		
		if(vehiculo != null) {			
			String tipoMantenimiento = JOptionPane.showInputDialog("Ingrese el tipo de mantenimiento del vehiculo: ");
			double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del mantenimiento: "));
			costo = vehiculo.calculoCostoMantenimiento(costo);
			
			Mantenimiento mantenimiento = new Mantenimiento(tipoMantenimiento, costo, vehiculo);
			JOptionPane.showMessageDialog(null, c.registrarMantenimiento(mantenimiento));
		} else {
			JOptionPane.showMessageDialog(null, "El vehiculo no existe");
		}
	}
	
public static void consultarMantenimiento() {
	String placa = JOptionPane.showInputDialog("Ingrese la placa del vehiculo:");
	Vehiculo vehiculo = c.buscarVehiculo(placa);
	
	if(vehiculo != null) {			
		JOptionPane.showMessageDialog(null, c.consultarMantenimientos(vehiculo));
	} else {
		JOptionPane.showMessageDialog(null, "El vehiculo no existe");
	}
	}
}
