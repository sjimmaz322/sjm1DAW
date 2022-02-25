package paquetec;

import java.util.HashMap;
import java.util.Map;

public class PruebaRegistroMilitar {

    public static void main(String[] args) {

        Map<String, RegistroMilitar> claves = new HashMap();

        //Creamos los ejercitos
        RegistroMilitar listado1 = new RegistroMilitar();
        RegistroMilitar listado2 = new RegistroMilitar();
        
        //Añadimos efectivos al primer ejército
        listado1.alistarSoldado(new Soldados("14578954X", "Juan", "Perez", "Mora", 18));
        listado1.alistarSoldado(new Soldados("24781784D", "Guillermo", "Perez", "Mora", 19));
        listado1.alistarSoldado(new Soldados("47895112C", "Macarena", "Perez", "Mora", 20));
        
        //Añadimos efectivos al segundo ejército
        listado2.alistarSoldado(new Soldados("14578412F", "Javier", "García", "Hernández", 21));
        listado2.alistarSoldado(new Soldados("24712569H", "Paula", "García", "Hernández", 22));
        listado2.alistarSoldado(new Soldados("34784548O", "Luisa", "García", "Hernández", 23));

        //Imprimimos las listas
        System.out.println("Recuento de ejercitos\n");
        System.out.println("Ejercito 1\n");
        listado1.imprimirLista();
        System.out.println("\nEjercito 2\n");
        listado2.imprimirLista();
    }
}
