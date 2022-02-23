package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PruebaEjercito {

    public static void main(String[] args) {

        //Creamos la lista HashSet y TreeSet con nuestros constructores.
        Ejercito army = new Ejercito();
        EjercitoOrdenado armada = new EjercitoOrdenado();

        //Añadimos soldados a nuestro ejército
        //army.add(new Soldats(nif, nombre, apellido1, apellido2, 0));
        Soldats s1 = new Soldats("30027782M", "Seru", "Mano", "Terrestre", 28);
        Soldats s2 = new Soldats("12345678Z", "Donver", "Duras", "Crudas", 20);
        Soldats s3 = new Soldats("87654321X", "Elmin", "Gapocha", "Triste", 23);
        Soldats s4 = new Soldats("32145687R", "Ester", "Colero", "Oliente", 25);
        Soldats s5 = new Soldats("34326875F", "Dolores", "de Cabeza", "Fuertes", 22);

        army.aniadirSoldado(s1);
        army.aniadirSoldado(s2);
        army.aniadirSoldado(s3);
        army.aniadirSoldado(s4);
        army.aniadirSoldado(s5);

        army.borrarSoldado(s5);//Borramos Dolores Fuertes de Cabeza

        String estado = army.estadoEjercito() ?  "No hay ejercito":"Ejercito con efectivos" ;//Comprobamos como está el ejército
        System.out.println(estado);

        int numSoldats = army.numSoldados();//Miramos cuantos efectivos hay en nuestro ejército
        System.out.println("El ejército tiene " + numSoldats + " soldados");
        
        //Metemos los soldados en un ArrayList e imprimimos
        ArrayList Soldados = army.imprimirLista();

        for (int i = 0; i < Soldados.size(); i++) {
            System.out.println(Soldados.get(i));

        }

        //Hacemos las mismas pruebas para el ejército ordenado
        armada.aniadirSoldado(s1);
        armada.aniadirSoldado(s2);
        armada.aniadirSoldado(s3);
        armada.aniadirSoldado(s4);
        armada.aniadirSoldado(s5);

        armada.borrarSoldado(s5);

        armada.estadoEjercito();

        armada.numSoldados();

        ArrayList Soldados2 = armada.imprimirLista();

        for (int i = 0; i < Soldados2.size(); i++) {
            System.out.println(Soldados2.get(i));

        }
        // Métodos static en main (funcionan)
        // PruebaEjercito.alistarSoldado(army);
//    public static void alistarSoldado(Set<Soldats> armada) {//Método para alistar a un nuevo soldado
//        String nif, nombre, apellido1, apellido2;
//        Scanner sc = new Scanner(System.in);
//        int edad;
//
//        System.out.println("Introduzca el NIF del cadete");
//        nif = sc.nextLine();
//
//        System.out.println("Introduzca el nombre del cadete");
//        nombre = sc.nextLine();
//
//        System.out.println("Introduzca el primer apellido del cadete");
//        apellido1 = sc.nextLine();
//
//        System.out.println("Introduzca el segundo apellido del cadete");
//        apellido2 = sc.nextLine();
//
//        System.out.println("Introduzca la edad del cadete");
//        edad = sc.nextInt();
//
//        armada.add(new Soldats(nif, nombre, apellido1, apellido2, edad));
//    }
//
//    public static void listarSoldados(Set<Soldats> armada) {//Método para imprimir la lista de cadetes
//
//        armada.forEach(System.out::println);
//    }
//
//    public static void tamanioEjercito(Set<Soldats> armada) {//Método para comprobar el tamaño del ejército
//        System.out.println("Ahora el ejercito contiene " + armada.size() + " efectivos.");
//
//    }
//
//    public static void licenciarSoldado(Set<Soldats> armada) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Introduzca el NIF del cadete a licenciar");
//        String nif = sc.nextLine();
//
//        System.out.println("Introduzca el nombre del cadete a licenciar");
//        String nombre = sc.nextLine();
//
//        System.out.println("Introduzca el primer apellido del cadete a licenciar");
//        String apellido1 = sc.nextLine();
//
//        System.out.println("Introduzca el segundo apellido del cadete a licenciar");
//        String apellido2 = sc.nextLine();
//
//        System.out.println("Introduzca la edad del cadete a licenciar");
//        int edad = sc.nextInt();
//
//        armada.remove(new Soldats(nif, nombre, apellido1, apellido2, edad));
//    }
//
//    public static void buscarSoldado(Set<Soldats> armada) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Introduzca el NIF del cadete a buscar");
//        String nif = sc.nextLine();
//
//        System.out.println("Introduzca el nombre del cadete a buscar");
//        String nombre = sc.nextLine();
//
//        System.out.println("Introduzca el primer apellido del cadete a buscar");
//        String apellido1 = sc.nextLine();
//
//        System.out.println("Introduzca el segundo apellido del cadete a buscar");
//        String apellido2 = sc.nextLine();
//
//        System.out.println("Introduzca la edad del cadete a buscar");
//        int edad = sc.nextInt();
//
//        String resultado = armada.contains(new Soldats(nif, nombre, apellido1, apellido2, edad)) ? "El soldado " + nombre + " está en el ejercito" : "El soldado" + nombre + " no está en el ejercito";
//
//        System.out.println(resultado);
//    }
//
//    public static void estadoEjercito(Set<Soldats> armada) {
//        int cantidad = armada.size();
//        if (cantidad != 0) {
//            System.out.println("El ejercito cuenta con efectivos");
//        } else {
//            System.out.println("No hay ejército");
//        }
//    }
//
//    public static ArrayList rellenarArrayConSet() {
//        ArrayList<Soldats> arraySoldados = new ArrayList<>();
//        for (Soldats listaSoldado : arraySoldados) {
//            arraySoldados.add(listaSoldado);
//        }
//        //El objeto Iterator sirve para recorrer todos los elementos de una estructura de datos
//        //Es equivalente al forEach
////        Iterator<Soldats> itera1 = listaSoldados.iterator();
////        while(itera1.hasNext()){
////            Soldats aux = itera1.next();
////        }
//        return arraySoldados;
//
//    }
    }
}
