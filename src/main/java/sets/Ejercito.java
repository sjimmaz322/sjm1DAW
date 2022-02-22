package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creamos la lista HashSet ya que no puede haber soldados duplicados
        Set<Soldats> army = new HashSet<>();

        //Añadimos soldados a nuestro ejército
        //army.add(new Soldats(nif, nombre, apellido1, apellido2, 0));
        army.add(new Soldats("30027782M", "Seru", "Mano", "Terrestre", 28));
        army.add(new Soldats("12345678Z", "Donver", "Duras", "Crudas", 20));
        army.add(new Soldats("87654321X", "Elmin", "Gapocha", "Triste", 23));
        army.add(new Soldats("32145687R", "Ester", "Colero", "Oliente", 25));
        army.add(new Soldats("34326875F", "Dolores", "de Cabeza", "Fuertes", 22));

        // Ejercito.alistarSoldado(army);
        Ejercito.listarSoldados(army);

        Ejercito.tamanioEjercito(army);
        
        Ejercito.licenciarSoldado(army);

        Ejercito.listarSoldados(army);
    }

    public static void alistarSoldado(Set<Soldats> armada) {//Método para alistar a un nuevo soldado
        String nif, nombre, apellido1, apellido2;
        Scanner sc = new Scanner(System.in);
        int edad;

        System.out.println("Introduzca el NIF del cadete");
        nif = sc.nextLine();

        System.out.println("Introduzca el nombre del cadete");
        nombre = sc.nextLine();

        System.out.println("Introduzca el primer apellido del cadete");
        apellido1 = sc.nextLine();

        System.out.println("Introduzca el segundo apellido del cadete");
        apellido2 = sc.nextLine();

        System.out.println("Introduzca la edad del cadete");
        edad = sc.nextInt();

        armada.add(new Soldats(nif, nombre, apellido1, apellido2, edad));
    }

    public static void listarSoldados(Set<Soldats> armada) {//Método para imprimir la lista de cadetes

        armada.forEach(System.out::println);
    }

    public static void tamanioEjercito(Set<Soldats> armada) {//Método para comprobar el tamaño del ejército
        System.out.println("Ahora el ejercito contiene " + armada.size() + " efectivos.");

    }

    public static void licenciarSoldado(Set<Soldats> armada) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza el NIF del soldado a licenciar");
        String nif = sc.nextLine();
        Soldats s = new Soldats(nif, " ", " ", " ", 0);
        if (armada.contains(s)){
        armada.remove(s);
        }
        
    }
}
