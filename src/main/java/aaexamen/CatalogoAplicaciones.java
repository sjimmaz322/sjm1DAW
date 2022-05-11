/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaexamen;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mapacherben
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CatalogoAplicaciones {

    // XmLElementWrapper define un contenedor para la lista 
    @XmlElementWrapper(name = "catalogo")

    // XmlElement establece el nombre de los elementos
    // Cada elemento de la lista llevará esta etiqueta en el fichero xml
    @XmlElement(name = "aplicaciones")
    private ArrayList<Object> listaAplicaciones;


    public ArrayList<Object> getListaAplicaciones() {
        return listaAplicaciones;
    }


    public void setLista(ArrayList<Object> lista) {
        this.listaAplicaciones = lista;
    }


}