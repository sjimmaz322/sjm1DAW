/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaexamen;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mapacherben
 */
public class Json {
      //Método el cual genera un fichero JSON
    //Cambiar Object por el tipo de objeto requerido
    
    
    public static void generarFicheroJSON(ArrayList<Object> listaApps, String idFichero) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();

        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        mapeador.writeValue(new File(idFichero), listaApps);
    }

    public static void leerFicheroJSON(String idFichero) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());

        ArrayList<Object> listaApps = mapeador.readValue(new File(idFichero),
                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Object.class));
        System.out.println("---- Catálogo de Apps ----");
        for (Object obj : listaApps) {
            System.out.println(obj);
        }
}
}
