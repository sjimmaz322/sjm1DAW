package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercito {

    private Set<Soldats> listaSoldados;

    public Ejercito() {
        this.listaSoldados = new HashSet<>();
    }

    public int numSoldados() {
        return listaSoldados.size();
    }

    public void aniadirSoldado(Soldats s) {
        listaSoldados.add(s);
    }

    public boolean estadoEjercito() {
        return listaSoldados.isEmpty();
    }

    public boolean soldadoEnEnercito(Soldats s) {
        return listaSoldados.contains(s);
    }

    public void borrarSoldado(Soldats s) {
        listaSoldados.remove(s);
    }

    public ArrayList rellenarArrayConSet() {
        ArrayList<Soldats> arraySoldados = new ArrayList<>();
        for (Soldats listaSoldado : arraySoldados) {
            arraySoldados.add(listaSoldado);
        }
        //El objeto Iterator sirve para recorrer todos los elementos de una estructura de datos
        //Es equivalente al forEach
//        Iterator<Soldats> itera1 = listaSoldados.iterator();
//        while(itera1.hasNext()){
//            Soldats aux = itera1.next();
//        }
        return arraySoldados;
    
    }
    public ArrayList<Soldats> imprimirLista(){
        ArrayList<Soldats> ejercitoLista = new ArrayList<>(listaSoldados);
//        ejercitoLista.addAll(listaSoldados);
        return ejercitoLista;
    }
}
