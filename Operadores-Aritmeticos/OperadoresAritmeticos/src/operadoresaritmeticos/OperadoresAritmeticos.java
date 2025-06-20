package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        int num1 = 6; 
        int num2 = 3; 
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2; 
        int division = num1 / num2; 
        int modulo = num1 % num2; 
        
        // resultado suma
        System.out.println(num1 + " + " + num2 + " = " + suma);
        // resultado resta
        System.out.println(num1 + " - " + num2 + " = " + resta);
        // resultado multiplicacion
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        // resultado division
        System.out.println(num1 + " / " + num2 + " = " + division);
        // resultado modulo
        System.out.println(num1 + " % " + num2 + " = " + modulo);
    }
    
}
