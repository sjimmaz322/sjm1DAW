package canciones;

import java.util.Collections;
import java.util.Comparator;

public class PruebaReproduccion {

    public static void main(String[] args) {

        ListaReproduccion listaNueva = new ListaReproduccion();
        
        listaNueva.grabarCancion(new Cancion("Muerte a pellizcos", "Vico", "Ranchera", 1, 2022));
        listaNueva.grabarCancion(new Cancion("Ctrl+Alt+Supr", "Reno Renardo", "Rock", 1, 2013));
        listaNueva.grabarCancion(new Cancion("Forget and Forgive", "Swan Fyahbwoy", "Rap", 4, 2018));
        listaNueva.grabarCancion(new Cancion("Guapa", "El Chojin", "Rap", 3, 2015));
        
        listaNueva.imprimirConsola();
        
        listaNueva.ordenarComparatorAutor();
        
        listaNueva.imprimirConsola();
        
        
        
    }

}
