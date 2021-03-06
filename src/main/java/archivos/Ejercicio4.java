package archivos;

import herencia.Deportivo;
import herencia.Furgoneta;
import herencia.Turismo;
import herencia.Vehicles;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/*
Usando la clase Vehículo, implementa un programa que realice lo siguiente:
Crea 30 vehículos (10 Turismos, 10 Deportivos y 10 Furgonetas) con valores de tu elección y guárdalos en una lista de objetos tipo Vehiculo.
Guarda los vehículos en un fichero de texto llamado “vehículos.txt”, haciendo uso del método polimórfico toString(), 
teniendo en cuenta que el string devuelto lleve separados los campos del objeto por el carácter dos puntos (:).
Cada línea del fichero estará compuesta por un número, un espacio, un guión, un espacio y los datos del vehículo en cuestión. 
El número de cada línea será 0, 1 o 2 si el objeto es un Turismo, un Deportivo o una Furgoneta, respectivamente. 
Cada vehículo irá en una línea distinta del fichero.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
   // Fichero a crear. Ruta relativa a la carpeta raíz del proyecto
        String idFichero = "vehicle.txt";
        String idFichero2 = "turismo.dat";
        String idFichero3 = "deportivo.dat";
        String idFichero4 = "furgoneta.dat";
        ArrayList<Vehicles> lista = new ArrayList();
        
        //Turismos
        lista.add(new Turismo(345674L, "4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2));
        lista.add(new Turismo(345674L, "4060 TUR", "Seat", "Leon", "Negro", 90.0, 2));
        lista.add(new Turismo(345674L, "4060 TUR", "Skoda", "Fabia", "Dorado", 90.0, 2));
        lista.add(new Turismo(345674L, "4060 TUR", "Seat", "Ibiza", "Blanco", 90.0, 2));
        lista.add(new Turismo(345674L, "4062 TUR", "Porshe", "Panamera", "Negro", 90.0, 2));
        lista.add(new Turismo(345674L, "4067 TUR", "Seat", "Leon", "Blanco", 90.0, 2));
        lista.add(new Turismo(345674L, "4068 TUR", "Seat", "Ibiza", "Blanco", 90.0, 2));
        lista.add(new Turismo(345674L, "4061 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2));
        lista.add(new Turismo(345674L, "4063 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2));
        lista.add(new Turismo(345674L, "4060 TUR", "Porshe", "Panamera", "Blanco", 90.0, 2));

        //Deportivos
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        lista.add(new Deportivo(78654L, "4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));

        //Furgonetas
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));
        lista.add(new Furgoneta(4333L, "4080 FUR", "Fiat", "Ducato", "Azul", 80.0, 1200, 8));

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (int i = 0; i < lista.size(); i++) {
                flujo.write(lista.get(i).toString());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //De aquí para abajo es el ejercicio 8 porque soy mu tonto
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero2))) {

            for (int i = 0; i < 10; i++) {
                flujo.write(lista.get(i).toString());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero2 + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero3))) {

            for (int i = 10; i < 20; i++) {
                flujo.write(lista.get(i).toString());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero3 + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero4))) {

            for (int i = 20; i < 30; i++) {
                flujo.write(lista.get(i).toString());
                flujo.newLine();
            }
            // Metodo flush() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero4 + " creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}