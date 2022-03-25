package tarea6bhospital;

import java.util.ArrayList;
import java.util.Random;

/*
 * @author samjimmaz
 */
public class GestionHospital {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Employee> plantilla = new ArrayList<>();
        //Creamos el hospital
        Hospital hospital01 = new Hospital("Reina Sofía", "Av. Menendez Pidal, s/n, 14004 Córdoba");

        //Creamos al personal y a los pacientes
        Employee adm1 = new Administrativo(Grupo.C, "223-81-8142", 1200, "Salud", "Alfonso", new Nif("78455624"));
        Employee adm2 = new Administrativo(Grupo.D, "223-81-8178", 1800, "María", "González", new Nif("41255781"));
        Employee adm3 = new Administrativo(Grupo.E, "223-81-8177", 1900, "Antonio", "Ramíred", new Nif("35669874"));

        Employee med1 = new Medico("cirugia", "412578966", 2500, "Yokito", "Toldaño", new Nif("45001477"));
        Employee med2 = new Medico("oncologia", "785412364", 1500, "Eduarda", "Fernández", new Nif("44558877"));

        Paciente pac1 = new Paciente("00000001", "Helen", "Fermito", new Nif("45786412"));
        Paciente pac2 = new Paciente("00000002", "Sae", "Chopupa", new Nif("12457862"));
        Paciente pac3 = new Paciente("00000003", "Medu", "Eletodo", new Nif("74185236"));
        Paciente pac4 = new Paciente("00000004", "Sae", "Chopupa", new Nif("45632872"));
        Paciente pac5 = new Paciente("00000005", "Sae", "Chopupa", new Nif("74596322"));

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

        //Ingresamos a los pacientes
        hospital01.ingresarPaciente(pac1);
        hospital01.ingresarPaciente(pac2);
        hospital01.ingresarPaciente(pac3);
        hospital01.ingresarPaciente(pac4);
        hospital01.ingresarPaciente(pac5);

        for (Employee listaEmpleado : plantilla) {
            if (listaEmpleado instanceof Medico) {
                ((Medico) listaEmpleado).tratarPaciente(pac1, "Pancetamol");
                break;
            }

        }

    }
}
