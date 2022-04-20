package archivos;

/*
Implementa un programa para leer los datos del fichero del ejercicio 1.
El programa, al finalizar de leer la matriz debe mostrar la suma de todos los valores.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        String idFichero = "array.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        int contador = 1;
        int total = 0;

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador de campos del fichero CSV
                tokens = linea.split(",");
                for (String string : tokens) {
                    System.out.print(string + "\t");
                    total += Integer.parseInt(string);
                }
                System.out.println();
                System.out.println("El total de la fila " + contador + " es de: " + total);
                total = 0;
                contador++;

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
