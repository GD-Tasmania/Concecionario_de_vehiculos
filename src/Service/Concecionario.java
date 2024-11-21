package Service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import Model.*;

public class Concecionario {
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Cliente> clientes;
	private ArrayList<Venta> ventas;
	private ArrayList<Inventario> inventarios;
	private ArrayList<Mantenimiento> mantenimientos;
	
	public Concecionario() {
		this.vehiculos = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.ventas = new ArrayList<>();
		this.inventarios = new ArrayList<>();
		this.mantenimientos = new ArrayList<>();
	}
	
	/* METODOS VEHICULOS */	
	public Vehiculo buscarVehiculo(String placa) {
		for (Vehiculo vehiculo : this.vehiculos) {
			if(vehiculo.getPlaca().equalsIgnoreCase(placa)){
				return vehiculo;
			}
		}
		return null;
	}
	
	public String agregarVehiculo(Vehiculo vehiculo) {
		Vehiculo existe = buscarVehiculo(vehiculo.getPlaca());
		
		if(existe == null) {		
			this.vehiculos.add(vehiculo);
			return "¡Vehiculo agregado con exito!";
		} else {
			return "¡Existe un vehiculo con esta placa!";
		}
	}
	
	public String actualizarVehiculo(Vehiculo vehiculo, String marca, String modelo, int año, String vin, String color, String placa, int numeroPuertas,
			String tipoCombustible, String trasmision, String traccion) {
		Vehiculo existe = buscarVehiculo(vehiculo.getPlaca());
		
		if(existe != null) {
			Automovil automovil = (Automovil) vehiculo;
			vehiculo.setMarca(marca);
			vehiculo.setModelo(modelo);
			vehiculo.setAño(año);
			vehiculo.setVin(vin);
			vehiculo.setColor(color);
			vehiculo.setPlaca(placa);
			automovil.setNumeroPuertas(numeroPuertas);
			automovil.setTipoCombustible(tipoCombustible);
			automovil.setTrasmision(trasmision);
			automovil.setTrasmision(trasmision);
			
			return "¡Vehiculo actualizado con exito!";
		} else {
			return "¡No existe un vehiculo con esta placa!";
		}
	}
	
	public String actualizarVehiculo(Vehiculo vehiculo, String marca, String modelo, int año, String vin, String color, String placa, String tipoManillar,
			int numeroRuedas, String tipoFreno, double cilindraje) {
		Vehiculo existe = buscarVehiculo(vehiculo.getPlaca());
		
		if(existe != null) {
			Motocicleta motocicleta = (Motocicleta) vehiculo;
			vehiculo.setMarca(marca);
			vehiculo.setModelo(modelo);
			vehiculo.setAño(año);
			vehiculo.setVin(vin);
			vehiculo.setColor(color);
			vehiculo.setPlaca(placa);
			motocicleta.setTipoManillar(tipoManillar);
			motocicleta.setNumeroRuedas(numeroRuedas);
			motocicleta.setTipoFreno(tipoFreno);
			motocicleta.setCilindraje(cilindraje);
			
			return "¡Vehiculo actualizado con exito!";
		} else {
			return "¡No existe un vehiculo con esta placa!";
		}
	}
	
	public String actualizarVehiculo(Vehiculo vehiculo, String marca, String modelo, int año, String vin, String color, String placa, double capacidad,
			String tipoCamion, double longitud, int numeroEjes) {
		Vehiculo existe = buscarVehiculo(vehiculo.getPlaca());
		
		if(existe != null) {
			Camion camion = (Camion) vehiculo;
			vehiculo.setMarca(marca);
			vehiculo.setModelo(modelo);
			vehiculo.setAño(año);
			vehiculo.setVin(vin);
			vehiculo.setColor(color);
			vehiculo.setPlaca(placa);
			camion.setCapacidadCarga(capacidad);
			camion.setTipoCamion(tipoCamion);
			camion.setLongitud(longitud);
			camion.setNumeroEjes(numeroEjes);
			
			return "¡Vehiculo actualizado con exito!";
		} else {
			return "¡No existe un vehiculo con esta placa!";
		}
	}
	
	public String eliminarVehiculo(String placa) {
		Vehiculo vehiculo = buscarVehiculo(placa);
		
		if(vehiculo != null) {
			this.vehiculos.remove(vehiculo);
			return "Vehiculo eliminado";
		} else {
			return "El vehiculo no existe";
		}
	}
	
	/* METODOS CLIENTES */
	public Cliente buscarCliente(String nombre, String telefono) {
		for (Cliente cliente : this.clientes) {
			if(cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getTelefono().equalsIgnoreCase(telefono)){
				return cliente;
			}
		}
		return null;
	}
	
	public String agregarCliente(Cliente cliente) {
		Cliente existe = buscarCliente(cliente.getNombre(), cliente.getTelefono());
		
		if(existe == null) {		
			this.clientes.add(cliente);
			return "¡Vehiculo agregado con exito!";
		} else {
			return "¡Existe un vehiculo con esta placa!";
		}
	}
	
	public String actualizarCliente(Cliente cliente, String nombre, String direccion, String telefono, String correo) {
		cliente.setNombre(nombre);
		cliente.setDireccion(direccion);
		cliente.setTelefono(telefono);
		cliente.setCorreo(correo);
			
		return "Cliente actualizado";
	}
	
	public String eliminarCliente(String nombre, String telefono) {
		Cliente cliente = buscarCliente(nombre, telefono);
		if(cliente != null) {
			this.clientes.remove(cliente);
			return "Cliente eliminado";
		} else {
			return "El cliente no existe";
		}
	}
	
	public ArrayList<Cliente> listaClientes(){
		return this.clientes;
	}
	
	/* METODOS VENTAS */
	public String registrarVenta(Venta venta) {
		this.ventas.add(venta);
		return "Venta realizada";
	}
	
	public String consultarVentas(Cliente cliente) {
		String mensaje = "";
		for (Venta ventas : this.ventas) {
			if(ventas.getCliente().equals(cliente)) {
				mensaje += ventas.toString();
			}
		}
		return mensaje;
	}
	
	public String consultarVentas(Vehiculo vehiculo) {
		String mensaje = "";
		for (Venta ventas : this.ventas) {
			if(ventas.getVehiculo().equals(vehiculo)) {
				mensaje += ventas.toString();
			}
		}
		return mensaje;
	}
	
	public String consultarVentas(LocalDate fecha) {
		String mensaje = "";
		for (Venta ventas : this.ventas) {
			if(ventas.getFecha().equals(fecha)) {
				mensaje += ventas.toString();
			}
		}
		return mensaje;
	}
	
	/* METODOS INVENTARIO */
	public String registrarVehiculosInventario(Inventario vehiculoInventario) {
		this.inventarios.add(vehiculoInventario);
		return "Vehiculo registrado en el inventario";
	}
	
	public String eliminarVehiculosInventario(Inventario vehiculoInventario) {
		this.inventarios.remove(vehiculoInventario);
		return "Vehiculo eliminado del inventario";
	}
	
	public String actualizarInventario(int disponibilidad, Inventario vehiculoInventario) {
		vehiculoInventario.setDisponibilidad(disponibilidad);
		return "Inventario modificado";
	}
	
	public Vehiculo buscarVehiculo(String marca, String modelo) {
		for (Vehiculo vehiculo : this.vehiculos) {
			if(vehiculo.getMarca().equalsIgnoreCase(marca) && vehiculo.getModelo().equalsIgnoreCase(modelo)){
				return vehiculo;
			}
		}
		return null;
	}
	
	public Inventario buscarVehiculoInventario(Vehiculo vehiculo) {
		for (Inventario inventario : this.inventarios) {
			if(inventario.getVehiculo().equals(vehiculo)){
				return inventario;
			}
		}
		return null;
	}
	
	public ArrayList<Inventario> mostrarInventario(){
		return this.inventarios;
	}
	
	/* METODOS MANTENIMIENTO */
	public String registrarMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimientos.add(mantenimiento);
		return "Mantenimiento registrado";
	}
	
	public String consultarMantenimientos(Vehiculo vehiculo) {
		String consulta = "";
		for (Mantenimiento mantenimiento : this.mantenimientos) {
			if(mantenimiento.getVehiculo().equals(vehiculo)) {
				consulta += mantenimiento.toString();
			}
		}
		return consulta;
	}
	
}
