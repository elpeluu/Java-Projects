package encapsulamiento;

public class Animal {
    private String nombre; 
    private int edad; 
    private String raza;
    
    
    ////////////////////////////////////////////////////////////////////////////
    // A partir de aqui encontramos lo que se conocen como METODOS ACCESORES
    // Son los principales metodos de acceso a la infromacion de clases en 
    // el encapsulamiento (GET y SET)
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    
    public int getEdad(){
        return edad; 
    }
    
    public void setEdad(int edad){
        this.edad = edad; 
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }
}
