/*
Tenemos la clase Vuelo con 5 atributos: codigo de vuelo, ciudad origen, ciudad destino, duración del vuelo y lista de pasajeros.
En el main se genera una lista de vuelos,  un método estático que genere un map que contenga para cada destino el número de pasajeros
que llegan a ese destino de todos los vuelos, otro método donde repetimos el método anterior pero ordenando alfabéticamente por destino
y el tercer método debe de permitir saber por código de vuelo los pasajeros que hay
 */
package ejerciciovuelo;

import java.util.ArrayList;

/**
 *
 * @author Mapacherben
 */
public class Vuelo {
    
    private String codVuelo, ciudadOrigen, ciudadDestino, duracionVuelo;
    private ArrayList<Pasajero> usuarios;

    public Vuelo(String codVuelo, String ciudadOrigen, String ciudadDestino, String duracionVuelo, ArrayList<Pasajero> usuarios) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracionVuelo = duracionVuelo;
        this.usuarios = usuarios;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(String duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public ArrayList<Pasajero> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Pasajero> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codVuelo=" + codVuelo + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracionVuelo=" + duracionVuelo + ", usuarios=" + usuarios + '}';
    }
    
    
    
}
