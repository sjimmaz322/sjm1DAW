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
        
        return lista.size();
    }
    
    //Eliminar un libro
    public boolean eliminarLibro(Libros libro){

        return lista.remove(libro);
    }
    
    public Libros buscarISBNVieja(String isbn){//Podemos buscar libros por isbn, nombre, editorial...
        Libros aux = null;
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (aux.getIbsn().equals(isbn)){
                return aux;
            }
        }
        return aux;
    }
    
    public Libros buscarISBN(String isbn){
        Libros aux = new Libros(isbn, "", "", 0, 0);
        int indice = lista.indexOf(aux);
        if(indice>=0){
            return lista.get(indice);
        }
        return null;
    }
    public ArrayList<Libros> buscarPrecio(double precio){
        ArrayList<Libros> aux = new ArrayList<>();
        
        for (Libros libros : this.lista) {
            if (libros.getPrecio() == precio){
                aux.add(libros);
            }
        }
        return aux;
            
        
    }
}
