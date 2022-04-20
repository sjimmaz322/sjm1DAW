package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
Implementa un programa que guarde exactamente 75 líneas de texto en un fichero,cuyo nombre se deja a tu elección.
En cada línea se irán generando letras aleatorias (entre la ‘a’ y la ‘Z’) y se irán separando por punto y coma (;)
hasta que la letra que se vaya a escribir sea ‘g’ o ‘G’. En este caso, se escribe y se saltará a la línea siguiente.
Posibles ejemplos de líneas generadas:
 
	a;C;T;B;D;s;u;i;w;g
	Q;w;e;r;t;y;S;H;J;K;G
	….
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        String idFichero = "lineas.txt"; //Creamos el fichero.
        char tmp; //Creamos una variable auxiliar para ayudarnos en la escritura
        int aux;
        Random rd = new Random();

        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            for (int i = 0; i < 75; i++) {
                do{
                aux = rd.nextInt(122 - 65 + 1) + 65;
                }while (aux>=91 && aux <= 96);
                tmp = (char)aux;
                String temp = Character.toString(tmp);
                if (temp.equalsIgnoreCase("g")) {
                    flujo.write(temp +"\n");
                } else {
                    flujo.write(temp + ";");
                    i--;
                }
                flujo.flush();
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        

    }

}
