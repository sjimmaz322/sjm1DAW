package clasesabstractas;

import java.util.Objects;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/*
* @author samjimmaz
*/
public abstract class Cuenta {
    Random rd = new Random();
    
    protected String numeroCuenta;
    protected double saldo;
    Persona persona;

    public Cuenta(double saldo, Persona persona) {

        this.numeroCuenta = (RandomStringUtils.randomNumeric(20).toUpperCase());
        this.saldo = saldo;
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.numeroCuenta);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.persona);
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
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.numeroCuenta, other.numeroCuenta);
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double cuantia);
    

    @Override
    public String toString() {
        return "La cuenta de "+persona.toString()+" tiene un número de cuenta "+numeroCuenta+" y un saldo de "+saldo+"€.";
    }
    
    
}
