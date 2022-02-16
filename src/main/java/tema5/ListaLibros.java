package tema5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public int getNumLibros() {

        return lista.size();
    }

    //Eliminar un libro
    public boolean eliminarLibro(Libros libro) {

        return lista.remove(libro);
    }

    public Libros buscarISBNVieja(String isbn) {//Podemos buscar libros por isbn, nombre, editorial...
        Libros aux = null;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getIsbn().equals(isbn)) {
                return aux;
            }
        }
        return aux;
    }

    public Libros buscarISBN(String isbn) {
        Libros aux = new Libros(isbn, "", "", 0, 0);
        int indice = lista.indexOf(aux);
        if (indice >= 0) {
            return lista.get(indice);
        }
        return null;
    }

    public ArrayList<Libros> buscarPrecio(double precio) {
        ArrayList<Libros> aux = new ArrayList<>();

        for (Libros libros : this.lista) {
            if (libros.getPrecio() == precio) {
                aux.add(libros);
            }
        }
        return aux;

    }

    //Collections.sort(lista) lista debe contener cobjetos que implementan comparable
    public void ordenarPorISBN() {
        Collections.sort(this.lista);
    }

    // Búsqueda binaria de un objeto según la ordenación natural
    // binarySearch no funciona con una lista no ordenada
    public int buscarISBN(Libros l) {

        return Collections.binarySearch(lista, l);
    }

    public void ordenarComparatorNombre() {
        Collections.sort(lista, (Libros l1, Libros l2) -> l1.getNombre().compareTo(l2.getNombre()));
    }

    public void ordenarComparatorNumPags() {
        Collections.sort(lista, (Libros l1, Libros l2) -> l1.getNumPags() - l2.getNumPags());
        Collections.sort(lista, (Libros l1, Libros l2)-> Integer.compare(l1.getNumPags(), l1.getNumPags()));
    }
    
    public void ordenarNombrePags(){//Criterios concatenados
        Comparator<Libros> criterioNombre = (l1,l2) -> l1.getNombre().compareTo(l2.getNombre());
        Comparator<Libros> criterioPaginas = (l1, l2) -> l1.getNumPags() - l2.getNumPags();
        Comparator<Libros> criterioNombreYPaginas = criterioNombre.thenComparing(criterioPaginas);
        Collections.sort(lista, criterioNombreYPaginas);
    }
    
    public int buscarBynaryNombre(Libros l){
        //La lista debe estar ordenada según el criterio que se pasa a este método (nombre en este caso)
        return Collections.binarySearch(lista, l, (l1,l2) -> l1.getNombre().compareTo(l2.getNombre()));
    }

}
