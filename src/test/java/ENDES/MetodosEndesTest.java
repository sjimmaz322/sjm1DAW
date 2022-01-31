/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ENDES;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samjimmaz
 */
public class MetodosEndesTest {
    
    public MetodosEndesTest() {
    }

    @Test
    public void testTallasXS() {
        System.out.println("Tallas");
        String t = "XS";
        MetodosEndes instance = new MetodosEndes();
        String expResult = "Extra pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }
        @Test
    public void testTallasS() {
        System.out.println("Tallas");
        String t = "S";
        MetodosEndes instance = new MetodosEndes();
        String expResult = "Pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }
        @Test
    public void testTallasM() {
        System.out.println("Tallas");
        String t = "M";
        MetodosEndes instance = new MetodosEndes();
        String expResult = "Mediana";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }
        @Test
    public void testTallasL() {
        System.out.println("Tallas");
        String t = "L";
        MetodosEndes instance = new MetodosEndes();
        String expResult = "Grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }
        @Test
    public void testTallasXL() {
        System.out.println("Tallas");
        String t = "XL";
        MetodosEndes instance = new MetodosEndes();
        String expResult = "Muy grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }
        @Test
    public void testTallasXXL() {
        System.out.println("Tallas");
        String t = "XXL";
        MetodosEndes instance = new MetodosEndes();
        String expResult = "Extra grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
    }

    @Test
    public void testIvaDe10() {
        System.out.println("iva");
        double precio = 10.0;
        MetodosEndes instance = new MetodosEndes();
        double expResult = 12.1;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        if (expResult != result){
        fail("The test case is a prototype.");
        }
    }
    @Test
    public void testIvaDe35() {
        System.out.println("iva");
        double precio = 35.0;
        MetodosEndes instance = new MetodosEndes();
        double expResult = 42.35;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        if (expResult != result){
        fail("The test case is a prototype.");
        }
    }
    @Test
    public void testIvaDe49Con53() {
        System.out.println("iva");
        double precio = 49.53;
        MetodosEndes instance = new MetodosEndes();
        double expResult = 59.9313;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        if (expResult != result){
        fail("The test case is a prototype.");
        }
    }
    
}
