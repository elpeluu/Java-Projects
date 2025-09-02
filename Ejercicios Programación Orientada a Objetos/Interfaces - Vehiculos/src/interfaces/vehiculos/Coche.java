package interfaces.vehiculos;

public class Coche implements IVehiculo{
    
    public int cant_gasolina = 0; 
            
    public Coche(int cantidad){
        this.cant_gasolina = cantidad; 
    }
    
    @Override
    public void conducir(){
        if(cant_gasolina > 0){
            System.out.println("El coche esta conduciendo (nivel = " + cant_gasolina + ")");
        }else{
            System.out.println("El coche NO esta conduciendo porque esta sin gasolina (nivel = " + cant_gasolina + ")");
        }
    }
    
    @Override
    public boolean repostar(int gasolina){
        cant_gasolina += gasolina;
        System.out.println("Repostaje exitoso (" + gasolina + "). Nivel actual de gasolina: " + cant_gasolina);
        return true;
    }
}
