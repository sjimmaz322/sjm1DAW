package relacionc;

public class Complejo {

    private double parteReal;
    private double parteImaginaria;
    private static int contador;

    public Complejo() {
        contador++;
    }

    public Complejo(double real, double imag) {
        this.parteReal = real;
        this.parteImaginaria = imag;
        contador++;
    }

    public double getImag() {
        return parteImaginaria;
    }

    public void setImag(double imag) {
        this.parteImaginaria = imag;
    }

    public double getReal() {
        return parteReal;
    }

    public void setReal(double real) {
        this.parteReal = real;
    }

    public Complejo sumar(Complejo sumatoria) {
        Complejo complejoAuxiliar = new Complejo();
        complejoAuxiliar.parteReal = parteReal + sumatoria.parteReal;
        complejoAuxiliar.parteImaginaria = parteImaginaria + sumatoria.parteImaginaria;
        return complejoAuxiliar;
    }

    public Complejo restar(Complejo resta) {
        Complejo complejoAuxiliar = new Complejo();
        complejoAuxiliar.parteReal = parteReal - resta.parteReal;
        complejoAuxiliar.parteImaginaria = parteImaginaria - resta.parteImaginaria;
        return complejoAuxiliar;
    }

    public Complejo multiplicar(Complejo multiplication) {
        Complejo complejoAuxiliar = new Complejo();
        complejoAuxiliar.parteReal = parteReal * multiplication.parteReal - parteImaginaria * multiplication.parteImaginaria;
        complejoAuxiliar.parteImaginaria = parteReal * multiplication.parteImaginaria + parteImaginaria * multiplication.parteReal;
        return complejoAuxiliar;
    }

    public Complejo dividir(Complejo divition) {
        Complejo complejoAuxiliar = new Complejo();
        complejoAuxiliar.parteReal = (parteReal * divition.parteReal + parteImaginaria * divition.parteImaginaria) / (divition.parteReal * divition.parteReal + divition.parteImaginaria * divition.parteImaginaria);
        complejoAuxiliar.parteImaginaria = (parteImaginaria * divition.parteReal - parteReal * divition.parteImaginaria) / (divition.parteReal * divition.parteReal + divition.parteImaginaria * divition.parteImaginaria);
        return complejoAuxiliar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Complejo other = (Complejo) obj;
        if (Double.doubleToLongBits(this.parteReal) != Double.doubleToLongBits(other.parteReal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.parteImaginaria) != Double.doubleToLongBits(other.parteImaginaria)) {
            return false;
        }
        return true;
    }

    public static int Contador() {
        return contador;
    }

    @Override
    public String toString() {
        return "(" + parteReal + ", " + parteImaginaria + ")";
    }

}
