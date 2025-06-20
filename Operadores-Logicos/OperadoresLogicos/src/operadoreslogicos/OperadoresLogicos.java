package operadoreslogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean valor1 = true;
        boolean valor2 = true;
        boolean valor3 = false;
        boolean valor4 = false;
        
        // Operadores logicos
        System.out.println("true AND false = " + (valor1 && valor3));
        System.out.println("true AND true = " + (valor1 && valor2));
        System.out.println("true OR false = " + (valor1 || valor3));
        System.out.println("false OR false = " + (valor3 || valor4));
        System.out.println("NOT true = " + (!valor1));
        
    }
}
