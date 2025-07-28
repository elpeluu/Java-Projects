package herenciapolimorfismo;

public class Empleado extends Persona{
    private int n_empleado; 
    private String departamento; 
    private String puesto; 

    public Empleado(){}
    
    public Empleado(int n_empleado, String departamento, String puesto, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);  
        this.n_empleado = n_empleado;
        this.departamento = departamento;
        this.puesto = puesto;
    }

    public int getN_empleado() {
        return n_empleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setN_empleado(int n_empleado) {
        this.n_empleado = n_empleado;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
