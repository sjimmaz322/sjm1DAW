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


    }

   private static Map<Vuelo, Integer> mapeado(ArrayList<Vuelo> listaVuelos) {
        Map<Vuelo, Integer> listaPasajeros = new HashMap<>();
        for (int i = 0; i < listaVuelos.size(); i++) {

        }
        return listaPasajeros;
    }

    private static int mapeado(String codigo, ArrayList<Vuelo> listaPasajeros) {
        int numPasajeros = 0;
        for (int i = 0; i < listaPasajeros.size(); i++) {
            if (listaPasajeros.get(i).equals(codigo)) {
                numPasajeros = listaPasajeros.get(i).getUsuarios().size();
            }
        }
        return numPasajeros;
    }
}
