/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Comparator;

/**
 *
 * @author samjimmaz
 */
public class ComparadorISBN implements Comparator<Libros>{

    @Override
    public int compare(Libros t, Libros t1) {
       return t.getIsbn().compareTo(t1.getIsbn());
    }
    
}
