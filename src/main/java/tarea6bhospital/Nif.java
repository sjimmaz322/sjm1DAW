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

    private char calcularLetra(String numero){
        int num = Integer.valueOf(numero);
        for (int i = 0; i < numero.length(); i++) {
            num += numero.indexOf(i);
        }
        num = num/23;

        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        return letras[num];
    }

}
