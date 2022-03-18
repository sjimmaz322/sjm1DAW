package clasesabstractas;

import java.util.Random;

/*
 * @author samjimmaz
 */
public class Moneda extends Azar{

    private Random rd;

    @Override
    public int lanzar() {
        int resultado = rd.nextInt(2);

        return resultado;
    }

}
