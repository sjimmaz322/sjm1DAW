package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import herencia.Deportivo;
import herencia.Furgoneta;
import herencia.Turismo;
import herencia.Vehicles;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
Realiza una modificación sobre el programa del ejercicio 7 para que divida la única lista de objetos Vehiculo
en tres listas específicas de objetos Turismo, Deportivo y Furgoneta. 
Una vez generadas las tres listas, guarda en tres ficheros CSV (*.csv) 
los vehículos correspondientes a cada lista, separando cada campo usando el carácter delimitador punto y coma (;).
Abre los ficheros CSV usando un programa de hoja de cálculo, indicando que la separación de campos se realiza usando ;,
y comprueba que cada campo se encuentra en una columna diferente.
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        String idFichero = "vehicle.txt";
        String idFichero2 = "furgoneta.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        ArrayList<Vehicles> listaVehiculo = new ArrayList<>();
        ArrayList<Turismo> listaTurismo = new ArrayList<>();
        ArrayList<Deportivo> listaDeportivo = new ArrayList<>();
        ArrayList<Furgoneta> listaFurgoneta = new ArrayList<>();

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {//Try-with-resourcer para leer el documento con Scanner
            datosFichero.nextLine();//Nos saltamos la primera linea que no nos interesa
            while (datosFichero.hasNextLine()) {//Mientras sigua habiendo lineas se ejecutará, necesario para recorrer todo el documento

                linea = datosFichero.nextLine();//Guardamos el espacio de memoria para la información
                // Se guarda en el array de String cada elemento de la
                // línea en función del carácter separador dos puntos
                tokens = linea.split(";");

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

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {

            for (Furgoneta fur : listaFurgoneta) {
                flujo.write(fur.toString());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero2 + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
