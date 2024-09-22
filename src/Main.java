import Service.Concecionario;
import Model.*;

public class Main {
	public static Concecionario c = new Concecionario();
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Tito", "SENA", "3218056116", "TITO23@GMAIL.COM");
		c.agregarCliente(cliente);
		c.buscarCliente("Tito", "3218056116");
		Cliente lucho = c.buscarCliente("Tito", "3218056116");
		c.actualizarCliente("lucho", "UNIVERSIDAD", "3207787962", "LUCHO2@gmail.com", lucho);
		c.eliminarCliente("lucho", "3207787962");
	}
}
