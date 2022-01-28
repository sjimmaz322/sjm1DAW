package ENDES;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {
    
    public SumaTest() {
    }

    @org.junit.Test
    public void testGetSuma() {
        System.out.println("getSuma");
        double a = 1.0;
        double b = 2.0;
        Suma instance = new Suma();
        double expResult = 3.0;
        double result = instance.getSuma(a, b);
        assertEquals(expResult, result, 0.0);
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    @org.junit.Test
    public void testIncrementa() {
        System.out.println("incrementa");
        double a = 5.0;
        Suma instance = new Suma();
        double expResult = 6.0;
        double result = instance.incrementa(a);
        assertEquals(expResult, result, 0.0);
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
