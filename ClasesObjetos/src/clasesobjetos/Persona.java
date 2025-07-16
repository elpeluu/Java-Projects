package clasesobjetos;

public class Persona {
    // Atributos
    String nombre;
    int edad; 
    double estatura; 
    
    // Constructor de la clase Persona
    public Persona (String name, double size, int age){
        this.nombre = name; 
        this.estatura = size; 
        this.edad = age;
    }
    
    public void imprimirDatos (){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La estatura es: " + estatura);
        System.out.println("La edad es: " + edad);
    }
}
