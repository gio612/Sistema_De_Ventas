package Modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProveedorTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        Proveedor instance = new Proveedor();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

    @Test
    public void testSetId() {
        int id = 2;
        Proveedor instance = new Proveedor();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetRuc() {
        Proveedor instance = new Proveedor();
        instance.setRuc("123456789");
        String result = instance.getRuc();
        assertEquals("123456789", result);
    }

    @Test
    public void testSetRuc() {
        String ruc = "987654321";
        Proveedor instance = new Proveedor();
        instance.setRuc(ruc);
        assertEquals(ruc, instance.getRuc());
    }

    @Test
    public void testGetNombre() {
        Proveedor instance = new Proveedor();
        instance.setNombre("Proveedor A");
        String result = instance.getNombre();
        assertEquals("Proveedor A", result);
    }

    @Test
    public void testSetNombre() {
        String nombre = "Proveedor B";
        Proveedor instance = new Proveedor();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testGetTelefono() {
        Proveedor instance = new Proveedor();
        instance.setTelefono("999999999");
        String result = instance.getTelefono();
        assertEquals("999999999", result);
    }

    @Test
    public void testSetTelefono() {
        String telefono = "888888888";
        Proveedor instance = new Proveedor();
        instance.setTelefono(telefono);
        assertEquals(telefono, instance.getTelefono());
    }

    @Test
    public void testGetDireccion() {
        Proveedor instance = new Proveedor();
        instance.setDireccion("Calle Ficticia 123");
        String result = instance.getDireccion();
        assertEquals("Calle Ficticia 123", result);
    }

    @Test
    public void testSetDireccion() {
        String direccion = "Avenida Principal 456";
        Proveedor instance = new Proveedor();
        instance.setDireccion(direccion);
        assertEquals(direccion, instance.getDireccion());
    }
}
