package practica71;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Utils {

    /*
    A partir de una lista de empleados y un nombre, indique si hay algún empleado con ese nombre.
     */
    //Método que devuelve true si el nombre del profesor está en la lista y false si no lo está
    //Debemos introducir la lista y el nombre buscado
    public static boolean comprobarNombre(ArrayList<Profesor> lista, String nombre) {
        //Bucle for para recorrer toda la lista
        for (int i = 0; i < lista.size(); i++) {
            //Condición para que se devuelva true, o sea, que el nombre esté en la lista
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }

        }
        return false;
    }

    /*
    A partir de una lista de empleados y un nombre de departamento, indique el número de empleados Coordinadores de ese departamento.
     */
    //Método para calcular cuantos profesores de un departament son coordinadors
    public static int profesoresDepartamento(ArrayList<Profesor> lista, String departamento) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            //Condición para que se sume uno al contador de coordinadores por departamento
            if (lista.get(i).getPuesto().equalsIgnoreCase(departamento) && lista.get(i).getCoordinador().equalsIgnoreCase("Sí")) {
                contador++;
            }

        }
        return contador;
    }

    /*
    A partir de una lista de empleados y una letra del NIF (char),
    obtener una nueva lista ordenada alfabéticamente SOLO con los apellidos de los empleados cuyo NIF contenga esa letra.
     */
    //Método para obtener una lista de los apellidos de los profesores cuyo DNI cumpla que la letra de su DNI sea la buscada
    public static ArrayList<String> catalogarPorDNI(ArrayList<Profesor> lista, char letra) {

        ArrayList<String> catalogados = new ArrayList<>();//Lista para guardar los apellidos

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDNI().charAt(8) == letra) {//Condición para que se agregen los apellidos a la lista
                catalogados.add(lista.get(i).getApellidos());
            }

        }
        Collections.sort(catalogados);

        return catalogados;
    }

    /*
    A partir de una lista de empleados y una fecha, obtener una nueva lista con los NIF (ordenados de forma inversa)
    de todos los empleados cuya toma de posesión coincida con esa fecha.
     */
    //Método para catalogar los profesores por DNI en orden inverso según una fecha
    public static ArrayList<Profesor> catalogarDNIInverso(ArrayList<Profesor> lista, LocalDate fecha) {

        ArrayList<Profesor> dnis = new ArrayList<>();//Creamos la lista que contendrá los profesores

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getFechInicio().isEqual(fecha)) {//Condición para que se introduzca en profesor en la lista
                dnis.add(lista.get(i));
            }

        }

        Collections.reverse(dnis);

        return dnis;
    }
}
