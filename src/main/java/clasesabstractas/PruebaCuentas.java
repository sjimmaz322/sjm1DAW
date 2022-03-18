package clasesabstractas;

/*
 * @author samjimmaz
 */
public class PruebaCuentas {

    public static void main(String[] args) {

//      Cuenta c1 = new Cuenta(204.65, new Persona("Samuel", "Jiménez", "31014322H"));
//        
//      System.out.println(c1.toString());

//      CuentaCorriente cuco1 = new CuentaCorriente(saldoMin, saldo, persona);

        CuentaCorriente cuco1 = new CuentaCorriente(250, 500, new Persona("Samuel", "Jiménez", "31014322H"));
        
        System.out.println(cuco1.toString());
        
        cuco1.actualizarSaldo();
        System.out.println("Tras actualizar");
        System.out.println(cuco1.toString());
        System.out.println("Retiramos cantidad correcta");
        cuco1.retirar(200);
        System.out.println(cuco1.toString());
        System.out.println("Retiramos cantidad incorrecta");
        cuco1.retirar(400);
        System.out.println(cuco1.toString());

    }

}
