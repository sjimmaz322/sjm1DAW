package tema5;

import java.util.ArrayList;

/*

 */
public class ListaLibros {

    //Atributo encapsulado de tipo lista
    private ArrayList<Libros> lista;

    //Constructor por defecto, solo instancia la estructura lista
    //No incluye ningún libro, solo reserva espacio en memoria
    public ListaLibros() {
        this.lista = new ArrayList<>();
    }

    //Guarda el libro en el primer espacio de memoria disponible dentro de la lista si no es null
    public void insertarLibro(Libros libro) {
        if (libro != null) {
            lista.add(libro);
        }
    }

    public void imprimirConsola() {
        
        System.out.println("Imprimiendo lista...");
        lista.forEach(System.out::println);
        
    }
    
    public int getNumLibros(){
        
    }
    
}
