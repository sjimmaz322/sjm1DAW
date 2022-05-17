
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samjimmaz
 */
public class UsuarioVO {
    private String nombre;
    private String contrasenia;
    private String email;
    private int edad;

    public UsuarioVO(String nombre, String contrasenia, String email, int edad) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.email = email;
        this.edad = edad;
    }

    public UsuarioVO(){
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "UsuarioVO{" + "nombre=" + nombre + ", contrasenia=" + contrasenia + ", email=" + email + ", edad=" + edad + '}';
    }
    
    


}
