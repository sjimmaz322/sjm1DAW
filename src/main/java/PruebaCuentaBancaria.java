
import org.apache.commons.lang3.RandomStringUtils;


public class PruebaCuentaBancaria {

    
    public static void main(String[] args) {
        
        System.out.println(RandomStringUtils.randomNumeric(15).toUpperCase());
        CuentaBancaria c1 = new CuentaBancaria();
        CuentaBancaria c2 = new CuentaBancaria("31014322-H", "Samuel Jiménez", 1245.54, 0.2);
        
        System.out.println(c1);
        System.out.println(" ");
        System.out.println(c2);
        System.out.println(" ");
        c2.retirarEfectivo(200);
        System.out.println(c2);
        System.out.println(" ");
        c2.ingresarDinero(55);
        System.out.println(c2);
        System.out.println(" ");    
        c2.retirarEfectivo(5000);
        System.out.println(c2);
        System.out.println(" ");
        c2.ingresarIntereses();
        System.out.println(c2);
        System.out.println(" ");
        c2.setInteresAnual(4);
        System.out.println(c2);
        System.out.println(" ");
        c2.ingresarIntereses();
        System.out.println(c2);
    }
    
}
