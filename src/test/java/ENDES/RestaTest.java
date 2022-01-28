package ENDES;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaTest {

    public RestaTest() {
    }

    @Test
    public void testGetResta() {
        System.out.println("getResta");
        double a = 3.0;
        double b = 2.0;
        Resta instance = new Resta();
        double expResult = 1.0;
        double result = instance.getResta(a, b);
        assertEquals(expResult, result, 0.0);
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

    @Test
    public void testDecrementa() {
        System.out.println("decrementa");
        double a = 5.0;
        Resta instance = new Resta();
        double expResult = 4.0;
        double result = instance.decrementa(a);
        assertEquals(expResult, result, 0.0);
        if(result!=expResult){
        fail("The test case is a prototype.");
        }
    }

}
