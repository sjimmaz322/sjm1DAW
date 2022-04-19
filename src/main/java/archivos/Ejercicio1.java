package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
Implementa un programa que genere un fichero de texto en la carpeta raíz del proyecto,
llamado “matriz.txt”, donde se escriba la siguiente tabla de valores numéricos.
Utiliza el tabulador para ir separando cada número y el salto de línea para añadir nuevas líneas.
Ten en cuenta que el programa debe ser escalable, de forma que se pueda generar cualquier matriz que siga el patrón.

 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String idFichero = "array.txt"; //Creamos el fichero.
        String tmp; //Creamos una variable auxiliar para ayudarnos en la escritura

        //Creamos la matriz necesaria
        int[][] matriz = {
            {100, 101, 102, 103},
            {200, 201, 202, 203},
            {300, 301, 302, 303},
            {400, 401, 402, 403}
        };

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    // Obtengo en un String el elemento int de la matriz
                    tmp = String.valueOf(matriz[i][j]);
                    // Si es el último de la fila no pone la coma
                    if (j == matriz[i].length - 1) {
                        // Usamos metodo write() para escribir en el buffer
                        flujo.write(tmp);
                    } else {
                        flujo.write(tmp + ",");
                    }
                }

                // Metodo newLine() añade salto de línea después de cada fila
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
