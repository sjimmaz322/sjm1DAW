package ejerciciovuelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aeropuerto {

    public static void main(String[] args) {

        ArrayList<Vuelo> registro = new ArrayList<>();
        Map<String, ArrayList<Pasajero>> lista = new HashMap<String, ArrayList<Pasajero>>();

        Vuelo v1 = new Vuelo("V001", "Albacete", "Noruega", "37 horas", new ArrayList<Pasajero>());
        v1.getUsuarios().add(new Pasajero("Turista", "Samuel", "Jiménez", new Nif("31014322")));
        
        lista = Aeropuerto.mapeado(registro);

    }

    public static Map mapeado(ArrayList<Vuelo> vAux) {
        
        Map<String, ArrayList<Pasajero>> listado = new HashMap<String, ArrayList<Pasajero>>();
        for (Vuelo v : vAux) {
            listado.put(v.getCiudadDestino(), v.getUsuarios());
        }

        return listado;
    }
        public static Map mapeadoOrdenado(ArrayList<Vuelo> vAux) {
        
        Map<String, ArrayList<Pasajero>> listado = new HashMap<String, ArrayList<Pasajero>>();
        for (Vuelo v : vAux) {
            listado.put(v.getCiudadDestino(), v.getUsuarios());
        }
        
        return listado;
    }
}
