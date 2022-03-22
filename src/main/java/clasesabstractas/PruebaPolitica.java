package clasesabstractas;

import java.util.ArrayList;

/*
 * @author samjimmaz
 */
public class PruebaPolitica {

    public static void main(String[] args) {
        
        ArrayList<Legislador> politica = new ArrayList();

        Legislador dip1 = new Diputado(1, "Wadiya", "Partido único obligatorio", "Haffaz", "Aladeen", "11111111X");
        
        Legislador sen1 = new Senador(200.0, "United Stated", "Patriots", "Steven", "Armstrong", "22222222Z");
        
        politica.add(dip1);
        politica.add(sen1);
        
        System.out.println("Información del diputado 1\n");
        System.out.println(dip1);
        System.out.println("Información del senador 1\n");
        System.out.println(sen1);
        System.out.println("---");
        String camaraDip1 = dip1.camaraTrabaja();
        String camaraSen1 = sen1.camaraTrabaja();
        System.out.println("Haffaz es un "+camaraDip1);
        System.out.println("Steven es un "+camaraSen1);
        
        //Hacemos castig para acceder a todos los métodos de las clases Diputado y Senador
        Diputado diput1 = (Diputado)dip1;
        Senador senad1 = (Senador)sen1;    
        
    }

}
