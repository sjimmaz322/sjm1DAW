package Calcetines;

public class PruebaCalcetines {

    public static void main(String[] args) {
        
        
        //Creamos tres calcetines para probar los métodos
        Calcetines calce1 = new Calcetines();
        Calcetines calce2 = new Calcetines(42, Colores.NEGRO);
        Calcetines calce3 = new Calcetines(42, Colores.NEGRO);

        
        String comparation = calce1.getColor().toString();//Método equals

        //Comparador terciario para recibir el mensaje de comparar
        String resultado = calce2.equals(calce1) ? "Son iguales" : "No son iguales"; 
        
        System.out.println(resultado);
        
        //Creamos nuevo cajón
        CajonCalcetines cajon1 = new CajonCalcetines();
        
        String[] desparejo = new String[cajon1.getTamanio()];
        //Rellenamos el cajón creado
        cajon1.rellenarCajon();
        //Recibimos por pantalla el contenido del cajón
        cajon1.imprimirCajon();
        
        //De esta linea para abajo ignorar directamente
        desparejo = cajon1.compararCalcetines();
        
        for (int i = 0; i < desparejo.length; i++) {
            System.out.println(desparejo[i]);
            
        }
        
        
    }
    
}
