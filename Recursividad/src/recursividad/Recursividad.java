package recursividad;

public class Recursividad {

    
    public static void main(String[] args) {
    
        // EJERCICIO 1: Calcular Poktencia de forma recursiva 
        int base = 2; 
        int expo = 3; 
        System.out.println("La base es: " + base);
        System.out.println("El exponente es: " + expo);
        System.out.println("La potencia es: " + potencia(base,expo));
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
}
