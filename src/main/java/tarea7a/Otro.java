/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.util.TreeMap;

/**
 *
 * @author Mapacherben
 */
public class Otro {

    //Método el cual quita las comillas del principio y el final de la palabra
    private static String descomillar(String s) {//Método para quitar comillas, equivalente a trim (?)
        String quitar = s.substring(1, s.length() - 1);
        return quitar;
    }

    //Metodo el cual mapea un ArrayList y cuenta los profesores según los departamentos
    private static Map<String, Integer> mapear(ArrayList<Profesor> lista) {
        Map<String, Integer> listaProfesores = new HashMap();
        int contadorDepartamento = 1;
        for (Profesor profesor : lista) {
            if (listaProfesores.containsKey(profesor.getPuesto())) {
                contadorDepartamento++;
                listaProfesores.put(profesor.getPuesto(), contadorDepartamento);
            } else {
                contadorDepartamento = 1;
                listaProfesores.put(profesor.getPuesto(), contadorDepartamento);

            }
        }

        return listaProfesores;
    }

    //Método el cual lee un csv y lo mete en un ArrayList
    private static ArrayList<Profesor> lectura() {
        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Profesor> lista = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try (Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(",");
                Profesor p1 = new Profesor();

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

                lista.add(p1);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return lista;

    }

    private static void escrituraMapeo(Map<String, Integer> listita) {

        ArrayList<Profesor> lista = lectura();
        listita = new TreeMap<>();
        listita = mapear(lista);
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        Scanner teclado = new Scanner(System.in);
        String idFichero = "profesoresPorDepartamento.csv";
        String tmp;

        // Si se utiliza el constructor FileWriter(idFichero, true) entonces se anexa información
        // al final del fichero idFichero
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            flujo.write("Departamentos\tNúmero");
            flujo.newLine();
            for (String key : listita.keySet()) {
                flujo.write(key + " \t " + listita.get(key));
                flujo.newLine();
            }

            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Devuelve del nº de día entre una fecha y otra
    public static long diaEntreFechas(LocalDate ini, LocalDate fin) {

        //Restamos
        long resultado = ChronoUnit.DAYS.between(ini, fin);

        //Devolvemos el resultado
        return resultado;
    }

    //Metodo el cual crea el csv de los profesores que llevan más de 100 días trabajando
    private static void escrituraListaAntiguedad(ArrayList<Profesor> lista) {

        lista = lectura();
        // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        Scanner teclado = new Scanner(System.in);
        String idFichero = "profesoresAntiguos.csv";
        String tmp;

        // Si se utiliza el constructor FileWriter(idFichero, true) entonces se anexa información
        // al final del fichero idFichero
        // Estructura try-with-resources. Instancia el objeto con el fichero a escribir
        // y se encarga de cerrar el recurso "flujo" una vez finalizadas las operaciones
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            flujo.write("Nombre\tDNI/Pasaporte\tPuesto\tFecha de Toma\tFecha de Cese\tTeléfono\tEvaluador\tCoodinador");
            flujo.newLine();
            for (Profesor prof : lista) {
               if (ChronoUnit.DAYS.between(prof.getFechInicio(), prof.getFechFin()) > 100) {
                lista.add(prof);
            }
            }

            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ArrayList<Profesor> lista = lectura();
        Map<String, Integer> mapProfes = new HashMap<>();
        mapProfes = mapear(lista);

        int contador = 0;

        for (Profesor profesor : lista) {
            System.out.println(profesor.toString());
            contador++;
        }

        System.out.println("\n\nHay un total de: " + contador + " profesores");

        escrituraMapeo(mapProfes);
        escrituraListaAntiguedad(lista);
    }
}