package herenciapolimorfismo;

public class HerenciaPolimorfismo {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        
        empleado1.setNombre("Manuel");
        empleado1.setEdad(30);
        empleado1.setSexo('M');
        
        empleado1.setN_empleado(1234);
        empleado1.setPuesto("Ingeniero");
        empleado1.setDepartamento("Sistemas");
        
        System.out.println("Nombre del empleado: " + empleado1.getNombre());
        System.out.println("Puesto del empleado: " + empleado1.getPuesto());
    }
    
}
