package Modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductosTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSetId() {
        int id = 10;
        Productos instance = new Productos();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetCodigo() {
        Productos instance = new Productos();
        instance.setCodigo("ABC123");
        String result = instance.getCodigo();
        assertEquals("ABC123", result);
    }

    @Test
    public void testSetCodigo() {
        String codigo = "XYZ456";
        Productos instance = new Productos();
        instance.setCodigo(codigo);
        assertEquals(codigo, instance.getCodigo());
    }

    @Test
    public void testGetNombre() {
        Productos instance = new Productos();
        instance.setNombre("Producto1");
        String result = instance.getNombre();
        assertEquals("Producto1", result);
    }

    @Test
    public void testSetNombre() {
        String nombre = "Producto2";
        Productos instance = new Productos();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testGetProveedor() {
        Productos instance = new Productos();
        instance.setProveedor(5);
        int result = instance.getProveedor();
        assertEquals(5, result);
    }

    @Test
    public void testSetProveedor() {
        int proveedor = 3;
        Productos instance = new Productos();
        instance.setProveedor(proveedor);
        assertEquals(proveedor, instance.getProveedor());
    }

    @Test
    public void testGetProveedorPro() {
        Productos instance = new Productos();
        instance.setProveedorPro("Proveedor A");
        String result = instance.getProveedorPro();
        assertEquals("Proveedor A", result);
    }

    @Test
    public void testSetProveedorPro() {
        String proveedorPro = "Proveedor B";
        Productos instance = new Productos();
        instance.setProveedorPro(proveedorPro);
        assertEquals(proveedorPro, instance.getProveedorPro());
    }

    @Test
    public void testGetStock() {
        Productos instance = new Productos();
        instance.setStock(50);
        int result = instance.getStock();
        assertEquals(50, result);
    }

    @Test
    public void testSetStock() {
        int stock = 100;
        Productos instance = new Productos();
        instance.setStock(stock);
        assertEquals(stock, instance.getStock());
    }

    @Test
    public void testGetPrecio() {
        Productos instance = new Productos();
        instance.setPrecio(20.5);
        double result = instance.getPrecio();
        assertEquals(20.5, result, 0);
    }

    @Test
    public void testSetPrecio() {
        double precio = 30.75;
        Productos instance = new Productos();
        instance.setPrecio(precio);
        assertEquals(precio, instance.getPrecio(), 0);
    }
}
