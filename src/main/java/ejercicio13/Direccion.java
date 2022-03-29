package ejercicio13;

public class Direccion {

    String nombreCalle, nombreCiudad, codPostal, nombrePais;

    public Direccion() {
        this.nombreCalle = "";
        this.nombreCiudad = "";
        this.codPostal = "";
        this.nombrePais = "";
    }

    public Direccion(String nombreCalle, String nombreCiudad, String codPostal, String nombrePais) {
        this.nombreCalle = nombreCalle;
        this.nombreCiudad = nombreCiudad;
        this.codPostal = codPostal;
        this.nombrePais = nombrePais;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "nombreCalle=" + nombreCalle + ", nombreCiudad=" + nombreCiudad + ", codPostal=" + codPostal + ", nombrePais=" + nombrePais + '}';
    }

}
