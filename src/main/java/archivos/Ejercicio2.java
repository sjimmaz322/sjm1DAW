package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Implementa un programa que vaya escribiendo líneas de texto en un archivo. 
El archivo se llamará “teclado.txt” y se creará en la raíz del proyecto. 
El programa irá solicitando líneas de texto al usuario (cada línea termina con un salto de línea , ‘\n’) 
y las irá escribiendo en el fichero. 
Cuando en una nueva línea el usuario introduzca el texto “EOF”,
el programa terminará y esa línea no se escribirá en el fichero. 
Controla las posibles excepciones que pudieran ocurrir.

 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        String idFichero = "teclado.txt"; //Creamos el fichero.
        Scanner sc = new Scanner(System.in);
        String tmp;
        System.out.println("Introduza texto hasta que desee.\nPara parar introduza EOF.");
        
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            do{
            tmp = sc.nextLine();
            if (!tmp.equalsIgnoreCase("EOF")){
                flujo.write(tmp + "\t");
            }
            }while (!tmp.equalsIgnoreCase("EOF"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

//        BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero));
//        do {
//            try {
//                System.out.println("Introduzca lo que desea");
//                tmp = sc.nextLine();
//
//                if (!sc.hasNext("EOF")) {
//                }
//                flujo.write(tmp + "\t");
//                flujo.flush();
//
//                System.out.println("Fichero " + idFichero + " creado correctamente.");
//            } catch (IOException e) {
//                System.out.println(e.getMessage());
//            }
//            // Metodo fluh() guarda cambios en disco 
//
//        } while (!sc.hasNext("EOF"));
//
//    }
