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
        System.out.println("");
        
        System.out.println("********************************");
        System.out.println("EJERCICIO 5: Funcion Calculadora");
        System.out.println("********************************");
        int num1 = 10, num2 = 4;
        calculadora(num1, num2); 
        System.out.println("");
        
        System.out.println("**************************************");
        System.out.println("EJERCICIO 6: Contar Espacios en Blanco");
        System.out.println("**************************************");
        String cadena4 = "No es oro todo lo que reluce";
        int nEspacios = contrarEspacios(cadena4);
        System.out.println("Tiene " + nEspacios + " espacios.");
        System.out.println("");
        
        System.out.println("****************************************");
        System.out.println("EJERCICIO 7:Sumar Digitos Texto Numerico");
        System.out.println("****************************************");
        String textoNumerico = "184"; 
        sumarDigitos(textoNumerico);
        System.out.println("");
        
        System.out.println("********************************************");
        System.out.println("EJERCICIO 8:Max y Min de un array (0 - 100)");
        System.out.println("********************************************");
        int[] numeros = {32, 45, 65, 24, 67, 92, 4, 34, 24, 25, 45, 84, 29};
        minMaxArray(numeros);
        System.out.println("");
        
        System.out.println("************************************");
        System.out.println("EJERCICIO 9:Escribir Texto Subrayado");
        System.out.println("************************************");
        String subrayado = "Scuderia Ferrari";
        subrayarTexto(subrayado);
        System.out.println("");
        
        System.out.println("******************************************");
        System.out.println("EJERCICIO 10:Sumar elementos de una matriz");
        System.out.println("******************************************");
        int[] enteros = {5, 2, 5, 3, 1};
        sumaElementosArray(enteros);
        System.out.println("");
        
        System.out.println("****************************");
        System.out.println("EJERCICIO 11:Invertir cadena");
        System.out.println("****************************");
        String aInvertir = "Diego Garda Porto";
        invertirCadena(aInvertir);
        System.out.println("");
        
        System.out.println("*******************************");
        System.out.println("EJERCICIO 12:Doble de un numero");
        System.out.println("*******************************");
        int doblar = 1244;
        doble(doblar);
        System.out.println("");
        
        System.out.println("*****************************");
        System.out.println("EJERCICIO 13:Texto polindromo");
        System.out.println("*****************************");
        String poli = "Radar";
        if(esPolindroma(poli)){
            System.out.println("Es polindromo");
        }else{
            System.out.println("No es polindromo");
        }
        System.out.println("");
        
        System.out.println("***********************************");
        System.out.println("EJERCICIO 14: potencia de un numero");
        System.out.println("***********************************");
        int num = 2; 
        int pot = 3; 
        potencia(num, pot);
        System.out.println("");
        
        System.out.println("******************************");
        System.out.println("EJERCICIO 15: Formato a titulo");
        System.out.println("******************************");
        String titulo = "Bienvenidos";
        formatoTitulo(titulo);
        System.out.println("");
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
    // *************************************
    // EJERCICIO 5:Funcion Calculadora
    // *************************************
    public static void calculadora(int n1, int n2){
    
        System.out.println("Operandos: " + n1 + ", " + n2);
        System.out.println("Suma");
        int suma = n1 + n2; 
        System.out.println(" " + n1 + " + " + n2 + " = " + suma);
        
        System.out.println("Resta");
        int resta = n1 - n2; 
        System.out.println(" " + n1 + " - " + n2 + " = " + resta);
        
        System.out.println("Multiplicacion");
        int mul = n1 * n2; 
        System.out.println(" " + n1 + " x " + n2 + " = " + mul);
        
        System.out.println("Division");
        float div = n1/n2; 
        System.out.println(" " + n1 + " / " + n2 + " = " + div);
        
        System.out.println("Modulo (Resto)");
        int mod = n1 % n2; 
        System.out.println(" " + n1 + " % " + n2 + " = " + mod);
    }
    
    // *************************************
    // EJERCICIO 6:Contar Espacios en Blanco
    // *************************************
    public static int contrarEspacios (String texto){
        
        System.out.println("El texto es: " + texto);
        
        char[] caracteres = texto.toCharArray();
        int contador = 0;
        
        for (int i = 0; i < caracteres.length; i++) {
            if(caracteres[i] == ' '){
                contador++;
            }
        }
        return contador;
    }
    // ***************************************************
    // EJERCICIO 7:Sumar los dígitos de una texto numerico
    // ***************************************************
    public static void sumarDigitos(String texto){
        System.out.println("La cadena numerica es: " + texto);
        
        int suma = 0; 
        
        for (int i = 0; i < texto.length(); i++) {
            suma += Character.getNumericValue(texto.charAt(i));
        }
        System.out.println("La suma de los digitos es: " + suma);
    }
    
    // ***************************************
    // EJERCICIO 8:Minimo y maximo de un array
    // ***************************************
    public static void minMaxArray(int[] numeros){
        int min = 101; 
        int max = 0; 
        
        System.out.println("El array de numeros entre 0 y 100 es: ");
        for (int i = 0; i < numeros.length; i++) {
            if(i == numeros.length - 1){
            System.out.println(numeros[i]);
            }else{
            System.out.print(numeros[i] + ", ");
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < min){
                min = numeros[i];
            }
            if(numeros[i] > max){
                max = numeros[i];
            }
        }
        System.out.println("El minimo es: " + min);
        System.out.println("El maximo es: " + max);
    }
    
    // *************************************
    // EJERCICIO 9: Escribir texto subrayado
    // *************************************
    public static void subrayarTexto(String texto){
        System.out.println("El texto a subrayar es: " + texto);
        System.out.println("\nTexto subrayado: ");
        
        System.out.println(texto);
        for (int i = 0; i < texto.length(); i++) {
            System.out.print("-");   
        }
    }
    
    // *****************************************
    // EJERCICIO 10: Sumar enteros de una matriz
    // *****************************************
    // Dada una matriz unidimensional de numeros, que se sumen todos esos valores
    public static void sumaElementosArray(int[] numeros){
        int suma = 0; 
        
        System.out.println("La matriz unidimensional es: ");
        for (int i = 0; i < numeros.length; i++) {
            if(i == numeros.length - 1){
                System.out.println(numeros[i]);
            }else{
                System.out.print(numeros[i] + ", ");
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
    
    // *****************************
    // EJERCICIO 11: Invertir cadena
    // *****************************
    public static void invertirCadena(String texto){
        
        System.out.println("La cadena es: " + texto);
        
        // Pasamos la cadena a un array de caracteres
        char[] caracteres = texto.toCharArray();
        
        // Creamos la nueva cadena invertida con el mismo tamaño que la original
        char[] caracteresInv = new char[caracteres.length];
        int in = 0;
        
        for (int i = texto.length()-1; i >= 0; i--) {
            caracteresInv[in] = caracteres[i];
            in++;
        }
        
        // Pasamos el array invertido a una cadena
        String cadenaInv = new String(caracteresInv);
        System.out.println("La cadena invertida es: " + cadenaInv);
    }
    
    // ********************************
    // EJERCICIO 12: Doble de un numero
    // ********************************
    public static void doble(int numero){
        int doble = 0; 
        
        doble = numero*2;
        System.out.println("El numero es: " + numero);
        System.out.println("El doble es: " + doble);
    }
    
    // *******************************
    // EJERCICIO 13: Cadena polindroma
    // *******************************
    // Comprueba que una cadena es polindroma (capicua pero en texto)
    public static boolean esPolindroma(String texto){
        
        // Pasamos todo a minusculas para que sean iguales
        String text = texto.toLowerCase();
        
        System.out.println("La palabra es: " + text);
        
        // Pasamos la cadena a array de 
        // Creamos 2 para comparar
        char[] car1 = text.toCharArray();
        char[] car2 = text.toCharArray();            
        int i2 = car2.length - 1;
        
        for (int i = 0; i < car1.length; i++) {
            if(car1[i] != car2[i2]){
                return false;
            }
            i2--;
        }
        return true;
    }
    
    // ***********************************
    // EJERCICIO 14: Potencia de un numero
    // ***********************************
    public static void potencia(int numero, int potencia){
        System.out.println("El numero es: " + numero);
        System.out.println("La potencia es: " + potencia);
        
        int resultado = numero;
        
        for (int i = 0; i < potencia - 1; i++) {
            resultado *= numero;
        }
        System.out.println(numero + " elevado a " + potencia + " es: " + resultado);
    }
    
    // ***********************************
    // EJERCICIO 14: Potencia de un numero
    // ***********************************
    public static void formatoTitulo(String texto){
    
        System.out.println("El texto es: " + texto);
        
        // Pasamos todo a mayusuclas
        String cadenaTitulo = texto.toUpperCase();
        char[] caracTitulo = cadenaTitulo.toCharArray();
        
        for (int i = 0; i < texto.length(); i++) {
            System.out.print("-");
        }
        // Añadimos salto de linea
        System.out.println("");
        
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(caracTitulo[i] + " ");
        }
        
        System.out.println("");
        for (int i = 0; i < texto.length(); i++) {
            System.out.print("-");
        }
    }
}
