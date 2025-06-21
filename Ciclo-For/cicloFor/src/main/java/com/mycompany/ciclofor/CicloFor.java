package com.mycompany.ciclofor;

public class CicloFor {
    
    public CicloFor(){}

    public static void main(String[] args) {
    
        // LLAMADAS A LOS EJERCICIOS
        
        // EJERCICIO 1: ejemplificativo del bucle For
        cicloForEjemplo();
        // EJERCICIO 2: Metodo que muestra las letra completas del abecedario
        mostrarAbecedario();
        // EJERCICIO 3: Tabla de multiplicar de un numero
        tablaMultiplicar();
        // EJERCICIO 4: Producto de un numero
        productoNumero();
        // EJERCICIO 5: Detectar si un numero es primo
        comprobarPrimo();
        // EJERCICIO 6: Lista descendente de impares entre dos numeros
        imparesDescendentes();
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 1: ejemplificativo del bucle For
    public static void cicloForEjemplo(){
    
        System.out.println("*********");
        System.out.println("BUCLE FOR");
        System.out.println("*********");
        int numeroEjecuciones = 0;
        
        for(int i = 0; i<10; i++){
            i += 2;
            numeroEjecuciones++;
            System.out.println("Ejecucion " + numeroEjecuciones + " del bucle FOR, i vale " + i);
        }         
        System.out.println("\n\n");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 2: Metodo que muestra las letra completas del abecedario
    public static void mostrarAbecedario(){
        char letra = 'A';
        
        System.out.println("****************************");
        System.out.println("MOSTRAR ABECEDARIO COMPLETO");
        System.out.println("****************************");
        
        for(int i = 0; i<26; i++){
            if(i == 0){
                System.out.print(" " + letra);
            }else{
            System.out.print(", " + letra);
            }
            letra++;
        }
        System.out.println("\n\n");
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 3: Tabla de multiplicar de un numero
    public static void tablaMultiplicar(){
        int num = 6;
        
        System.out.println("*********************************");
        System.out.println("TABLA DE MULTIPLICAR DE UN NUMERO");
        System.out.println("*********************************");
        
        for(int i = 1; i <= 10; i++){
            System.out.println(" " + num + " * " + i + " = " + num * i);
        }
        System.out.println("\n\n");
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 4: Producto de un numero
    // Se hace la multiplicación mediante sumas sucesivas (en lugar de mediante un multiplicacion clasica)
    public static void productoNumero(){
        int n1 = 4; 
        int n2 = 3; 
        
        
        System.out.println("*********************");
        System.out.println("PRODUCTO DE UN NUMERO");
        System.out.println("*********************");
        
        //Mediante bucle for
        int resultadoFor = 0;
        
        for (int i = 0; i < n2; i++){
            resultadoFor += n1;
        }
        System.out.println(" RESULTADO MEDIANTE BUCLE FOR");
        System.out.println(" " + n1 + " * " + n2 + " = " + resultadoFor);
        
        //Mediante bucle while
        int resultadoWhile = 0;
        int i = 0;
        while(i<n2){
            resultadoWhile += n1;
            i++;
        }
        System.out.println(" RESULTADO MEDIANTE BUCLE WHILE");
        System.out.println(" " + n1 + " * " + n2 + " = " + resultadoWhile);

        //Mediante bucle DO-WHILE
        int resultadoDoWhile = 0;
        int n = 0;
        do{
            resultadoDoWhile += n1;
            n++;
        }while(n<n2);
        
        System.out.println(" RESULTADO MEDIANTE BUCLE DO-WHILE");
        System.out.println(" " + n1 + " * " + n2 + " = " + resultadoDoWhile);
        
 
        System.out.println("\n\n");
    } 
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 5: Detectar si un numero es primo
    public static void comprobarPrimo(){
        int n = 24;
        
        System.out.println("*****************************");
        System.out.println("CALCULADORA DE NUMEROS PRIMOS");
        System.out.println("*****************************");
        
        // Mediante bucle FOR
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                if(i != 1 && i != n){
                System.out.println("El numero "  + n + " NO es primo. (FOR)");
                break;
                }
            }
            if(i == n){
                System.out.println("El numero " +  n + " SI es primo. (FOR)");
            }
        } 
        
        // Mediante bucle WHILE
        int indiceWhile = 1;
        while(indiceWhile <= n ){
            if(n % indiceWhile == 0){
                if(indiceWhile != 1 && indiceWhile != n){
                System.out.println("El numero "  + n + " NO es primo. (WHILE)");
                break;
                }
            }
            if(indiceWhile == n){
                System.out.println("El numero " +  n + " SI es primo. (WHILE)");
            }
            indiceWhile++;
        }
        
        // Mediante bucle DO-WHILE
        int indiceDoWhile = 1;
        do{
           if(n % indiceDoWhile == 0){
                if(indiceDoWhile != 1 && indiceDoWhile != n){
                System.out.println("El numero "  + n + " NO es primo. (DO-WHILE)");
                System.out.println("\n\n");
                break;
                }
            }
            if(indiceDoWhile == n){
                System.out.println("El numero " +  n + " SI es primo. (DO-WHILE)");
                System.out.println("\n\n");
            } 
            indiceDoWhile++;
        }while(indiceDoWhile <= n);
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 6: Lista descendente de impares entre dos numeros
    public static void imparesDescendentes(){
        int alto = 23;
        int bajo = 2; 
        
        System.out.println("****************************");
        System.out.println("LISTA DESCENDENTE DE IMPARES");
        System.out.println("****************************");
        
        System.out.println("Numero impares entre " + alto + " y " + bajo + ": ");
        
        for(int i = alto-1; i > bajo; i--){
            if(i % 2 != 0){
                if(i == bajo+1){
                    System.out.print(i);
                }else{
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println("\n\n");
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // EJERCICIO 7:
}
