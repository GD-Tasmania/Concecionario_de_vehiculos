package Service;
import java.util.ArrayList;
import java.util.Date;

import Model.Cliente;
import Model.Inventario;
import Model.Mantenimiento;
import Model.Motocicleta;
import Model.Vehiculo;
import Model.Venta;

public class Concecionario {
	private ArrayList<Cliente> clientes;
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Venta> ventas;
	private ArrayList<Inventario> inventarios;
	private ArrayList<Mantenimiento> mantenimientos;
	
	public Concecionario() {
		this.clientes = new ArrayList<>();
		this.ventas = new ArrayList<>();
		this.vehiculos = new ArrayList<>();
		this.inventarios = new ArrayList<>();
		this.mantenimientos = new ArrayList<>();
	}
	/* METODOS CLIENTES */
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		System.out.println("se agregó cliente");
	}
	
	public Cliente buscarCliente(String nombre, String telefono) {
		for (Cliente cliente : this.clientes) {
			if(cliente.getNombre().equalsIgnoreCase(nombre) && cliente.getTelefono().equalsIgnoreCase(telefono)){
				System.out.println(cliente.toString());
				return cliente;
			}
		}
		return null;
	}
	
	public void eliminarCliente(String nombre, String telefono) {
		Cliente cliente = buscarCliente(nombre, telefono);
		if(cliente != null) {
			this.clientes.remove(cliente);
			System.out.println(this.clientes);
		}
	}
	
	public void actualizarCliente(String nombre, String direccion, String telefono, String correo, Cliente cliente) {
		if(cliente != null) {
			cliente.setNombre(nombre);
			cliente.setDireccion(direccion);
			cliente.setTelefono(telefono);
			cliente.setCorreo(correo);
		}
		System.out.println(cliente.toString());
	}
	
	/* METODOS VEHICULOS */
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.vehiculos.add(vehiculo);
		System.out.println("se agregó el vehiculo");
		System.out.println(vehiculo.toString());
	}
	
	public Vehiculo buscarVehiculo(String placa) {
		for (Vehiculo vehiculo : this.vehiculos) {
			if(vehiculo.getPlaca().equalsIgnoreCase(placa)){
				System.out.println(vehiculo.toString());
				return vehiculo;
			}
		}
		return null;
	}
	
	public void actualizarVehiculo(Vehiculo vehiculo, Vehiculo newVehiculo) {
		if(vehiculo != null) {
			Motocicleta motoAntigua = (Motocicleta) vehiculo;
			Motocicleta motoNueva = (Motocicleta) newVehiculo;

			vehiculo.setMarca(newVehiculo.getMarca());
			vehiculo.setModelo(newVehiculo.getModelo());
			vehiculo.setAño(newVehiculo.getAño());
			vehiculo.setPlaca(newVehiculo.getPlaca());
			motoAntigua.setTipoManillar(motoNueva.getTipoManillar());
			motoAntigua.setNumeroRuedas(motoNueva.getNumeroRuedas());
			motoAntigua.setTipoFreno(motoNueva.getTipoFreno());
			motoAntigua.setCilindraje(motoNueva.getCilindraje());
		}
		System.out.println("Vehiculo Actualizado");
	}
	
	public void eliminarVehiculo(String placa) {
		Vehiculo vehiculo = buscarVehiculo(placa);
		System.out.println("Vehiculos finales: ");
		if(vehiculo != null) {
			this.vehiculos.remove(vehiculo);
			System.out.println(this.vehiculos);
		}
	}
	
	/* METODOS VENTAS */
	public void registrarVenta(Venta venta) {
		this.ventas.add(venta);
		System.out.println("Ventas: \n"+this.ventas);
	}
	
	public void consultarVentas(Cliente cliente, Vehiculo vehiculo, Date fecha, int opcion) {
		System.out.println("---------");
		switch (opcion) {
		case 1:
			for (Venta ventas : this.ventas) {
				if(ventas.getCliente().equals(cliente)) {
					System.out.println(ventas.toString());
				}
			}
			break;
		case 2:
			for (Venta ventas : this.ventas) {
				if(ventas.getVehiculo().equals(vehiculo)) {
					System.out.println(ventas.toString());
				}
			}
			break;
		case 3:
			for (Venta ventas : this.ventas) {
				if(ventas.getFecha().equals(fecha)) {
					System.out.println(ventas.toString());
				}
			}
		default:
			break;
		}
	}
	
	/* METODOS INVENTARIO */
	public void registrarVehiculosInventario(Inventario vehiculoInventario) {
		this.inventarios.add(vehiculoInventario);
	}
	
	public void eliminarVehiculosInventario(Inventario vehiculoInventario) {
		this.inventarios.remove(vehiculoInventario);
	}
	
	/* METODOS MANTENIMIENTO */
	public void registrarMantenimiento(Mantenimiento mantenimiento) {
		this.mantenimientos.add(mantenimiento);
	}
	
	public void consultarMantenimientos(Vehiculo vehiculo) {
		for (Mantenimiento mantenimiento : this.mantenimientos) {
			if(mantenimiento.getVehiculo().equals(vehiculo)) {
				System.out.println(mantenimiento.toString());
			}
		}
	}
	
}
