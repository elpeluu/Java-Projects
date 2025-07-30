package ej1.personas;

public class Persona {
    private String nombre; 
    
    public Persona(){
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    @Override
    public String toString(){
        return "Hola, mi nombre es " + nombre;
    }
}
