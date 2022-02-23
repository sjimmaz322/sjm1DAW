/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetec;

import java.util.HashMap;
import java.util.Map;
import sets.Ejercito;

/**
 *
 * @author Mapacherben
 */
public class RegistroMilitar {
     private Map<String, Ejercito> listadoBelico;

    public RegistroMilitar() {
        this.listadoBelico = new HashMap();
    }
   


    public Map<String, Ejercito> getListado() {
        return listadoBelico;
    }

    public void aniadeClaveEjercito(String clave, Ejercito aux ) {
        listadoBelico.put(clave, aux);
    }
    public void eliminarClaveEjercito(String clave, Ejercito aux ) {
        listadoBelico.remove(clave, aux);
    }
   
}
