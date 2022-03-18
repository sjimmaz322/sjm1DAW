package clasesabstractas;

import java.util.Random;

/*
 * @author samjimmaz
 */
public class Dado extends Azar{
    
    private Random rd;

    @Override
    public int lanzar() {
       int resultado = rd.nextInt(6)+1;
        
        return resultado;
    }
    
    
}
