package ejercicio14;

import java.util.ArrayList;

/**
 *
 * @author samjimmaz
 */
public class TestElectrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos la lista
        ArrayList<Electrodomestico> aparatos = new ArrayList<>();
        
        //Creamos los electrodomésticos
        Electrodomestico e1 = new Frigorifico(10, 20, "F01");
        Electrodomestico e2 = new Frigorifico(20, 21, "F02");
        Electrodomestico e3 = new Microondas(30, 22, "m03");
        Electrodomestico e4 = new Microondas(40, 23, "M04");
        Electrodomestico e5 = new CampanaExtractora(50, 24, "C05");
        Electrodomestico e6 = new CampanaExtractora(45, 25, "C06");
        
        //Metemos los electrodomésticos en la lista
        aparatos.add(e1);
        aparatos.add(e2);
        aparatos.add(e3);
        aparatos.add(e4);
        aparatos.add(e5);
        aparatos.add(e6);
        
        //Usamos el forEach con casting explícitos para acceder a los métodos específicos de cada clase
        for (Electrodomestico obj : aparatos) {
            if (obj instanceof Frigorifico){
                ((Frigorifico) obj).silencio();
                System.out.println(obj.toString());
            }
            if (obj instanceof Microondas){
                ((Microondas) obj).silencio();
                obj.toString();
                System.out.println(obj.toString());
            }
            if (obj instanceof CampanaExtractora){
            //    ((CampanaExtractora) obj).silencio(); No se puede por no tener implementada la interfaz Silencioso
            obj.toString();
            System.out.println(obj.toString());
            }
        }
        
    }
    
}
