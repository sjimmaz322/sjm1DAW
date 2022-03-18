package clasesabstractas;

import java.util.ArrayList;

public class PruebaTrabajador {

    /*
    Transforma la clase Trabajador de los apuntes de clase en una clase abstracta que incluya el método abstracto cotizar().
    Crea la jerarquía de herencia que cuelgue de la clase Trabajador, implementado el método abstracto en las respectivas clases
    (además de la clase Camarero, inventa tú otra). Incluye una clase de prueba con el método main(), donde se cree una lista de cuatro
    Trabajadores. Añade en la lista dos objetos Camarero y dos objetos del tipo inventado por ti.  Finalmente recorre la lista y
    llama al método cotizar() de cada uno de los trabajadores, comprobando el comportamiento polimórfico de dicho método.
     */
    public static void main(String[] args) {

        // Trabajador t1 = new Trabajador(); - No podemos instanciar un trabajador por ser una clase abstracta.
        ArrayList<Trabajador> plantilla = new ArrayList();

        plantilla.add(new Camarero("Abelardo", "Estopoulos", "X1"));
        plantilla.add(new Camarero("Benancio", "Franciscano", "X2"));
        plantilla.add(new Cocinero("Clementino", "Germano", "X3"));
        plantilla.add(new Cocinero("Demetrio", "Hierros", "X4"));

        
        if(plantilla.get(0) instanceof Camarero){
            ((Camarero)plantilla.get(0)).servirMesa();
            
        }
    }

}
