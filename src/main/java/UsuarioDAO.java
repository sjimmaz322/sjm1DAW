
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samjimmaz
 */
public class UsuarioDAO implements IUsuario{
private Connection con = null;

    public UsuarioDAO() {
        con = Conexion.getInstance();
    }

    @Override
    public List<UsuarioVO> getAll() throws SQLException {
        List<UsuarioVO> lista = new ArrayList<>();

        // Preparamos la consulta de datos mediante un objeto Statement
        // ya que no necesitamos parametrizar la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            ResultSet res = st.executeQuery("select * from usuarios");
            // Ahora construimos la lista, recorriendo el ResultSet y mapeando los datos
            while (res.next()) {
                UsuarioVO u = new UsuarioVO();
                // Recogemos los datos de la persona, guardamos en un objeto
                u.setEmail(res.getString("email"));
                u.setNombre(res.getString("nombre"));
                u.setContrasenia(res.getString("contrasenia"));
                u.setEdad(res.getInt("edad"));

                //Añadimos el objeto a la lista
                lista.add(u);
            }
        }

        return lista;
    }

    @Override
    public UsuarioVO findByPk(String pk) throws SQLException {

        ResultSet res = null;
        UsuarioVO user = new UsuarioVO();

        String sql = "select * from usuarios where email=?";

        try (PreparedStatement prest = con.prepareStatement(sql)) {
            // Preparamos la sentencia parametrizada
            prest.setString(1, pk);

            // Ejecutamos la sentencia y obtenemos las filas en el objeto ResultSet
            res = prest.executeQuery();

            // Nos posicionamos en el primer registro del Resultset. Sólo debe haber una fila
            // si existe esa pk
            if (res.next()) {
                // Recogemos los datos de la persona, guardamos en un objeto
                user.setEmail(res.getString("email"));
                user.setNombre(res.getString("nombre"));
                user.setContrasenia(res.getString("contrasenia"));
                user.setEdad(res.getInt("edad"));
                return user;
            }

            return null;
        }
    }

    @Override
    public int insertUsuario(UsuarioVO user) throws SQLException {

        int numFilas = 0;
        String sql = "insert into usuarios values (?,?,?,?)";

        if (findByPk(user.getEmail()) != null) {
            // Existe un registro con esa pk
            // No se hace la inserción
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, user.getEmail());
                prest.setString(2, user.getNombre());
                prest.setString(3, user.getContrasenia());
                prest.setInt(4,user.getEdad());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }

    }

    @Override
    public int insertUsuario(List<UsuarioVO> lista) throws SQLException {
        int numFilas = 0;

        for (UsuarioVO tmp : lista) {
            numFilas += insertUsuario(tmp);
        }

        return numFilas;
    }

    @Override
    public int deleteUsuario() throws SQLException {

        String sql = "delete from usuarios";

        int nfilas = 0;

        // Preparamos el borrado de datos  mediante un Statement
        // No hay parámetros en la sentencia SQL
        try (Statement st = con.createStatement()) {
            // Ejecución de la sentencia
            nfilas = st.executeUpdate(sql);
        }

        // El borrado se realizó con éxito, devolvemos filas afectadas
        return nfilas;

    }

    @Override
    public int deleteUsuario(UsuarioVO user) throws SQLException {
        int numFilas = 0;

        String sql = "delete from usuarios where email = ?";

        // Sentencia parametrizada
        try (PreparedStatement prest = con.prepareStatement(sql)) {

            // Establecemos los parámetros de la sentencia
            prest.setString(1, user.getEmail());
            // Ejecutamos la sentencia
            numFilas = prest.executeUpdate();
        }
        return numFilas;
    }

    @Override
    public int updateUsuario(String pk, UsuarioVO nuevosDatos) throws SQLException {

        int numFilas = 0;
        String sql = "update usuario set email = ?, nombre = ?, contrasenia = ?, edad = ? where email=?";

        if (findByPk(pk) == null) {
            // La persona a actualizar no existe
            return numFilas;
        } else {
            // Instanciamos el objeto PreparedStatement para inserción
            // de datos. Sentencia parametrizada
            try (PreparedStatement prest = con.prepareStatement(sql)) {

                // Establecemos los parámetros de la sentencia
                prest.setString(1, nuevosDatos.getEmail());
                prest.setString(2, nuevosDatos.getNombre());
                prest.setString(3, nuevosDatos.getContrasenia());
                prest.setInt(4, nuevosDatos.getEdad());

                numFilas = prest.executeUpdate();
            }
            return numFilas;
        }
    }

    public int cambiarNombres(String newName, String oldName) throws SQLException {

        int res = 0;
        // Dos ?, uno para newName y otro para oldName

        String sql = "{call cambiarNombres (?,?)}";

        // Preparamos la llamada al procedimiento almacenado
        try (CallableStatement call = con.prepareCall(sql)) {
            // Establecemos parámetros a pasar al procedimiento
            call.setString(1, newName);
            call.setString(2, oldName);
            // Ejecutamos el procedimiento
            res = call.executeUpdate();
            
        }
        return res;
    }


}
