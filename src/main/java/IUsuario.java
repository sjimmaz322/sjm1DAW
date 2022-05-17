
import java.sql.SQLException;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author samjimmaz
 */
public interface IUsuario {
 // Método para obtener todos los registros de la tabla
    List<UsuarioVO> getAll() throws SQLException;
    
    // Méodo para obtener un registro a partir de la PK
    UsuarioVO findByPk(String pk) throws SQLException;
    
    // Método para insertar un registro
    int insertUsuario (UsuarioVO persona) throws SQLException;
    
    // Método para insertar varios registros
    int insertUsuario (List<UsuarioVO> lista) throws SQLException;
    
    // Método para borrar una persona
    int deleteUsuario (UsuarioVO p) throws SQLException;
    
    // Método para borrar toda la tabla
    int deleteUsuario() throws SQLException;
    
    // Método para modificar una persona. Se modifica a la persona que tenga esa 'pk'
    // con los nuevos datos que traiga la persona 'nuevosDatos'
    int updateUsuario (String pk, UsuarioVO nuevosDatos) throws SQLException;
    
}
