package examennoexamen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import tarea7c.Registro;

public class LecturaCSV {

    public static SortedMap<String, String> leerCSV(String ruta, String nombre) {

        SortedMap<String, String> modulos = new TreeMap<>();

        String linea;
        String[] tokens;

        System.out.println("Leyendo el fichero: " + nombre);//Sout puramente estético

        try (Scanner datosFichero = new Scanner(new File(ruta), "ISO-8859-1")) {//Try-with-resourcer para leer el documento con Scanner
            datosFichero.nextLine();//Nos saltamos la primera linea que no nos interesa
            while (datosFichero.hasNextLine()) {//Mientras sigua habiendo lineas se ejecutará, necesario para recorrer todo el documento

                linea = datosFichero.nextLine();//Guardamos el espacio de memoria para la información

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");

                modulos.put(tokens[0], tokens[1]);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return modulos;
    }

}
