package herencia.de.objetos;

public class Profesor extends Persona{
    public String nombre; 
    
    public Profesor(String nombre){
        super(nombre);
    }
    
    public void explicar(String nombre){
        System.out.println("Hola, soy " + nombre + " y estoy explicando la leccion.");
    }
}
