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
    }  
    
    
}
