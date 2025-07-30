package personaestudianteprofesor;

public class PersonaEstudianteProfesor {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.saludar();
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setEdad(23);
        estudiante1.saludar();
        estudiante1.verEdad();
        estudiante1.estudiar();
        
        Profesor profe1 = new Profesor();
        profe1.setEdad(54);
        profe1.saludar();
        profe1.Explicar();
    }
    
}
