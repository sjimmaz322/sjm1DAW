package pootema4;

public class Prueba {

    public static void main(String[] args) {
        
        Cancion song1 = new Cancion();
        Cancion song2 = new Cancion("Este es el nombre", "Este la canta");

        song1.setTitulo("Canción de Insomnio");
        song1.setAutor("Neonato");

        System.out.println("Sobre song1: " + song1.getAutor() + " es el autor y " + song1.getTitulo() + " es su obra");
        System.out.println(" ");
        System.out.println(song2.toString());
        System.out.println(" ");

        //   nombre, apellidos, NIF, sueldoBase, pagoHoraExtra, horasExtrasRealizadas, IRPF, estadoCivil, numHijos
        Empleado empleado1 = new Empleado();

        empleado1.setNombre("Samuel Alejandro");
        empleado1.setApellidos("Jiménez Mazas");
        empleado1.setNIF("31014322-H");
        empleado1.setSueldoBase(1800);
        empleado1.setPagoHoraExtra(17);
        empleado1.setHorasExtrasRealizadas(20);
        empleado1.setIRPF(17);
        empleado1.setEstadoCivil(false);
        empleado1.setNumHijos(0);
        
        System.out.println(empleado1.getEstadoCivil());
        
        Empleado empleado2 = new Empleado("Humano", "Humanez", "12345678-Z", 500, 17, 0, 15, false, 2);
       
        System.out.println("Los datos del empleado 1 son: Nombre - " + empleado1.getNombre() + " Apellidos - " + empleado1.getApellidos()
                + " NIF - " + empleado1.getNIF() + "\n Sueldo base - " + empleado1.getSueldoBase() + " Pago por hora extra - "
                + empleado1.getPagoHoraExtra() + " Horas extras realizadas - " + empleado1.getHorasExtrasRealizadas() + "\n Paga un IRPF de "
                + empleado1.getIRPF() + " ¿El estado civil del empleado es casado? - " + empleado1.getEstadoCivil() + " y su número de hijos es de " + empleado1.getNumHijos());

        System.out.println(" ");
        System.out.println(empleado2.toString());
        System.out.println(" ");
        
     
        
        
        
    }

}
