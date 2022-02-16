package canciones;

import java.util.ArrayList;
import java.util.Collections;

/*
Desarrolla una clase ListaReproduccion con los siguientes atributos y métodos. Es necesario implementar la clase Cancion:
Atributos:
canciones: una lista de objetos de la clase Cancion.
Métodos (recuerda implementar equals y hashcode en Cancion)
constructor predeterminado (creará e inicializará la lista).
numeroCanciones(): devuelve el número de canciones de la lista.
estaVacia(): devuelve si la lista de reproducción está vacía.
escucharCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada por la nueva Cancion proporcionada.
grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de reproducción. Usa el método remove(Cancion)
imprimirLista (ListaReproduccion tmp). Método de clase que imprime los nombres de las canciones contenidas en tmp.
buscarCancion(Cancion c), busca la canción c en la lista de reproducción y devuelve la posición en la que se encuentra.
Usa el método indexOf.
Incluye un par de método de ordenación (por ejemplo, por título y por cantante) usando el método
Collections.sort(lista, criterioComparator)
Añade también métodos para buscar, usando Collections.binarySearch(lista, objeto, criterioComparator)

 */
public class ListaReproduccion {

    private ArrayList<Cancion> listaReproduccion;

    public ListaReproduccion() {
        this.listaReproduccion = new ArrayList<>();
    }

    public ListaReproduccion(ArrayList<Cancion> listaReproduccion) {
        this.listaReproduccion = listaReproduccion;
    }

    public void imprimirConsola() {//Método que imprime por consola todos los elementos de la lista

        System.out.println("Imprimiendo lista...");
        listaReproduccion.forEach(System.out::println);
    }

    public void insertarCancion(Cancion cancion) {//Método para añadir una canción

        if (cancion != null) {
            listaReproduccion.add(cancion);
        }
    }

    public boolean eliminarCancion(Cancion cancion) {//Método para eliminar una canción

        return listaReproduccion.remove(cancion);
    }

    public int getNumCanciones() {//Método para ver cuantas canciones tiene una lista de reproducción

        return listaReproduccion.size();

    }

    public boolean isVacia() {
        if (listaReproduccion.size() == 0) {
            return true;
        }
        return false;
    }

    public Cancion buscarCancion(Cancion cancion) {
        for (int i = 0; i < listaReproduccion.size(); i++) {
            if (cancion.equals(listaReproduccion.get(i))) {
                return listaReproduccion.get(i);
            }

        }
        return null;
    }

    public Cancion buscarNombre(String nombre) {
        Cancion aux = new Cancion(nombre, "", "", 0, 0);
        int indice = listaReproduccion.indexOf(aux);
        if (indice >= 0) {
            return listaReproduccion.get(indice);
        }
        return null;
    }

    public Cancion buscarAutor(String autor) {
        Cancion aux = new Cancion("", autor, "", 0, 0);
        int indice = listaReproduccion.indexOf(aux);
        if (indice >= 0) {
            return listaReproduccion.get(indice);
        }
        return null;
    }

    public Cancion buscarGenero(String genero) {
        Cancion aux = new Cancion("", "", genero, 0, 0);
        int indice = listaReproduccion.indexOf(aux);
        if (indice >= 0) {
            return listaReproduccion.get(indice);
        }
        return null;
    }

    public Cancion buscarNumPista(int numPista) {
        Cancion aux = new Cancion("", "", "", numPista, 0);
        int indice = listaReproduccion.indexOf(aux);
        if (indice >= 0) {
            return listaReproduccion.get(indice);
        }
        return null;
    }

    public Cancion buscarAnio(int anioLanzamiento) {
        Cancion aux = new Cancion("", "", "", 0, anioLanzamiento);
        int indice = listaReproduccion.indexOf(aux);
        if (indice >= 0) {
            return listaReproduccion.get(indice);
        }
        return null;
    }

    public Cancion reproducirCancion(int idex) {
        return listaReproduccion.get(idex);
    }

    public void grabarCancion(Cancion cancion) {

        if (cancion != null) {
            listaReproduccion.add(cancion);
        }
    }

    public boolean borrarCancion(Cancion cancion) {

        return listaReproduccion.remove(cancion);
    }

    public boolean borrarEstaCancion(int index) {
        Cancion song = listaReproduccion.get(index);
        return listaReproduccion.remove(song);
    }

    @Override
    public String toString() {
        return "ListaReproduccion{" + "listaReproduccion=" + listaReproduccion + '}';
    }
    
    public void ordenarPorTitulo() {
        Collections.sort(this.listaReproduccion);
    }

    public void ordenarComparatorTitulo() {
        Collections.sort(this.listaReproduccion, (Cancion c1, Cancion c2) -> c1.getTitulo().compareTo(c2.getTitulo()));
    }
    
    public void ordenarComparatorAutor(){
        Collections.sort(this.listaReproduccion, (Cancion c1,Cancion c2) -> c1.getAutor().compareTo(c2.getAutor()));
    }

    public int buscarTitulo(Cancion c) {
            
        return Collections.binarySearch(listaReproduccion, c);
    }
        public int buscarBynaryNombre(Cancion c){
        //La lista debe estar ordenada según el criterio que se pasa a este método (nombre en este caso)
        return Collections.binarySearch(listaReproduccion, c, (c1,c2) -> c1.getTitulo().compareTo(c2.getTitulo()));
    }
    
}
