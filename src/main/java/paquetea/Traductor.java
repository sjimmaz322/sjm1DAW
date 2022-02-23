package paquetea;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Traductor {
    
   private Map<String, String> traductore;

    public Traductor() {
        this.traductore = new HashMap();
    }

    public Map<String, String> getTraductore() {
        return traductore;
    }
    
    public void aniadeElemento(String eng, String esp){
        traductore.put(eng, esp);
    }

    public void borrarElemento(String eng){
        traductore.remove(eng);
    }
    public void remplazarElemento(String eng, String esp){
        traductore.replace(eng, esp);
    }
    public String traducir(String ingles) {
        return traductore.get(ingles);
    }
    public ArrayList<String> listaIngles() {
        ArrayList<String> palabrasIngles = new ArrayList<String>(traductore.keySet());
        return palabrasIngles;
    }
    public ArrayList<String> listaEspaniol() {
        ArrayList<String> palabrasEspaniol = new ArrayList<String>(traductore.values());
        return palabrasEspaniol;
    }
}

