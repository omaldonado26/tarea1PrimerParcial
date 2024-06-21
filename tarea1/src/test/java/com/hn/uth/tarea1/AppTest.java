package com.hn.uth.tarea1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{
    public AppTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite(AppTest.class);
    }

    public void testCalcularAreaCirculo()
    {
        assertEquals(28.27, App.calcularAreaCirculo(3), 0.01);
        assertEquals(78.54, App.calcularAreaCirculo(5), 0.01);
        assertEquals(0.0, App.calcularAreaCirculo(0), 0.01);
    }

    public void testCalcularAreaCuadrado()
    {
        assertEquals(16.0, App.calcularAreaCuadrado(4), 0.01);
        assertEquals(25.0, App.calcularAreaCuadrado(5), 0.01);
        assertEquals(0.0, App.calcularAreaCuadrado(0), 0.01);
    }
    public void testCalcularAreaRectangulo()
    {
        assertEquals(20.0, App.calcularAreaRectangulo(4, 5), 0.01);
        assertEquals(50.0, App.calcularAreaRectangulo(5, 10), 0.01);
        assertEquals(0.0, App.calcularAreaRectangulo(0, 5), 0.01);
    }

    public void testCalcularAreaTriangulo()
    {
        assertEquals(10.0, App.calcularAreaTriangulo(4, 5), 0.01);
        assertEquals(25.0, App.calcularAreaTriangulo(5, 10), 0.01);
        assertEquals(0.0, App.calcularAreaTriangulo(0, 5), 0.01);
    }
}

