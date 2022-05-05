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
                
                r.setCurso (descomillar(tokens[1].trim()));
                r.setIniciales(descomillar(tokens[2].trim()));
                r.setAsignatura(descomillar(tokens[3].trim()));
                r.setAula(descomillar(tokens[4].trim()));
                r.setDia(Integer.valueOf(tokens[5]));
                r.setHora(Integer.valueOf(tokens[6]));
                

                listaRegistros.add(r);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(listaRegistros.get(0));
    }

    private static String descomillar(String s) {//Método para quitar comillas, equivalente a trim (?)
        String quitar = s.substring(1, s.length() - 1);
        return quitar;
    }
}
