package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        // Esta estructura (TRY-CATCH) es la encargada de gestionar el procesamiento de excepciones
        try{
            System.out.println("Intentando ejecutar el bloque");
            
            //Error forzado en tiempo de ejecucion
            int n = Integer.parseInt("N"); // Salta al catch
            
            System.out.println("Despues del error");
            
        
        }catch(Exception e){
            System.out.println("El error es: " + e);
        }finally{
            System.out.println("Ejecucion finalizada");
        }
    }
    
}
