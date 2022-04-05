package ejerciciovuelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aeropuerto {

    public static void main(String[] args) {

        ArrayList<Vuelo> registro = new ArrayList<>();
        Map<String, ArrayList<Pasajero>> lista = new HashMap<>();

        Vuelo v1 = new Vuelo("V001", "Albacete", "Noruega", "37 horas", new ArrayList<>());
        v1.getUsuarios().add(new Pasajero("Turista", "P1", "p1", new Nif("001")));
        v1.getUsuarios().add(new Pasajero("Turista", "P2", "p2", new Nif("002")));
        v1.getUsuarios().add(new Pasajero("Turista", "P3", "p3", new Nif("003")));
        v1.getUsuarios().add(new Pasajero("Turista", "P4", "p4", new Nif("004")));
        v1.getUsuarios().add(new Pasajero("Turista", "P5", "p5", new Nif("005")));

//        System.out.println(Aeropuerto.getPasajeros("V001",registro));
//        lista = Aeropuerto.mapeado(registro);
               
    }

//   private static Map<Vuelo, Integer> mapeado(ArrayList<Vuelo> listaVuelos) {
//        Map<Vuelo, Integer> listaPasajeros = new HashMap<>();
//        for (int i = 0; i < listaVuelos.size(); i++) {
//
//        }
//        return listaPasajeros;
//    }
//
//        private static int getPasajeros(String codigo, ArrayList<Vuelo> listaVuelos) {
//
//        for (int i = 0; i < listaVuelos.size(); i++) {
//            if (listaVuelos.get(i).getCodVuelo().equalsIgnoreCase(codigo)) {
//                return listaVuelos.get(i).getUsuarios().size();
//            }
//
//        }
//        return 0;
//    }
}
