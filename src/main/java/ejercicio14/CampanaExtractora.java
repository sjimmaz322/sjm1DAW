/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/*
 * @author samjimmaz
 */
public class CampanaExtractora extends Electrodomestico {

    private double decibelios;

    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios < 50) {
            double dec = 51;
            decibelios = dec;
        }
        this.decibelios = decibelios;
    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        if (decibelios < 50) {
            this.decibelios = 51;
        }
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCampanaExtractora{" + "decibelios=" + decibelios + '}';
    }



}
