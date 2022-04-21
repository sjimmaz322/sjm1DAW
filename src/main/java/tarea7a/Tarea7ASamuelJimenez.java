/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package tarea7a;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samjimmaz
 */
public class Tarea7ASamuelJimenez {

    public static void main(String[] args) throws FileNotFoundException {

        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Profesor> listaProfesores = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {
            datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(",");
                Profesor p1 = new Profesor();

                //Guardamos cada campo en su posición requerida
                p1.setNombre(descomillar(tokens[0] + tokens[1]));
                p1.setDNI(descomillar(tokens[2]));
                p1.setPuesto(descomillar(tokens[3]));
                String inicio = descomillar(tokens[4]);
                p1.setFechInicio(LocalDate.parse(inicio, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                String fin = descomillar(tokens[5]);
                if (fin.length() <= 0) {
                    p1.setFechFin(LocalDate.now());
                } else {
                    p1.setFechFin(LocalDate.parse(fin, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                }
                p1.setTelefono(descomillar(tokens[6]));
                p1.setEvaluador(descomillar(tokens[7]));
                p1.setCoordinador(descomillar(tokens[8]));

                //Añadimos el profesor creado a la lista
                listaProfesores.add(p1);

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //Una vez tenemos la lista completa, la imprimimos
        for (int i = 0; i < listaProfesores.size(); i++) {
            System.out.println(listaProfesores.get(i).toString());
            System.out.println("\n");

        }

    }

    private static String descomillar(String s) {//Método para quitar comillas, equivalente a trim (?)
        String quitar = s.substring(1, s.length() - 1);
        return quitar;
    }

}
