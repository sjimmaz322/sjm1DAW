/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import herencia.Deportivo;
import herencia.Furgoneta;
import herencia.Turismo;
import herencia.Vehicles;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Cris
 */
public class Ejercicio10 {

    //Método de clase el cual crea un archivo pasándole la dirección donde se quiere ubicar-
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
            System.out.println("Seguramente la ruta está mal escrita o no existe");

        }

    }

    //Método el cual copia los ficheros introduciendo una ruta origen y lo copia en la rutaDestino
    public static void copiarFicheros(String rutaOrigen, String rutaDestino) {

        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);

        try {

            //Copia los archivos de la ruta origen a una ruta de destino
            Files.copy(origen, destino);

        } catch (IOException e) {
            System.out.println("Problema copiando el archivo.");
            System.out.println(e.toString());

        }
    }

    //metodo el cual dice si los directorios existen o no y aparece su nombre
    public static void listarDirectorio(String ruta) {

        File file = new File(ruta);

        //Si existe lo guarda en una lista
        if (file.exists()) {

            File[] ficheros = file.listFiles();

            for (File file2 : ficheros) {

                System.out.println(file2.getName());

            }
        } else {
            System.out.println("El directorio a listar no existe");
        }
    }

    //Método el cual lee los ficheros y guarda los vehiculos en una lista de objetos
    public static ArrayList<Vehicles> leerFicheros(String idFichero) {

        System.out.println("Leyendo el fichero: " + idFichero);

        String[] tokens;
        String linea;
        ArrayList<Vehicles> vehiculos = new ArrayList<>();

        try (Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {

            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(";");
                Vehicles tmp;

                //Según el token 0 se crea un objeto de cada tipo vacío
                switch (tokens[0]) {
                    case "0":
                        tmp = new Turismo();
                        break;
                    case "1":
                        tmp = new Deportivo();
                        break;
                    default:
                        tmp = new Furgoneta();
                        break;
                }

                //Como estos valores nunca cambian independientemente del objeto pues lo dejamos ahí
                tmp.setBastidor(Long.parseLong(tokens[1]));
                tmp.setMatricula(tokens[2]);
                tmp.setMarca(tokens[3]);
                tmp.setModelo(tokens[4]);
                tmp.setColor(tokens[5]);
                tmp.setTarifa(Double.parseDouble(tokens[6]));
                tmp.setDisponible(Boolean.valueOf(tokens[7]));

                //Aquí ya tratamos con los atributos según el tipo de coche
                if (tmp instanceof Turismo) {

                    ((Turismo) tmp).setPuertas(Integer.parseInt(tokens[8]));
                    ((Turismo) tmp).setMarchaAutomatica(Boolean.parseBoolean(tokens[9]));

                } else if (tmp instanceof Furgoneta) {

                    ((Furgoneta) tmp).setCarga(Integer.parseInt(tokens[8].substring(1)));
                    ((Furgoneta) tmp).setVolumen(Integer.parseInt(tokens[9].substring(1)));

                } else if (tmp instanceof Deportivo) {

                    ((Deportivo) tmp).setCilindrada(Integer.parseInt(tokens[8].substring(1)));

                }
                vehiculos.add(tmp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return vehiculos;
    }

    public static void borrarElemento(String ruta) {
        Path file = Paths.get(ruta);
        try {
            Files.delete(file);
        } catch (NoSuchFileException nsfe) {
            System.out.println("No se puede borrar " + ruta + " porque no existe");
        } catch (DirectoryNotEmptyException dnee) {
            System.out.println("No se puede borrar el directorio porque no estÃ¡ vacÃ­o");
        } catch (IOException e) {
            System.out.println("Problema borrando el elemento " + ruta);
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicles> listaVehicles = new ArrayList<>();

        // Creo el directorio
        crearDirectorio("./copias");
        // Copio los archivos a la nueva ruta
        copiarFicheros("./turismo.csv", "./copias/Turismos.csv");
        copiarFicheros("./deportivo.csv", "./copias/Deportivos.csv");
        copiarFicheros("./furgoneta.csv", "./copias/Furgonetas.csv");

        listarDirectorio("./copias");

        ArrayList<Vehicles> listaTurismos = leerFicheros("./copias/Turismos.csv");
        ArrayList<Vehicles> listaDeportivos = leerFicheros("./copias/Deportivos.csv");
        ArrayList<Vehicles> listaFurgonetas = leerFicheros("./copias/Furgonetas.csv");

        borrarElemento("./turismo.csv");
        borrarElemento("./deportivo.csv");
        borrarElemento("./furgoneta.csv");

        // Imprimir la lista por pantalla. 
        for (Vehicles listaTurismo : listaTurismos) {
            System.out.println(listaTurismo.toString());
            listaVehicles.add(listaTurismo);
        }
        for (Vehicles listaDeportivo : listaDeportivos) {
            System.out.println(listaDeportivo.toString());
            listaVehicles.add(listaDeportivo);
        }
        for (Vehicles listaFurgoneta : listaFurgonetas) {
            System.out.println(listaFurgoneta.toString());
            listaVehicles.add(listaFurgoneta);
        }
        /*
    Usando Streams, realiza las siguientes acciones sobre la lista de vehículos:
    -Comprueba si hay algún Peugeot negro disponible en la lista.
         */
        System.out.println("\n\n------EJERCICIOS STREAM------");

        System.out.println("\nEjercicio1--------\n");
        listaVehicles.stream()
                .filter(coche -> coche.getColor().equalsIgnoreCase("Blanco"))
                .distinct()
                .sorted((p1, p2) -> p1.getMatricula().compareTo(p2.getMatricula()))
                .forEach(System.out::println);

        System.out.println("\nEjercicio2--------\n");
        List<String> marca = listaVehicles.stream()
                .filter(coche -> coche.isDisponible())
                .map(coche -> coche.getMarca())
                .distinct()
                .collect(Collectors.toList());
        for (String string : marca) {
            System.out.println(string);
        }

        System.out.println("\nEjercicio3--------\n");
        long numCitroen = listaVehicles.stream()
                .filter(coche -> coche.getMarca().equalsIgnoreCase("Citroen"))
                .count();
        System.out.println("Hay " + numCitroen + " Citroens");

        boolean hayPeugeotNegro = listaVehicles.stream()
                .filter(coche -> coche.getMarca().equalsIgnoreCase("Peugeot"))
                .filter(coche -> coche.getColor().equalsIgnoreCase("Negro"))
                .filter(coche -> coche.isDisponible())
                .isParallel();
        System.out.println("¿Hay un peugeot negro disponible? " + hayPeugeotNegro);
    }

}