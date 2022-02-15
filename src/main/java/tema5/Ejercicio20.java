/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

import java.util.Arrays;

/*
Desarrollar una lista de Libros.
La funcionalidad de la lista será la habitual: conocer el número de libros que hay en la lista,
insertar un nuevo libro (en la posición que le corresponda),
eliminar el libro de una determinada posición y obtener el libro de una determinada posición.
También incluirá un método para buscar de forma secuencial un libro a partir de su título
(no se diferencian entre mayúsculas y minúsculas); el método devolverá la posición en la que se encuentra el libro
(–1 si no se encuentra). Se debe crear la clase Libro con un par de atributos, constructores, getters y setters.
De forma opcional se pueden implementar los método equals() y la interfaz <<Comparable>> en Libro y usar los métodos sort()
y binarySearch().

 */
public class Ejercicio20 {

    public static void main(String[] args) {
        
        

        ListaLibros catalogo = new ListaLibros();


        catalogo.insertarLibro(new Libros("12s4", "La muerte a pellizcos", "Planeta", 10, 0.8));
        catalogo.insertarLibro(new Libros("1z32", "La espera a mordiscos", "Planeta", 10, 0.18));
        catalogo.insertarLibro(new Libros("12hr", "La vida a soplios", "Planeta", 10, 0.9));
        catalogo.insertarLibro(new Libros("fg36", "La negociación a mazazos", "Planeta", 10, 0.8));
        
        System.out.println("Lista desordenada");
        catalogo.imprimirConsola();
        
        catalogo.ordenarPorISBN();
        
        System.out.println("Lista ordenada");
        catalogo.imprimirConsola();
        
        int posicion = catalogo.buscarISBN(new Libros ("1z32", "La muerte a pellizcos", "Planeta", 10, 0.18));
        System.out.println("Está en la posición: "+posicion);
        
        System.out.println("Ordenamos por nombre");
        catalogo.ordenarComparatorNombre();
        catalogo.imprimirConsola();
        
        
        /*
        Aplicar esto en la lista de canciones
        */
//
//        //catalogo2.insertarLibro(new Libros("1245", "La muerte a bocaos", "Planeta", 10, 0.8));
//        catalogo.imprimirConsola();
//
//        System.out.println("Tamaño del catálogo: " + catalogo.getNumLibros());
//
//        Libros libro = catalogo.buscarISBN("1234");
//        System.out.println("El libro buscado es: " + libro);
//
//        libro = catalogo.buscarISBNVieja("1232");
//        System.out.println("El libro buscado es: " + libro);
//        
//        catalogo.eliminarLibro(new Libros("1235", "", "", 0, 0));
//        
//        catalogo.imprimirConsola();
//        System.out.println("Libros de precio 0.8€");
//        catalogo.buscarPrecio(0.8).forEach(System.out::println);
//        
//        
//        
    }

}
