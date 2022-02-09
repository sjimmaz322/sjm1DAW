package canciones;

public class PruebaReproduccion {

    public static void main(String[] args) {

        ListaReproduccion lista1 = new ListaReproduccion();
        
        lista1.grabarCancion(new Cancion("Muerte a pellizcos", "Vico", "Ranchera", 1, 2022));
        lista1.grabarCancion(new Cancion("Ctrl+Alt+Supr", "Reno Renardo", "Rock", 1, 2013));
        lista1.grabarCancion(new Cancion("Forget and Forgive", "Swan Fyahbwoy", "Rap", 4, 2018));
        lista1.grabarCancion(new Cancion("Guapa", "El Chojin", "Rap", 3, 2015));
        
        System.out.println(lista1.getNumCanciones());
        
    }

}
