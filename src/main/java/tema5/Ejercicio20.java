/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

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
        
        catalogo.insertarLibro(new Libros("1234", "La muerte a pellizcos", "Planeta", 10, 0.8));
        
        catalogo.imprimirConsola();
    }
    
}
