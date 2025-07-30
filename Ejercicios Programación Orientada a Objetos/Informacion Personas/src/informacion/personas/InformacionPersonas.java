package informacion.personas;

public class InformacionPersonas {

    public static void main(String[] args) {
        Persona per1 = new Persona("Pelu", 23, "Calle A");
        Persona per2 = new Persona("Bea", 26, "Calle B"); 
        
        per1.mostrarInformacion();
        per2.mostrarInformacion();
        
        per1.modificarDireccion("Calle Nueva");
        per1.mostrarInformacion();
    }
    
}
