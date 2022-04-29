package archivos;

import herencia.Deportivo;
import herencia.Furgoneta;
import herencia.Turismo;
import herencia.Vehicles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cristina
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    //Método el cual escribe en un csv de turismos
    private static void escribirFicheroTurismo(ArrayList<Turismo> listaTurismo) {
        //Escribimos el fichero de turismos
        String idFichero = "turismo.csv";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            flujo.write("Numero;Bastidor;Matricula;Marca;Modelo;Color;Tarifa;Disponible;Puertas;Marcha Automatica");
            flujo.newLine();
            for (Turismo turismo : listaTurismo) {
                flujo.write("0;" + turismo.getAtributos());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Método el cual escribe en un csv de deportivos
    private static void escribirFicheroDeportivo(ArrayList<Deportivo> listaDeportivo) {
        //Escribimos el fichero de turismos
        String idFichero = "deportivo.csv";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            flujo.write("Numero;Bastidor;Matricula;Marca;Modelo;Color;Tarifa;Disponible;Cilindrada");
            flujo.newLine();
            for (Deportivo deportivo : listaDeportivo) {
                flujo.write("1;" + deportivo.getAtributos());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Método el cual escribe en un csv de furgonetas
    private static void escribirFicheroFurgoneta(ArrayList<Furgoneta> listaFurgoneta) {
        //Escribimos el fichero de turismos
        String idFichero = "furgoneta.csv";
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            flujo.write("Numero;Bastidor;Matricula;Marca;Modelo;Color;Tarifa;Disponible;Carga;Volumen");
            flujo.newLine();
            for (Furgoneta furgoneta : listaFurgoneta) {
                flujo.write("2;" + furgoneta.getAtributos());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void escribirFicheros(ArrayList<Turismo> listaTurismo, ArrayList<Deportivo> listaDeportivo, ArrayList<Furgoneta> listaFurgoneta) {
        escribirFicheroTurismo(listaTurismo);
        escribirFicheroDeportivo(listaDeportivo);
        escribirFicheroFurgoneta(listaFurgoneta);

    }

    public static void main(String[] args) {

        //LECTURA EJERCICIO 7
        // Fichero a leer con datos de ejemplo
        String idFichero = "vehicle.txt";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        //Array para almacenar las posicione donde se encuentra la secuencia de caracteres
        ArrayList<Vehicles> listaVehiculo = new ArrayList<>();

        ArrayList<Turismo> listaTurismo = new ArrayList<>();
        ArrayList<Deportivo> listaDeportivo = new ArrayList<>();
        ArrayList<Furgoneta> listaFurgoneta = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);

        // Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
        // Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
        // las operaciones con el archivo
        try ( Scanner datosFichero = new Scanner(new File(idFichero))) {

            datosFichero.nextLine();

            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador coma
                tokens = linea.split(":");

                switch (Integer.parseInt(tokens[0])) {
                 case 0:
                        
                        Turismo t1 = new Turismo();
                        t1.setBastidor(Long.parseLong(tokens[1]));
                        t1.setMatricula(tokens[2]);
                        t1.setMarca(tokens[3]);
                        t1.setModelo(tokens[4]);
                        t1.setColor(tokens[5]);
                        t1.setTarifa(Double.parseDouble(tokens[6]));

                        t1.setPuertas(Integer.parseInt(tokens[7]));

                        listaVehiculo.add(t1);
                        listaTurismo.add(t1);
                        break;
                    case 1:
                        Deportivo d1 = new Deportivo();
                        d1.setBastidor(Long.parseLong(tokens[1]));
                        d1.setMatricula(tokens[2]);
                        d1.setMarca(tokens[3]);
                        d1.setModelo(tokens[4]);
                        d1.setColor(tokens[5]);
                        d1.setTarifa(Double.parseDouble(tokens[6]));
                        d1.setCilindrada(Integer.parseInt(tokens[7]));
                        
                        listaVehiculo.add(d1);
                        listaDeportivo.add(d1);
                        break;
                    case 2:
                        Furgoneta f1 = new Furgoneta();
                        f1.setBastidor(Long.parseLong(tokens[1]));
                        f1.setMatricula(tokens[2]);
                        f1.setMarca(tokens[3]);
                        f1.setModelo(tokens[4]);
                        f1.setColor(tokens[5]);
                        f1.setTarifa(Double.parseDouble(tokens[6]));
                        f1.setCarga(Integer.parseInt(tokens[7]));
                        f1.setVolumen(Integer.parseInt(tokens[8]));
                        listaVehiculo.add(f1);
                        listaFurgoneta.add(f1);
                        break;
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

//        Collections.sort(listaVehicles);
        for (Vehicles lista : listaVehiculo) {
            System.out.println(lista);

        }

        //ESCRITURA EJERCICIO 9
        escribirFicheros(listaTurismo, listaDeportivo, listaFurgoneta);
    }

}