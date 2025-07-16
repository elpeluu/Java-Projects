package clasesobjetos;

public class ClasesObjetos {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Persona peluu = new Persona("Peluu", 1.75, 23);
        Persona lau = new Persona("Laura", 1.69, 23);
        
        // Utilizacion del metodo imprimirDatos
        peluu.imprimirDatos();
        System.out.println("");
        lau.imprimirDatos();
        System.out.println("");
        
        System.out.println("*****************************************");
        System.out.println("EJERCICIO 1: Metodos saludar y despedirse");
        System.out.println("*****************************************");
        saludar();
        despedirse();
        System.out.println("");
        
        System.out.println("********************************************************");
        System.out.println("EJERCICIO 2: Metodos saludar y despedirse con parametros");
        System.out.println("********************************************************");
        String nombreM = "Manu";
        saludarParam(nombreM);
        despedirseParam(nombreM);
        System.out.println("");
    }  
    
    // ******************************************
    // EJERCICIO 1: Metodos saludar y despedirse
    // ******************************************
    public static void saludar(){
        System.out.println("Pelu te saluda.");
    }
    public static void despedirse(){
        System.out.println("Pelu se despide.");
    }
    
    // ********************************************************
    // EJERCICIO 2: Metodos saludar y despedirse con parametros
    // ********************************************************
    public static void saludarParam(String name){
        System.out.println("Hola " + name + ", Peluu te saluda");
    }
    public static void despedirseParam(String name){
        System.out.println("Adios " + name + ", Peluu te despide");
    }
    
}
