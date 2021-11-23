package daw.poo;

public class TestCajaCarton {

    public static void main(String[] args) {

        CajaCarton cajaGrande = new CajaCarton(250, 400, 500, 200);

        CajaCarton cajaChica = new CajaCarton(25, 30, 15, 17);

        System.out.println("Las características de la caja grande son:");
        System.out.println(cajaGrande.getAncho() + " mm " + cajaGrande.getAlto() + " mm "
                + cajaGrande.getlargo() + " mm " + cajaGrande.getPeso() + " gr");

        System.out.println(" ");

        System.out.println("Las características de la caja chica son:");
        System.out.println(cajaChica.getAncho() + " mm " + cajaChica.getAlto()
                + " mm " + cajaChica.getlargo() + " mm " + cajaChica.getPeso() + " gr");
    }

}
