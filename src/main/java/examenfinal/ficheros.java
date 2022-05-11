/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author Mapacherben
 */
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

public class ficheros {

    public static void main(String[] args) {
        
        //Comparator<Registro> ordenDia = (d1,d2) -> Integer.compare(d1.getDia(),d2.getDia());
        //para crear un Comparator
        
        //Collections.sort(lista, comparator1.thenComparing(comparator2));
        
        //Comparator Strings
        //    public int compare(Persona p1, Persona p2) {
        //    return  p1.getNombre().compareTo(p2.getNombre());
    
        
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idfichero = "array.txt";

        // Array a escribir
        int numeros[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        
        //Para añadir información a un fichero ya creado
        //idfichero es la ruta o el nombre si está en la carpeta raiz
        //FileWriter fichero = new FileWriter(idfichero, true);

// Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idfichero))) {

            for (int[] is : numeros) {
                for (int i : is) {
                    // Usamos metodo write() para escribir en el buffer
                    flujo.write(i + ",");
                }
                // Metodo newLine() añade línea en blanco
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
   

    }
private void leerFichero(String ruta){
    // Fichero a leer
        String idFichero = ruta;

        // Variables para guardar los datos que se van leyendo
        String[] tokens;//para guardar cada uno de los campos de un csv por ejemplo
        String linea;//Para guardar la información

        System.out.println("Leyendo el fichero: " + ruta);
        
     // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){
            
            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine(); //Se lee la línea
                System.out.println(linea); // Se imprime en pantalla
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 

        // El mismo ejemplo pero separando cada elemento
        // leído usando el método split() de la clase String */

        
        try (Scanner datosFichero = new Scanner(new FileReader(idFichero))){

            System.out.println("Separando cada elemento del fichero: ");

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");

                for (String string : tokens) {//Por cada token que haga una cosa
                    System.out.print(string + "\t");
                }

                System.out.println();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
} 
}




