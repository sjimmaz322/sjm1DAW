
package paquetec;

import sets.Ejercito;
import sets.Soldats;


public class PruebaRegistroMilitar {

    public static void main(String[] args) {
        
       RegistroMilitar listado = new RegistroMilitar(); 
        
      Ejercito armada1 = new Ejercito();
      Soldats s1 = new Soldats("1", "Juan", "Perez", "Mora", 18);
      Soldats s2 = new Soldats("2", "Juana", "Perez", "Mora", 19);
      Soldats s3 = new Soldats("3", "Gabriel", "Perez", "Mora", 12);
      armada1.aniadirSoldado(s1);
      armada1.aniadirSoldado(s2);
      armada1.aniadirSoldado(s3);
      
      Ejercito armada2 = new Ejercito();
      Soldats s4 = new Soldats("1", "Luis", "García", "Hernández", 21);
      Soldats s5 = new Soldats("2", "Marta", "García", "Hernández", 22);
      Soldats s6 = new Soldats("3", "Lucía", "García", "Hernández", 23);
      armada2.aniadirSoldado(s1);
      armada2.aniadirSoldado(s2);
      armada2.aniadirSoldado(s3);
      
      listado.aniadeClaveEjercito("001", armada1);
      listado.aniadeClaveEjercito("002", armada2);
      
      listado.getListado();
    }
    
}
