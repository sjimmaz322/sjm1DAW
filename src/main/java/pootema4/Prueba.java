package pootema4;

public class Prueba {

    public static void main(String[] args) {
        
        Cancion song1 = new Cancion();
        Cancion song2 = new Cancion("Este es el nombre", "Este la canta");
        
        song1.setTitulo("Canción de Insomnio");
        song1.setAutor("Neonato");
        
        System.out.println("Sobre song1: " + song1.getAutor() + " es el autor y " + song1.getTitulo()+ " es su obra");
        System.out.println(song2.toString());
    }

}
