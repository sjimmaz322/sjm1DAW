package tarea7c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarea7C {

    public static void main(String[] args) {

        ArrayList<Registro> listaRegistros = new ArrayList<>();

        String idFichero = "./hor_curso_1920_final.csv";
        String linea;
        String[] tokens;

        System.out.println("Leyendo el fichero: " + idFichero);//Sout puramente estético

        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {//Try-with-resourcer para leer el documento con Scanner
            datosFichero.nextLine();//Nos saltamos la primera linea que no nos interesa
            while (datosFichero.hasNextLine()) {//Mientras sigua habiendo lineas se ejecutará, necesario para recorrer todo el documento

                linea = datosFichero.nextLine();//Guardamos el espacio de memoria para la información

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(";");
                
                Registro r = new Registro();
                

                r.setCurso(tokens[1].replaceAll("\"", "").replaceAll(" ", ""));
                r.setIniciales(tokens[2].replaceAll("\"", "").replaceAll(" ", ""));
                r.setAsignatura(tokens[3].replaceAll("\"", "").replaceAll(" ", ""));
                r.setAula(tokens[4].replaceAll("\"", "").replaceAll(" ", ""));
                r.setDia(Integer.parseInt(tokens[5]));
                r.setHora(Integer.parseInt(tokens[6]));
                

                listaRegistros.add(r);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(listaRegistros.get(1));
    }
}
