
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mapacherben
 */
public class PruebaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UsuarioDAO daoUser = new UsuarioDAO();
        List<UsuarioVO> listaUsers = new ArrayList<>();

        listaUsers.add(new UsuarioVO("Samuel", "Contrasenia", "sjimmaz.dev@gmail.com", 28));
        listaUsers.add(new UsuarioVO("Mamuel", "Avocado", "manuel.dev@gmail.com", 30));
        listaUsers.add(new UsuarioVO("Daniel", "danisito", "daniel.dev@gmail.com", 22));
        listaUsers.add(new UsuarioVO("Gabriel", "esheGabih", "gabriel.dev@gmail.com", 35));
        listaUsers.add(new UsuarioVO("Javier", "meine145", "javier.dev@gmail.com", 20));

        try {
            System.out.println("Nº Usuarios insertados " + daoUser.insertUsuario(listaUsers));
            System.out.println("-----------------------------------------");
            System.out.println("Comprobamos en una nueva lista que se recogen los datos desde la tabla.");
            List<UsuarioVO> nuevaLista = daoUser.getAll();

            System.out.println("-------- Lista con datos recogidos desde la B.D -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Usuario con primary key sjimmaz.dev@gmail.com: ");
            System.out.println(daoUser.findByPk("sjimmaz.dev@gmail.com"));

            System.out.println("Se va a borrar la persona con pk daniel.dev@gmail.com");
            System.out.println("Usuario borrado "
                    + daoUser.deleteUsuario(new UsuarioVO("Daniel", "danisito", "daniel.dev@gmail.com", 22)));

            System.out.println("-----------------------------------------");
            nuevaLista = daoUser.getAll();

            System.out.println("-------- Lista con datos recogidos desde la B.D despues de borrar un usuario -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Modificación de la persona con pk 5");
            System.out.println("Nº Personas modificadas "
                    + daoUser.updateUsuario("javier.dev@gmail.com", new UsuarioVO("Javier", "meine145", "javier.dev@gmail.com", 20)));
            System.out.println("-----------------------------------------");
            nuevaLista = daoUser.getAll();

            System.out.println("-------- Lista con datos recogidos desde la B.D despues de modificar un usuario -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");
            System.out.println("Ejecución del procedimiento almacenado");
            System.out.println("Se cambia Manuel por Tanamok");
            System.out.println("Nombres cambiados " + daoUser.cambiarNombres("Tanamok", "Manuel"));
            System.out.println("-----------------------------------------");
            nuevaLista = daoUser.getAll();

            System.out.println("-------- Lista con datos recogidos desde la B.D despues de ejecutar proced. -------------");
            nuevaLista.forEach(System.out::println);
            System.out.println("-----------------------------------------");

        } catch (SQLException sqle) {
            System.out.println("No se ha podido realizar la operación:");
            System.out.println(sqle.getMessage());
        }
        System.out.println();
        listaUsers.forEach(System.out::println);
    }

}
