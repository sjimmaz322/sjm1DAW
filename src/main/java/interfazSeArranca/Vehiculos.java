/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfazSeArranca;

/**
 *
 * @author samjimmaz
 */
public abstract class Vehiculos implements SeArranca, SePara, Comparable<Vehiculos>{
    
    private String matricula;

    public Vehiculos(String matrícula) {
        this.matricula = matrícula;
    }

    public Vehiculos() {
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public abstract void repostar(String tipoCombustible);

    @Override
    public String toString() {
        return "Vehiculos{" + "matrícula=" + matricula + '}';
    }
    
    //Al implementar interface esta clase debería dar código a arrancar(), pero al ser absracta puede dejarlo que lo
    //hagan las clases hijas.
    
    public boolean parar(){
        System.out.println("El vehículo ha parado...");
        return false;
    }
    public int compareTo(Vehiculos v){
        return this.matricula.compareTo(v.getMatricula());
    }
    
}
