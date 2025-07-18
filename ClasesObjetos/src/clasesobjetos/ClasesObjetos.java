package clasesobjetos;

public class ClasesObjetos {

    public static void main(String[] args) {
        
        // Creacion de objetos
        Persona peluu = new Persona("Peluu", 1.75, 23);
        Persona lau = new Persona("Laura", 1.69, 23);
        
        // Utilizacion del metodo imprimirDatos
        peluu.imprimirDatos();
        System.out.println("");
        lau.imprimirDatos();
        System.out.println("");
        
        System.out.println("*****************************************");
        System.out.println("EJERCICIO 1: Metodos saludar y despedirse");
        System.out.println("*****************************************");
        saludar();
        despedirse();
        System.out.println("");
        
        System.out.println("********************************************************");
        System.out.println("EJERCICIO 2: Metodos saludar y despedirse con parametros");
        System.out.println("********************************************************");
        String nombreM = "Manu";
        saludarParam(nombreM);
        despedirseParam(nombreM);
        System.out.println("");
        
        System.out.println("****************************************");
        System.out.println("EJERCICIO 3: Comprobar cadena alfabetica");
        System.out.println("****************************************");
        String cadena1 = "caballo, ganador.";
        System.out.println(cadena1);
        if(esAlfabetico(cadena1)){
            System.out.println("La cadena SI es alfabetica.");
        }else{
            System.out.println("La cadena NO es alfabetica");
        }
        String cadena2 = "Caballo Ganador 6";
        System.out.println(cadena2);
        if(esAlfabetico(cadena2)){
            System.out.println("La cadena SI es alfabetica.");
        }else{
            System.out.println("La cadena NO es alfabetica");
        }
        System.out.println("");
        
        System.out.println("********************************");
        System.out.println("EJERCICIO 4: Reemplazar caracter");
        System.out.println("********************************");
        String cadena3 = "Diego Gorda";
        int posicion1 = 7;
        char caracter1 = 'a';
        System.out.println(cadena3);
        String cadenaNueva = reemplazarCaracter(posicion1, cadena3, caracter1);
        System.out.println("La cadena corregida es:");
        System.out.println(cadenaNueva);
    }  
    
    // ******************************************
    // EJERCICIO 1: Metodos saludar y despedirse
    // ******************************************
    public static void saludar(){
        System.out.println("Pelu te saluda.");
    }
    public static void despedirse(){
        System.out.println("Pelu se despide.");
    }
    
    // ********************************************************
    // EJERCICIO 2: Metodos saludar y despedirse con parametros
    // ********************************************************
    public static void saludarParam(String name){
        System.out.println("Hola " + name + ", Peluu te saluda");
    }
    public static void despedirseParam(String name){
        System.out.println("Adios " + name + ", Peluu te despide");
    }
    
    // ****************************************
    // EJERCICIO 3: Comprobar cadena alfabetica
    // ****************************************
    public static boolean esAlfabetico(String cadena){
        
        //Convertimos la cadena a minusculas para analizar
        String cadenaMinusculas = cadena.toLowerCase();
        
        for (int i = 0; i < cadenaMinusculas.length(); i++) {
            // Obtenemos el caracter de la cadena a analizar
            char caracter = cadenaMinusculas.charAt(i);
 
            if((caracter < 'a' || caracter > 'z') && caracter != ' ' && caracter != ',' && caracter != '.'){
                return false;
            }
        }
        return true;
    }
    
    // *******************************
    // EJERCICIO 4:Reemplazar caracter
    // *******************************
    public static String reemplazarCaracter(int posicion, String cadena, char car){
        // Comprobamos que la posicion indicada este dentro de los limites de la cadena
        if(posicion > cadena.length() || posicion < 0){
            System.out.println("La posicion no se corresponde con una de la cadena");
        }
        
        // Realizamos el cambio de caracter en la cadena 
        char[] caracteres = cadena.toCharArray();
        caracteres[posicion] = car;
        return new String(caracteres);
        
    }
}
