/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaexamen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mapacherben
 */
public class TXT {
    
  public static void generarFicheroTxt(ArrayList<Object> lista, String idFichero) {

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {

            for (Object app : lista) {
                flujo.write(app.toString());
                flujo.newLine();
            }
            //Llamada -explicita- para que se guarde lo que se llama en el disco
            //Sin flush funciona pero se recomienda.
            flujo.flush();

            System.out.println("El fichero " + idFichero + " se ha creado correctamente");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void generarFicheroTxtIndividual(ArrayList<Object> lista) {
        
        String linea = "";
        String[] tokens;
        
              for (Object aplic : lista) {

            String archivo = aplic.toString(); //Debería ser getNombre o algo así

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
}
