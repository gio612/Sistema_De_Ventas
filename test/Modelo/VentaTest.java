    package Modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VentaTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        Venta instance = new Venta();
        instance.setId(1);
        assertEquals(1, instance.getId());
    }

    @Test
    public void testSetId() {
        int id = 2;
        Venta instance = new Venta();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetCliente() {
        Venta instance = new Venta();
        instance.setCliente(1);
        assertEquals(1, instance.getCliente());
    }

    @Test
    public void testSetCliente() {
        int cliente = 2;
        Venta instance = new Venta();
        instance.setCliente(cliente);
        assertEquals(cliente, instance.getCliente());
    }

    @Test
    public void testGetNombre_cli() {
        Venta instance = new Venta();
        instance.setNombre_cli("Juan Pérez");
        assertEquals("Juan Pérez", instance.getNombre_cli());
    }

    @Test
    public void testSetNombre_cli() {
        String nombre_cli = "Ana Gómez";
        Venta instance = new Venta();
        instance.setNombre_cli(nombre_cli);
        assertEquals(nombre_cli, instance.getNombre_cli());
    }

    @Test
    public void testGetVendedor() {
        Venta instance = new Venta();
        instance.setVendedor("Carlos");
        assertEquals("Carlos", instance.getVendedor());
    }

    @Test
    public void testSetVendedor() {
        String vendedor = "Sofia";
        Venta instance = new Venta();
        instance.setVendedor(vendedor);
        assertEquals(vendedor, instance.getVendedor());
    }

    @Test
    public void testGetTotal() {
        Venta instance = new Venta();
        instance.setTotal(100.0);
        assertEquals(100.0, instance.getTotal(), 0);
    }

    @Test
    public void testSetTotal() {
        double total = 200.0;
        Venta instance = new Venta();
        instance.setTotal(total);
        assertEquals(total, instance.getTotal(), 0);
    }

    @Test
    public void testGetFecha() {
        Venta instance = new Venta();
        instance.setFecha("2024-12-06");
        assertEquals("2024-12-06", instance.getFecha());
    }

    @Test
    public void testSetFecha() {
        String fecha = "2024-12-07";
        Venta instance = new Venta();
        instance.setFecha(fecha);
        assertEquals(fecha, instance.getFecha());
    }
}
