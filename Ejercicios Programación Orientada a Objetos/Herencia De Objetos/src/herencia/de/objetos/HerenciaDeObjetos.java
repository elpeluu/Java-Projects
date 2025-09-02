package herencia.de.objetos;

public class HerenciaDeObjetos {

    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        
        personas[0] = new Persona("Pelu");
        personas[1] = new Profesor("Manu");
        personas[2] = new Estudiante("Guille");
        
        ((Profesor) personas[1]).explicar(personas[1].getNombre());
        ((Estudiante) personas[2]).estudiar("Guille");
                        
    }
}
