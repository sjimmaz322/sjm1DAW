package examennoexamen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class Pruebas {

    public static void main(String[] args) throws IOException {

        SortedMap<String, String> mod = LecturaCSV.leerCSV("./nombresModulos.csv", "nombresModulos.csv");

        Iterator it = mod.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + mod.get(key));

        }
        
        ArrayList<Calificaciones> lista = LecturaJson.leerJSON("./calificacionesGrupo.json", "calificacionesGrupo.json");
        
        for (Calificaciones calificaciones : lista) {
            System.out.println(calificaciones.toString());
        }

    }

}
