package com.hn.uth.tarea1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.27, App.calcularAreaCirculo(3), 0.01);
        assertEquals(78.54, App.calcularAreaCirculo(5), 0.01);
        assertEquals(0.0, App.calcularAreaCirculo(0), 0.01);
        assertNotEquals(50.0, App.calcularAreaCirculo(3), 0.01);
        assertTrue(App.calcularAreaCirculo(2) > 0);
        assertFalse(App.calcularAreaCirculo(0) > 0);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(16.0, App.calcularAreaCuadrado(4), 0.01);
        assertEquals(25.0, App.calcularAreaCuadrado(5), 0.01);
        assertEquals(0.0, App.calcularAreaCuadrado(0), 0.01);
        assertNotEquals(10.0, App.calcularAreaCuadrado(4), 0.01);
        assertTrue(App.calcularAreaCuadrado(3) > 0);
        assertFalse(App.calcularAreaCuadrado(0) > 0);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(20.0, App.calcularAreaRectangulo(4, 5), 0.01);
        assertEquals(50.0, App.calcularAreaRectangulo(5, 10), 0.01);
        assertEquals(0.0, App.calcularAreaRectangulo(0, 5), 0.01);
        assertNotEquals(30.0, App.calcularAreaRectangulo(4, 5), 0.01);
        assertTrue(App.calcularAreaRectangulo(3, 4) > 0);
        assertFalse(App.calcularAreaRectangulo(0, 5) > 0);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(10.0, App.calcularAreaTriangulo(4, 5), 0.01);
        assertEquals(25.0, App.calcularAreaTriangulo(5, 10), 0.01);
        assertEquals(0.0, App.calcularAreaTriangulo(0, 5), 0.01);
        assertNotEquals(15.0, App.calcularAreaTriangulo(4, 5), 0.01);
        assertTrue(App.calcularAreaTriangulo(3, 4) > 0);
        assertFalse(App.calcularAreaTriangulo(0, 5) > 0);
    }
}

