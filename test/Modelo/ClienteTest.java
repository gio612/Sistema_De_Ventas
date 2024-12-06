package Modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        Cliente instance = new Cliente();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

    @Test
    public void testSetId() {
        int id = 2;
        Cliente instance = new Cliente();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetDni() {
        Cliente instance = new Cliente();
        instance.setDni("12345678");
        String result = instance.getDni();
        assertEquals("12345678", result);
    }

    @Test
    public void testSetDni() {
        String dni = "98765432";
        Cliente instance = new Cliente();
        instance.setDni(dni);
        assertEquals(dni, instance.getDni());
    }

    @Test
    public void testGetNombre() {
        Cliente instance = new Cliente();
        instance.setNombre("Juan Pérez");
        String result = instance.getNombre();
        assertEquals("Juan Pérez", result);
    }

    @Test
    public void testSetNombre() {
        String nombre = "María López";
        Cliente instance = new Cliente();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testGetTelefono() {
        Cliente instance = new Cliente();
        instance.setTelefono("555123456");
        String result = instance.getTelefono();
        assertEquals("555123456", result);
    }

    @Test
    public void testSetTelefono() {
        String telefono = "555987654";
        Cliente instance = new Cliente();
        instance.setTelefono(telefono);
        assertEquals(telefono, instance.getTelefono());
    }

    @Test
    public void testGetDireccion() {
        Cliente instance = new Cliente();
        instance.setDireccion("Calle Ficticia 123");
        String result = instance.getDireccion();
        assertEquals("Calle Ficticia 123", result);
    }

    @Test
    public void testSetDireccion() {
        String direccion = "Avenida Real 456";
        Cliente instance = new Cliente();
        instance.setDireccion(direccion);
        assertEquals(direccion, instance.getDireccion());
    }
}
