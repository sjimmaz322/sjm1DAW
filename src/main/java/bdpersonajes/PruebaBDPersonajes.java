package bdpersonajes;

public class PruebaBDPersonajes {

    public static void main(String[] args) {
        
        ListaPersonajes lista1 = new ListaPersonajes();
        
        //Qué añadir en cada campo para mejorar el entendimiento
        //lista1.insertarPersonaje(new Personaje(nombre, raza, arquetipo, alineacion, nivel, edad, puntos de vida, puntos de magia, puntos de experiencia, trasfondo));
        
        //Listado de personajes
        lista1.insertarPersonaje(new Personaje("Ethirben Faelibrim", "Semi-elfo", "Druida", "True Neutral", 12, 222, 4, 3, 0, "Druida semi-elfo que busca encontrar qué hace a un monstruoa ser un monstruo."));
        lista1.insertarPersonaje(new Personaje("Thor Lyserod", "Humano", "Bárbaro", "Neutral Good", 8, 25, 20, 0, 0, "Joven aventurero que desconoce el poder de su apellido y solo busca vivir aventuras."));
        lista1.insertarPersonaje(new Personaje("Alaya Meris", "Semi-elfo", "Pícaro", "Chaotic Neutral", 12, 149, 3, 4, 0, "Semi-elfa criada en un circo, sus rápidas manos y agilida son sus grandes aliadas."));
        lista1.insertarPersonaje(new Personaje("Vicorius Codex", "Humano", "Artificiero", "Chaotic Good",70, 45, 8, 24, 0, "Humano habituado a tratar con máquinas antiguas, nadie sabe de lo que es capaz."));
        lista1.insertarPersonaje(new Personaje("Yierik Dandel", "Goblin", "Bardo", "Neutral Evil", 26, 27, 4, 9, 0, "Bardo bastardo que solo busca su propio beneficio, aún así es provechoso tenerlo de aliado."));
        lista1.insertarPersonaje(new Personaje("Solaire de Astora", "Humano", "Paladín", "Lawful Good", 32, 40, 30, 23, 0, "Paladín del Dios del Sol, su alta fe lo hace un guerrero formidable."));
        lista1.insertarPersonaje(new Personaje("Alan Greyward", "Enano", "Monje", "Lawful Neutral", 14, 94, 48, 2, 0, "Enano que usa el poder de su interior para ser un arma andante (aunque sigue siendo enano)."));
        lista1.insertarPersonaje(new Personaje("X-24/J", "Warforged", "Guerrero", "Lawful Evil", 7, 2, 12, 5, 0, "Máquina creada con un solo propósito, destruir todo lo que se interponga en su camino."));
        lista1.insertarPersonaje(new Personaje("Norem Mortis", "Dracónido", "Hechicero", "Chaotic Evil", 50, 31, 12, 88, 0, "Poderoso hechicero medio dragón que solo quiere sembrar el caos y la destrucción por diversión"));
        
        //lista1.imprimirVentana(); //Imprime una ventana por cada personaje, solo usar en caso de que se tenga tiempo.
       
        
        //Lista de personajes en un rango de edad determinado
        System.out.println("Personajes entre 18 y 50 años");
        lista1.buscarNivelesRango(18, 50).forEach(System.out::println);
        
        //Lista de personajes de raza humana
        System.out.println("Personajes Humanos");
        lista1.buscarRazas("Humano").forEach(System.out::println);
                  
        //Eliminamos el único personaje Goblin
        lista1.eliminarPersonaje(new Personaje("", "Goblin", "Bardo", "Neutral Evil", 0, 27, 0, 0, 0," "));
        
        //Lista de todos los personajes Goblins, sale vacía
        System.out.println("Personajes Goblins");
        lista1.buscarRazas("Goblin").forEach(System.out::println);
        
        
        lista1.insertarPersonaje(new Personaje("Galah Drot", "Goblin", "Explorador", "True Neutral", 1, 15, 6, 5, 0,
                "Pequeño goblin amante de la naturaleza, hará lo que tenga que hacer para preservarla,\npero no dañará a drede"));
        
//        //Lista de todos los personajes Goblins, solo aparece Galah Drot
        System.out.println("Personajes Goblins");
        lista1.buscarRazas("Goblin").forEach(System.out::println);
    }

}
