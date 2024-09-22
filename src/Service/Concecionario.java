package Service;
import java.util.ArrayList;

import Model.Cliente;
import Model.Inventario;
import Model.Mantenimiento;
import Model.Vehiculo;
import Model.Venta;

public class Concecionario {
	private ArrayList<Cliente> clientes;
	private ArrayList<Venta> ventas;
	private ArrayList<Vehiculo> vehiculo;
	private ArrayList<Inventario> inventarios;
	private ArrayList<Mantenimiento> mantenimientos;
	
	public Concecionario() {
		this.clientes = new ArrayList<>();
		this.ventas = new ArrayList<>();
		this.vehiculo = new ArrayList<>();
		this.inventarios = new ArrayList<>();
		this.mantenimientos = new ArrayList<>();
	}
	//METODOS CLIENTES
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
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
}
