package javaapplication13;

public class Persona {
    private String nombre; 
    
    public Persona(String nombre){
        this.nombre = nombre; 
    }
    
    public void setNombre(String name){
        this.nombre = name; 
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        return "El nombre es: " + nombre; 
    }
}
