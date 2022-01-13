package ejerciciosclase;

public class Fechas {
    
    private int dia,mes,anyo;

    public Fechas() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 2022;
    }

    public Fechas(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        
    } 

    public boolean comprobarFecha(int dia, int mes, int anyo){
        boolean validez = true;
        return validez;
    }
        
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    
}
