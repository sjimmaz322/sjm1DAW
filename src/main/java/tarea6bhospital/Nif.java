package tarea6bhospital;

import java.lang.reflect.Array;
import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;

/*
 * @author samjimmaz
 */
public class Nif {

    private String numero;
    private char letra;
    private LocalDate caducidad;

    public Nif(String numero) {
        this.numero = numero;
        this.caducidad = LocalDate.now().plusYears(5);
        this.letra = calcularLetra(numero);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    private char calcularLetra(String numero){
        
        int num = Integer.parseInt(numero);
        num = num%23;
        
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return letras[num];
    }

    @Override
    public String toString() {
        return numero+letra+" caduca el "+caducidad;
    }

}
