package tarea71;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Practica71SamuelJimenezMazas {

    public static void main(String[] args) {

        // Fichero a leer con datos de ejemplo
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        //Creamos las listas requeridas
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        ArrayList<String> catalogoDni = new ArrayList<>();
        ArrayList<Profesor> dnisInversos = new ArrayList<>();
        //ArrayList<Profesor> profesoresVeteranos = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);//Sout puramente estético

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {//Try-with-resourcer para leer el documento con Scanner
            datosFichero.nextLine();//Nos saltamos la primera linea que no nos interesa
            while (datosFichero.hasNextLine()) {//Mientras sigua habiendo lineas se ejecutará, necesario para recorrer todo el documento

                linea = datosFichero.nextLine();//Guardamos el espacio de memoria para la información

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(",");
                Profesor p1 = new Profesor();

                //Guardamos cada campo en su posición requerida
                p1.setApellidos(descomillar(tokens[0]));
                p1.setNombre(descomillar(tokens[1]));
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
//
//        //Comprobamos que no hemos copiado dos veces la misma lista
//        System.out.println(listaProfesores.size());
//
//        //Probamos el método creado en la clase Utils, debería devolver true
//        System.out.println("Claudia es profesora?");
//        System.out.println(Utils.comprobarNombre(listaProfesores, "Claudia"));
//        //Probamos el método creado en la clase Utils, debería devolver false
//        System.out.println("Bartolo es profesor?");
//        System.out.println(Utils.comprobarNombre(listaProfesores, "Bartolo"));
//
//        //Probamos el método creado utilizando la información de la propia lista para asegurarnos que no haya faltas de ortografía
//        System.out.println("Cuántos coordinadores hay en ese departamento?");
//        System.out.println(Utils.profesoresDepartamento(listaProfesores, listaProfesores.get(7).getPuesto()));
//
//        //Probamos el mñetodo creado con un departamento que no existe para comprobar que devuelve 0
//        System.out.println("Cuántos coordinadores hay en ese departamento?");
//        System.out.println(Utils.profesoresDepartamento(listaProfesores, "Cervezología"));
//
//        //Guardamos la lista de apellidos en una lista que hemos creado anteriormente
//        catalogoDni = Utils.catalogarPorDNI(listaProfesores, 'Z');
//        //Imprimimos la lista
//        System.out.println("Profesores cuyo dni termina en la letra buscada");
//        for (int i = 0; i < catalogoDni.size(); i++) {
//            System.out.println(catalogoDni.get(i));
//
//        }
//        //Guardamos la lista de DNIs en una lista que hemos creado anteriormente
//        System.out.println("Trabajadores que tomaron el puesto en la fecha buscada");
//        dnisInversos = Utils.catalogarDNIInverso(listaProfesores, listaProfesores.get(5).getFechInicio());
//        //Imprimimos la lista
//        for (int i = 0; i < dnisInversos.size(); i++) {
//            System.out.println(dnisInversos.get(i));
//
//        }
        System.out.println("Buscando si hay un profesor con determinado nombre\n");
        String nombre = "María";
        boolean hayProfesor = listaProfesores.stream()
                .anyMatch(profesor -> profesor.getNombre().equalsIgnoreCase(nombre));
        
        System.out.println("Algún profesor se llama "+ nombre +"? " + hayProfesor);
        
        
        
        
        System.out.println("\nBuscando el número de profesores en un departamento\n");
        String puesto = listaProfesores.get(7).getPuesto();
        
        long numPorDepto = listaProfesores.stream()
                .filter(profesor -> profesor.getPuesto().equalsIgnoreCase(puesto))
                .filter(profesor -> profesor.getCoordinador().equalsIgnoreCase("Sí"))
                .count();
        
        System.out.println("En el departamento "+puesto+ " hay "+numPorDepto+" profesores.");
        
        
        
        
        System.out.println("\nBuscando los profesores cuyos DNIs acaben en Z\n");
        String letraDni = "Z";
        
        List<String> listaApellidos = listaProfesores.stream()
                .filter(profesor -> profesor.getDNI().substring(8).equalsIgnoreCase(letraDni))
                .map(profesor -> profesor.getApellidos())
                .collect(Collectors.toList());
        
        for (String listado : listaApellidos) {
            System.out.println(listado);
        }
        
        
        
        
        System.out.println("\nBuscando los profesores por orden inverso que hayan empezado en cierta fecha\n");
        
        List<String> listaProfs = listaProfesores.stream()
                .filter(profesor -> profesor.getFechInicio().isEqual(listaProfesores.get(12).getFechInicio()))
                .map(profesor -> profesor.getDNI())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        
        
        for (String listadoInv : listaProfs) {
            System.out.println(listadoInv);            
        }
                
        
    }
        

    private static String descomillar(String s) {//Método para quitar comillas, equivalente a trim (?)
        String quitar = s.substring(1, s.length() - 1);
        return quitar;
    }
}
