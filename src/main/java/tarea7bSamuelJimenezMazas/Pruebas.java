package tarea7bSamuelJimenezMazas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Pruebas {

    public static void main(String[] args) {

        ArrayList<App> aplicaciones = new ArrayList<>();
        String linea = "";
        String[] tokens;

        int contador = 1;
        for (int i = 0; i < 50; i++) {
            App app = new App();
            aplicaciones.add(app);
        }

        for (App aplic : aplicaciones) {
            System.out.println(aplic);
        }

        String rutaOrigen1 = "./appstxt/aplicaciones.txt";
        String rutaOrigen2 = "./appsxml/aplicaciones.xml";
        String rutaOrigen3 = "./appsjson/aplicacionesxml.json";

        String idFichero = "./appstxt/aplicaciones.txt";

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (App aplic : aplicaciones) {
                flujo.write(aplic.toString());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String idFichero2 = "./appsxml/aplicaciones.xml";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {
            for (App aplic : aplicaciones) {
                flujo.write(aplic.toString());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String idFichero3 = "./appsjson/aplicacionesxml.json";
        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero3))) {
            for (App aplic : aplicaciones) {
                flujo.write(aplic.toString());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (Scanner datosFichero = new Scanner(new File(idFichero))) {

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                System.out.println("Linea " + contador);
                System.out.println(linea);
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("FICHERO XML");
        try (Scanner datosFichero = new Scanner(new File(idFichero2))) {

            contador = 1;
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                System.out.println("Linea XML " + contador);
                System.out.println(linea);
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("FICHERO JSON");
        try (Scanner datosFichero = new Scanner(new File(idFichero3))) {

            contador = 1;
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                System.out.println("Linea JSON " + contador);
                System.out.println(linea);
                contador++;
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        crearDirectorio("./copias");
        String rutaDestino1 = "./copias/app.txt";
        String rutaDestino2 = "./copias/app.xml";
        String rutaDestino3 = "./copias/app.json";
        String rutaDestino4 = "./aplicaciones";

        Path origen = Paths.get(rutaOrigen1);
        Path destino = Paths.get(rutaDestino1);

        try {

            //Copia los archivos de la ruta origen a una ruta de destino
            Files.copy(origen, destino);

        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());

        }
        origen = Paths.get(rutaOrigen2);
        destino = Paths.get(rutaDestino2);

        try {

            //Copia los archivos de la ruta origen a una ruta de destino
            Files.copy(origen, destino);

        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());

        }
        origen = Paths.get(rutaOrigen3);
        destino = Paths.get(rutaDestino3);

        try {

            //Copia los archivos de la ruta origen a una ruta de destino
            Files.copy(origen, destino);

        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());

        }

        for (App aplic : aplicaciones) {

            String archivo = aplic.getNombre();

            try (BufferedWriter flujo = new BufferedWriter(new FileWriter("./aplicaciones/" + archivo + ".txt"))) {
                tokens = linea.split(";");
                
                flujo.write(aplic.toString());

                // Metodo fluh() guarda cambios en disco 
                flujo.flush();
                System.out.println("Fichero creado correctamente.");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public static void crearDirectorio(String ruta) {

        //Esto hace que se indique la ruta donde se quiere ubicar
        Path directory = Paths.get(ruta);

        //try/catch para controlar posibles excepciones
        try {
            //Crea el directorio
            Files.createDirectory(directory);

            //Si ya existe sale esta excepción
        } catch (FileAlreadyExistsException faee) {

            //Lo cual hace que salga un mensaje específico
            System.out.println("No se puede crear " + ruta + " porque ya existe");

            //Si el usuario no tiene permisos para crear archivos en el ordenador
            //(lo pongo para usos futuros o pruebas)
        } catch (AccessDeniedException ade) {

            System.out.println("No tiene permisos para crear " + ruta);

            //Si la ruta está mal escrita o si hay algún problem creando el directorio
        } catch (IOException ioe) {

            System.out.println("Problema creando el directorio " + ruta);

        }

    }

}
