package clasesabstractas;

import java.util.ArrayList;

/*
 * @author samjimmaz
 */
public class PruebaAzar {

    public static void main(String[] args) {
      
        ArrayList<Azar> prob = new ArrayList();
        
        prob.add(new Moneda());
        prob.add(new Dado());
        
        int prob1 = prob.get(0).lanzar();
        int prob2 = prob.get(1).lanzar();
        
        System.out.println(prob1);
        System.out.println(prob2);
        
    }
    
}
