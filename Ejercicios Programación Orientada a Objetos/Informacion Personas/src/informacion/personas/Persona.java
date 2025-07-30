package informacion.personas;

public class Persona {
    private String nombre; 
    private int edad; 
    private String direccion; 
    
    // Constructor que inicializa los atributos de los objetos creados
    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre; 
        this.edad = edad; 
        this.direccion = direccion; 
    }
    
    public void mostrarInformacion(){
        System.out.println("Informacion de persona");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
        System.out.println("");
    }
    
    public void modificarDireccion(String direccionNueva){
        direccion = direccionNueva; 
        System.out.println("Direccion actualizada correctamente");
        System.out.println("La nueva direccion es: " + direccion);
        System.out.println("");
    }
}
