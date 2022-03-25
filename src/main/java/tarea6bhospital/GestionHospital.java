package tarea6bhospital;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Random;

/*
 * @author samjimmaz
 */
public class GestionHospital {

    public static void main(String[] args) {
        Random rd = new Random();
//        String medicamento = "Tocinofedrina";

        ArrayList<Employee> plantilla = new ArrayList<>();
        ArrayList<Paciente> enfermos = new ArrayList<>();
        ArrayList<Medico> meds = new ArrayList<>();
        ArrayList<Administrativo> admins = new ArrayList<>();

        //Creamos el hospital
        Hospital hospital01 = new Hospital("Reina Sofía", "Av. Menendez Pidal, s/n, 14004 Córdoba");

        //Creamos al personal y a los pacientes
        Employee adm1 = new Administrativo(Grupo.C, "223-81-8142", 1200, "Temiro", "Elarchivo", new Nif("19745896"));
        Employee adm2 = new Administrativo(Grupo.D, "223-81-8178", 1800, "Yote", "Lordeno", new Nif("21459975"));
        Employee adm3 = new Administrativo(Grupo.E, "223-81-8177", 1900, "Dejake", "Tunosabes", new Nif("35669874"));

        Employee med1 = new Medico("cirugía", "412578966", 2500, "Yokito", "Toldaño", new Nif("45781256"));
        Employee med2 = new Medico("oncologia", "785412364", 1500, "Habersi", "Nopalmas", new Nif("7125469"));

        Paciente pac1 = new Paciente("00000001", "Helen", "Fermito", new Nif("45786412"));
        Paciente pac2 = new Paciente("00000002", "Sae", "Chopupa", new Nif("12457862"));
        Paciente pac3 = new Paciente("00000003", "Medu", "Eletodo", new Nif("74185236"));
        Paciente pac4 = new Paciente("00000004", "Mecho", "Daño", new Nif("45632872"));
        Paciente pac5 = new Paciente("00000005", "Toyda", "Ñado", new Nif("74596322"));

        //Contratamos a los trabajadores
        hospital01.contratarEmpleado(adm1);
        hospital01.contratarEmpleado(adm2);
        hospital01.contratarEmpleado(adm3);
        hospital01.contratarEmpleado(med1);
        hospital01.contratarEmpleado(med2);

        //Añadimos los trabajadores a la plantilla
        plantilla.add(adm1);
        plantilla.add(adm2);
        plantilla.add(adm3);
        plantilla.add(med1);
        plantilla.add(med2);

        //Y los médicos a su lista específica tras hacer el casting extrínseco
        Medico medi1 = (Medico) med1;
        Medico medi2 = (Medico) med2;
        meds.add(medi1);
        meds.add(medi2);
        
        //Convertimos los administrativos en administrativos reales para usar sus métodos específicos
        Administrativo admi1 = (Administrativo) adm1;
        Administrativo admi2 = (Administrativo) adm2;
        Administrativo admi3 = (Administrativo) adm3;
        
        //Metemos los administrativos en su lista pesonal
        admins.add(admi1);
        admins.add(admi2);
        admins.add(admi3);

        //Ingresamos a los pacientes
        hospital01.ingresarPaciente(pac1);
        hospital01.ingresarPaciente(pac2);
        hospital01.ingresarPaciente(pac3);
        hospital01.ingresarPaciente(pac4);
        hospital01.ingresarPaciente(pac5);

        //Añadimos los pacientes a una lista
        enfermos.add(pac1);
        enfermos.add(pac2);
        enfermos.add(pac3);
        enfermos.add(pac4);
        enfermos.add(pac5);

        for (int i = 0; i < plantilla.size(); i++) {
            System.out.println(plantilla.get(i).toString()+"\n");       
        }
        for (int i = 0; i < enfermos.size(); i++) {
            System.out.println(enfermos.get(i).toString()+"\n");       
        }


        //Un médico aleatorio trata a un paciente aleatorio.       
        Medico medi = (Medico) meds.get(rd.nextInt(2));
        medi.tratarPaciente(enfermos.get(rd.nextInt(5)));

        //Imprimimos cuanto paga cada médico de IRPF
        System.out.println(med1.getNombre() + " pagará de IRPF " + med1.calcularIRPF() + " € anualmente.");
        System.out.println(med2.getNombre() + " pagará de IRPF " + med2.calcularIRPF() + " € anualmente.");

        //Imprimimos cuanto paga de IRPF cada administrativo
        System.out.println(adm1.getNombre() + " pagará de IRPF " + adm1.calcularIRPF() + " € anualmente.");
        System.out.println(adm2.getNombre() + " pagará de IRPF " + adm2.calcularIRPF() + " € anualmente.");
        System.out.println(adm3.getNombre() + " pagará de IRPF " + adm3.calcularIRPF() + " € anualmente.");

        //Actualizamos el dni de dos personas
        //Primero un médico
//        System.out.println(med1.dni.getCaducidad());
        med1.renovarNif(LocalDate.of(2023, Month.MARCH, 15));
        System.out.println(med1.dni.getCaducidad());
        
        //Ahora un paciente
//        System.out.println(pac3.dni.getCaducidad());
        pac3.renovarNif(LocalDate.of(2022, Month.JUNE, 3));
//        System.out.println("La fecha de caducidad debería ser el 2032-06-03"); Extrañamente funciona
        System.out.println(pac3.dni.getCaducidad());
        
        //Registramos un documento como el administrador adm1
        admi1.registrarDocumento("Registro fiebre avial", "Puchino");
    }
}
