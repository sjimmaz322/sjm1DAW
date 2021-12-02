import org.apache.commons.lang3.RandomStringUtils;

public class CuentaBancaria {
    
private String numCuenta, NIF, nomCliente;
private double saldoActual, interesAnual;

    public CuentaBancaria() {
        this.numCuenta = (RandomStringUtils.randomNumeric(20).toUpperCase());
        this.NIF = "";
        this.nomCliente = "";
        this.saldoActual = 0;
        this.interesAnual = 0.1;
        if (this.interesAnual<0.1){
            this.interesAnual = 0.1;
        }
        if (this.interesAnual>0.3){
            this.interesAnual = 0.3;    
        }
    }

    public CuentaBancaria(String NIF, String nomCliente, double saldoActual, double interesAnual) {
        this.numCuenta = (RandomStringUtils.randomNumeric(20).toUpperCase());
        this.NIF = NIF;
        this.nomCliente = nomCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
        if (this.interesAnual<0.1){
            this.interesAnual = 0.1;
        }
        if (this.interesAnual>0.3){
            this.interesAnual = 0.3;    
        }
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        if (this.interesAnual<0.1){
            this.interesAnual = 0.1;
        }
        if (this.interesAnual>0.3){
            this.interesAnual = 0.3;    
        }
        this.interesAnual = interesAnual;
    }
    
}
