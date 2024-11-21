package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.*;
import Service.Concecionario;

class ConcecionarioTest {

	@Test
    public void datosCompletos() {
        //LOG.info("Iniciado test datosCompletos");
        Cliente cliente = new Cliente("Paco", "Acacias", "3298948", "paco@gmail.com");

        assertAll("Empleado",
        () -> assertEquals("Paco", cliente.getNombre()),
        () -> assertEquals("Acacias", cliente.getDireccion()),
        () -> assertEquals("3298948", cliente.getTelefono()),
        () -> assertEquals("paco@gmail.com", cliente.getCorreo())
        );

        //LOG.info("Finalizando test datosCompletos");
    }
	
    @Test
    public void datosVacios() {
        //LOG.info("Inicio test datosVcios");
    	Cliente cliente = new Cliente("Paco", "Acacias", "3298948", "paco@gmail.com");
        assertThrows(Throwable.class, () -> new Cliente("", "", "", ""));
        //LOG.info("Fin test datosVcios");
    }
    
    public void agregarCliente() {
    	Concecionario c = new Concecionario();
    	Cliente cliente = new Cliente("Paco", "Acacias", "3298948", "paco@gmail.com");
    	
    	c.agregarCliente(cliente);
    	assertTrue(c.listaClientes().contains(cliente));
    }
    
    @Test
    public void eliminarCliente() {
    	Concecionario c = new Concecionario();
    	Cliente cliente1 = new Cliente("Paco", "Acacias", "3298948", "paco@gmail.com");
    	Cliente cliente2 = new Cliente("Pedro", "Naranjos", "3595985", "pedro@gmail.com");
    	c.agregarCliente(cliente1);
    	c.agregarCliente(cliente2);
    	
    	c.eliminarCliente("Pedro", "3595985");
    	
    	assertFalse(c.listaClientes().contains(cliente1));
    	assertEquals(1, c.listaClientes().size());
    }
}
