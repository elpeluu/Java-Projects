package interfaces.vehiculos;

public class InterfacesVehiculos {

    public static void main(String[] args) {
        
        int cant_repostar = 20;
        Coche coche1 = new Coche(20);
        
        coche1.conducir();
        coche1.repostar(cant_repostar);
        coche1.conducir();
    } 
}
