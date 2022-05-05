package tarea7bSamuelJimenezMazas;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class App {

    private int codigo, numDescargas;
    private String nombre, descripcion;
    private double tamanio;
    private static int contador = 1;
    Random rd = new Random();
    private String[] letra = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private String[] descripciones = {"Descripción 1", "Descripción 2", "Descripción 3", "Descripción 4", "Descripción 5", "Descripción 6", "Descripción 7", "Descripción 8", "Descripción 9", "Descripción 10"};

    public App() {

        this.codigo = contador++;
        this.nombre = "app" + String.valueOf(codigo) + letra[rd.nextInt(26)];
        this.descripcion = descripciones[rd.nextInt(10)];
        DoubleStream doubles = rd.doubles(1, 100.0, 1024.0);
        this.tamanio = doubles.max().getAsDouble();
        IntStream ints = rd.ints(1, 0, 50000);
        this.numDescargas = ints.max().getAsInt();

    }

    public App(int codigo, int numDescargas, String nombre, String descripcion, double tamanio) {
        this.codigo = codigo;
        this.numDescargas = numDescargas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanio = tamanio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumDescargas() {
        return numDescargas;
    }

    public void setNumDescargas(int numDescargas) {
        this.numDescargas = numDescargas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return codigo + ";" + numDescargas + ";" + nombre + ";" + descripcion + ";" + tamanio;
    }

}
