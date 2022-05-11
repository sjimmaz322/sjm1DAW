package examennoexamen;

import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class LecturaJson {

    
    //Nombre archivo: calificacionesGrupo.json
    public static ArrayList<Calificaciones> leerJSON(String ruta, String nombre) throws IOException{
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        ArrayList<Calificaciones> listado = mapeador.readValue(new File(ruta),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Calificaciones.class));

        for (Calificaciones list : listado) {
            listado.add(list);
        }

        
        return listado;
    }
}
