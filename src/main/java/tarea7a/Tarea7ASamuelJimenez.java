package tarea7a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

*/

public class Tarea7ASamuelJimenez {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        //Creamos las listas para contener los profesores requeridos
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        ArrayList<Profesor> profesoresVeteranos = new ArrayList<>();

        Map<String, Integer> listaDept = new HashMap();
        
        System.out.println("Leyendo el fichero: " + idFichero);//Sout puramente estético

        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {//Try-with-resourcer para leer el documento con Scanner
            datosFichero.nextLine();//Nos saltamos la primera linea que no nos interesa
            while (datosFichero.hasNextLine()) {//Mientras sigua habiendo lineas se ejecutará, necesario para recorrer todo el documento

                linea = datosFichero.nextLine();//Guardamos el espacio de memoria para la información

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

                String fin = descomillar(tokens[5]);//Si no hay fecha de finalización usamos la fecha actual
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
//        for (int i = 0; i < listaProfesores.size(); i++) {
//            System.out.println(listaProfesores.get(i).toString());
//            System.out.println("\n");
//
//        }
        //Añadimos los profesores que lleven trabajando más de 100 dias con ChronoUnit
        for (Profesor prof : listaProfesores) {
            if (ChronoUnit.DAYS.between(prof.getFechInicio(), prof.getFechFin()) > 100) {
                profesoresVeteranos.add(prof);
            }
        }
        //Comprobamos que la criba ha funcionado
//        for (int i = 0; i < profesoresVeteranos.size(); i++) {
//            System.out.println(profesoresVeteranos.get(i).toString());
//            System.out.println("\n");
//
//        }
        //Comprobamos que no hemos copiado dos veces la misma lista
        System.out.println(listaProfesores.size());
        System.out.println(profesoresVeteranos.size());

        String idFichero2 = "listadoVeteranos.csv"; //Creamos el fichero.

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {
            flujo.write("Nombre\tDNI\tPuesto\tFecha de Toma\tFecha de Cese\tTeléfono\tEvaluador\tCoodinador");
            flujo.newLine();

            for (Profesor profesor : profesoresVeteranos) {
                flujo.write(profesor.toString());
                flujo.newLine();

            }

            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero2 + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        listaDept = mapear(listaProfesores);
        
        System.out.println(listaDept+"\n");
    }

    private static String descomillar(String s) {//Método para quitar comillas, equivalente a trim (?)
        String quitar = s.substring(1, s.length() - 1);
        return quitar;
    }

    private static Map<String, Integer> mapear(ArrayList<Profesor> listaProfesores) {
        Map<String, Integer> listadoDepartamentos = new HashMap();
        int contadorDepartamento = 1;
        for (Profesor profesor : listaProfesores) {
            if (listadoDepartamentos.containsKey(profesor.getPuesto())) {
                contadorDepartamento++;
                listadoDepartamentos.put(profesor.getPuesto(), contadorDepartamento);
            } else {
                contadorDepartamento = 1;
                listadoDepartamentos.put(profesor.getPuesto(), contadorDepartamento);

            }
        }

        return listadoDepartamentos;

    }
}
