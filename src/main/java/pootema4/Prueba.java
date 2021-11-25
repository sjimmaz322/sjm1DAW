package pootema4;

public class Prueba {

    public static void main(String[] args) {
        
        Cancion song1 = new Cancion();
        Cancion song2 = new Cancion("Este es el nombre", "Este la canta");
        
        song1.setTitulo("Canción de Insomnio");
        song1.setAutor("Neonato");
        
        System.out.println("Sobre song1: " + song1.getAutor() + " es el autor y " + song1.getTitulo()+ " es su obra");
        System.out.println(song2.toString());
        
        
     //   nombre, apellidos, NIF, sueldoBase, pagoHoraExtra, horasExtrasRealizadas, IRPF, estadoCivil, numHijos
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Samuel Alejandro");
        empleado1.setApellidos("Jiménez Mazas");
        empleado1.setNIF("31014322-H");
        empleado1.setSueldoBase("1800");
        empleado1.setPagoHoraExtra("17");
        empleado1.setHorasExtrasRealizadas("20");
        empleado1.setIRPF("17");
        empleado1.setNumHijos("0");
        
    }

}
