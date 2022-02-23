package paqueteb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Decimo {

    private Map<String, Integer> loteria;

    public Decimo() {
        this.loteria = new HashMap();
    }

    public Map<String, Integer> getLoteria() {
        return loteria;
    }

    public void aniadeBoletoPremiado(String boleto, Integer premio) {
        loteria.put(boleto, premio);
    }
    

   
    public Map<String, Integer> listadoPremios() {
        return loteria;
    }

    public ArrayList<String> listaDecimos() {//método por si se desea comprobar los decimos creados
        ArrayList<String> decimosRegistrados = new ArrayList<String>(loteria.keySet());
        return decimosRegistrados;
    }

    public ArrayList<Integer> listaPremios() {
        ArrayList<Integer> premiosDecimos = new ArrayList<Integer>(loteria.values());
        return premiosDecimos;
    }
    public Integer consultarDecimo(String decimo) {
        return this.loteria.get(decimo);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.loteria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Decimo other = (Decimo) obj;
        if (!Objects.equals(this.loteria, other.loteria)) {
            return false;
        }
        return true;
    }
    

}
