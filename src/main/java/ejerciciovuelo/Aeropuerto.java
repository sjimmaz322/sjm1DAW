package ejerciciovuelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Aeropuerto {

    public static void main(String[] args) {

        ArrayList<Pasajero> registro = new ArrayList<>();
        ArrayList<Vuelo> listaVuelos = new ArrayList<>();
        Map<String, ArrayList<Pasajero>> lista = new HashMap<>();

        Vuelo v1 = new Vuelo("V001", "Albacete", "Noruega", "37 horas", new ArrayList<>());

        v1.getUsuarios().add(new Pasajero("Turista", "P1", "p1", new Nif("001")));
        v1.getUsuarios().add(new Pasajero("Turista", "P2", "p2", new Nif("002")));
        v1.getUsuarios().add(new Pasajero("Turista", "P3", "p3", new Nif("003")));
        v1.getUsuarios().add(new Pasajero("Turista", "P4", "p4", new Nif("004")));
        v1.getUsuarios().add(new Pasajero("Turista", "P5", "p5", new Nif("005")));
        
        listaVuelos.add(v1);
        
        System.out.println(Aeropuerto.pasajerosPorVuelo(listaVuelos));
        
        System.out.println(Aeropuerto.listaPasajeros(v1.getCiudadDestino(), listaVuelos));
    
    }
        private static HashMap<String, Integer> pasajerosPorVuelo(ArrayList<Vuelo> listaVuelos) {
        HashMap<String, Integer> listaPasajeros = new HashMap<>();
            for (Vuelo listaVuelo : listaVuelos) {
                if (listaVuelos.contains(listaVuelo)){
                listaPasajeros.put(listaVuelo.getCiudadDestino(), listaVuelo.getUsuarios().size()+listaVuelo.getUsuarios().size());
                }else{
                listaPasajeros.put(listaVuelo.getCiudadDestino(), listaVuelo.getUsuarios().size());
                }
            }
        return listaPasajeros;
    }

    private static TreeMap<String, ArrayList<Pasajero>> listaPasajeros(String codigo, ArrayList<Vuelo> listaVuelos) {
        TreeMap<String, ArrayList<Pasajero>> aux = new TreeMap<>();
        for (Vuelo lis : listaVuelos) {
            aux.put(lis.getCiudadDestino(), lis.getUsuarios());
        }  
        return aux;
    }

}
