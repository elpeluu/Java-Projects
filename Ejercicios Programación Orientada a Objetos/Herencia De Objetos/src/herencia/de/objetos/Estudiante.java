package herencia.de.objetos;

public class Estudiante extends Persona{
    public String nombre;
    
    public Estudiante(String nombre){
        super(nombre); 
    }
    
    public void estudiar(String nombre){
        System.out.println("Hola, soy " + nombre + " y estoy estudiando.");
    }
}
