package personaestudianteprofesor;

public class Persona {
    int edad; 
    
    public void saludar(){
        System.out.println("Buenos dias!");
    }
    
    public void setEdad(int edad){
        this.edad = edad; 
    }
    
    public void verEdad(){
        System.out.println("Mi edad es: " + edad + " anos.");
    }
}
