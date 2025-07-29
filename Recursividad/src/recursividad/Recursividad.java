package recursividad;

public class Recursividad {

    
    public static void main(String[] args) {
    
        System.out.println("************************************************"); 
        System.out.println("EJERCICIO 1: Potencia de forma recursiva.");
        System.out.println("************************************************"); 
        int base = 2; 
        int expo = 3; 
        System.out.println("La base es: " + base);
        System.out.println("El exponente es: " + expo);
        System.out.println("La potencia es: " + potencia(base,expo));
        System.out.println("");
        
        System.out.println("************************************************"); 
        System.out.println("EJERCICIO 2: Multiplicar de forma recursiva");
        System.out.println("************************************************");
        int num1 = 6, num2 = 4; 
        System.out.println(num1 + " x " + num2 + " = " + multiplicar(num1, num2));
        System.out.println("");
        
        System.out.println("************************************************"); 
        System.out.println("EJERCICIO 3: Factorial de un numero recursivamente");
        System.out.println("************************************************");
        int num_factorial = 4; 
        System.out.println("El factorial de " + num_factorial + " es: " + factorial(4));
        System.out.println("");
    }
    
    ////////////////////////////////////////////////////////////////////////////
    /// EJERCICIO 1: Potencia de forma Recursiva
    ////////////////////////////////////////////////////////////////////////////
    public static int potencia(int base, int exponente){
        
        if(exponente == 0){
            return 1; 
        }else{
            return base * potencia(base, exponente -1);
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    /// EJERCICIO 2: Multiplicar de forma Recursiva
    ////////////////////////////////////////////////////////////////////////////
    public static int multiplicar(int numero1, int numero2){
    
        if (numero2 == 0){
            return 0; 
        }else{
            return numero1 + multiplicar(numero1, numero2 - 1);
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    /// EJERCICIO 3: Factorial de un número recursivamente
    ////////////////////////////////////////////////////////////////////////////
    public static int factorial(int num){
        if(num == 1){
            return 1; 
        }else{
            return num * factorial(num - 1); 
        }
    }
    
    
}
