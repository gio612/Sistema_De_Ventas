package Modelo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class loginTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetId() {
        login instance = new login();
        instance.setId(1);
        int result = instance.getId();
        assertEquals(1, result);
    }

    @Test
    public void testSetId() {
        int id = 2;
        login instance = new login();
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testGetNombre() {
        login instance = new login();
        instance.setNombre("Carlos Pérez");
        String result = instance.getNombre();
        assertEquals("Carlos Pérez", result);
    }

    @Test
    public void testSetNombre() {
        String nombre = "Ana García";
        login instance = new login();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    @Test
    public void testGetCorreo() {
        login instance = new login();
        instance.setCorreo("carlos.perez@example.com");
        String result = instance.getCorreo();
        assertEquals("carlos.perez@example.com", result);
    }

    @Test
    public void testSetCorreo() {
        String correo = "ana.garcia@example.com";
        login instance = new login();
        instance.setCorreo(correo);
        assertEquals(correo, instance.getCorreo());
    }

    @Test
    public void testGetPass() {
        login instance = new login();
        instance.setPass("12345");
        String result = instance.getPass();
        assertEquals("12345", result);
    }

    @Test
    public void testSetPass() {
        String pass = "67890";
        login instance = new login();
        instance.setPass(pass);
        assertEquals(pass, instance.getPass());
    }

    @Test
    public void testGetRol() {
        login instance = new login();
        instance.setRol("Admin");
        String result = instance.getRol();
        assertEquals("Admin", result);
    }

    @Test
    public void testSetRol() {
        String rol = "User";
        login instance = new login();
        instance.setRol(rol);
        assertEquals(rol, instance.getRol());
    }
}
