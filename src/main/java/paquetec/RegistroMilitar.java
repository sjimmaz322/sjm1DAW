package paquetec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RegistroMilitar {

    private Set<Soldados> lista;

    public RegistroMilitar() {
        this.lista = new HashSet<>();
    }

    public int tamanioEjercito() {
        return lista.size();
    }

    public void alistarSoldado(Soldados soldado) {
        lista.add(soldado);
    }

    public boolean estadoEjercito() {
        return lista.isEmpty();

    }

    public boolean comprobarSoldado(Soldados s) {

        return lista.contains(s);
    }

    public ArrayList<Soldados> arraySoldados() {

        return new ArrayList<>(lista);

    }

    public void licenciarSoldado(Soldados s) {
        lista.remove(s);

    }

    public void imprimirLista() {
        for (Soldados soldado : lista) {
            System.out.println(soldado);
        }
    }
}
