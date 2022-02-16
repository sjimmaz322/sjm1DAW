/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

import java.util.Objects;

/**
 *
 * @author samjimmaz
 */
// La interfaz comparable implementa el orden natural según equals
// Obliga a implementar el método compareTo
public class Libros implements Comparable<Libros> {

    private String isbn;
    private String nombre;
    private String editorial;
    private int numPags;
    private double precio;

    public Libros() {
    }

    public Libros(String ibsn, String nombre, String editorial, int numPags, double precio) {
        this.isbn = ibsn;
        this.nombre = nombre;
        this.editorial = editorial;
        this.numPags = numPags;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPags() {
        return numPags;
    }

    public void setNumPags(int numPags) {
        this.numPags = numPags;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libros{" + "ibsn=" + isbn + ", nombre=" + nombre + ", editorial=" + editorial + ", numPags=" + numPags + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.isbn);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.editorial);
        hash = 67 * hash + this.numPags;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final Libros other = (Libros) obj;

        return Objects.equals(this.isbn, other.isbn);
    }

    // El método compareTo devuelve <0 si this es anterior
    // =0 si this y libro t son iguales
    // >0 si this es posterior
    @Override
    public int compareTo(Libros l) {
        return this.isbn.compareTo(l.isbn);
    }

}
