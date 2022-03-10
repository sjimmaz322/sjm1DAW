package recursividad;

public class FactorialRecursividad {

    public static void main(String[] args) {
        
        System.out.println(factorial(3));
        
    }
    public static int factorial(int num){
           	 
    	//Asegura un número positivo
        num = Math.abs(num);
   	 
    	if (num == 0 || num == 1){ // Caso base
        	return 1;
    	} else{
        	return num*factorial(num-1); // Ciclo activo
    	}
}

    
}
