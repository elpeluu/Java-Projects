package com.mycompany.vectores;

public class Vectores {

    public static void main(String[] args) {
        // Ejercicios de vectores
        System.out.println("EJERCICIOS DE VECTORES Y MATRICES");
        
        //Ejercicio 1: Devolver un vector inversamente
        vectorInverso();
        //Ejercicio 2: Buscar en un vector
        buscarValor();
        //Ejercicio 3: Buscar pares
        buscarPares();
        //Ejercicio 4: Media de numeros positivos y negativos
        mediaPositivosNegativos();
        //Ejercicio 5: Matriz Bidimensional
        matrizBidimensional();
    }
    ////////////////////////////////////////////////////////////////////////////
    //Ejercicio 1: Devolver un vector inversamente
    public static void vectorInverso(){
        int v1[] = {1, 2, 3, 4, 5};
        
        System.out.println("***************************");
        System.out.println("EJERCICIO 1: VECTOR INVERSO");
        System.out.println("***************************");
        
        for(int i = v1.length-1; i >= 0; i--){
            System.out.print(v1[i] + " ");
        }
        
        System.out.println("\n\n");
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Ejercicio 2: Buscar en un vector
    public static void buscarValor(){
        int vector[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = 69;
        
        System.out.println("*************************");
        System.out.println("EJERCICIO 2: BUSCAR VALOR");
        System.out.println("*************************");
        
        for(int i = 0; i < vector.length; i ++){
                System.out.print(vector[i] + " ,");
        }
        System.out.println("");
        
        for(int i = 0; i < vector.length; i ++){
            if(valor == vector[i]){
                System.out.println(" El valor " + valor + " SI que se encuentra en la matriz");
                break;
            }else if(i == vector.length-1){
                System.out.println(" El valor " + valor + " NO que se encuentra en la matriz");
            }
        }
        System.out.println("\n\n");
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Ejercicio 3: Buscar valores pares dentro de un vector
    public static void buscarPares(){
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("*************************");
        System.out.println("EJERCICIO 3: BUSCAR PARES");
        System.out.println("*************************");
        
        System.out.println("El vector en cuestion es: ");
        for (int i = 0; i < v1.length; i++){
            if(i == v1.length - 1){
                System.out.print(v1[i] + " ");
            }else{
                System.out.print(v1[i] + ", ");
            }
        }
        System.out.println("\n");
        System.out.println("Busqueda de numeros pares:");        
        for(int i = 0; i < v1.length; i++){
            if(v1[i] % 2 == 0){
                if(v1[i] == v1.length - 1){
                    System.out.print(v1[i] + " ");
                }else{
                    System.out.print(v1[i] + ", ");
                }
            }
        }
        System.out.println("\n\n");
    }
    ////////////////////////////////////////////////////////////////////////////
    //Ejercicio 4: Media de numeros positivos y negativos
    public static void mediaPositivosNegativos(){
        int[] v1 = {3, -5, 2, 4, -3, 1, 8, -10, 6, 4};
        float mediaPos = 0;
        float mediaNeg = 0;
        int contadorPos = 0;
        int contadorNeg = 0;
        
        System.out.println("*******************************************");
        System.out.println("EJERCICIO 4: MEDIA DE POSITIVOS Y NEGATIVOS");
        System.out.println("*******************************************");
        
        System.out.println("El vector es: ");
        for (int i = 0; i < v1.length; i++){
            if(i == v1.length - 1){
                System.out.print(v1[i] + " ");
            }else{
                System.out.print(v1[i] + ", ");
            }
        }
        System.out.println("\n");
        
        //Calculamos la media de los números positivos y negativos
        for(int i = 0; i < v1.length; i++){
            if(v1[i] > 0){
                mediaPos += v1[i];
                contadorPos += 1;
            }else{
                mediaNeg += v1[i];
                contadorNeg += 1;
            }
        }
        
        mediaPos /= contadorPos;
        mediaNeg /= contadorNeg;
        
        System.out.println("La media de los numero positivos es " + mediaPos);
        System.out.println("La media de los numeros negativos es " + mediaNeg);
        System.out.println(" ");
        System.out.println("El vector contiene " + contadorPos + " numero positivos.");
        System.out.println("El vector contiene " + contadorNeg + " numeros negativos.");
        
        System.out.println("\n\n");   
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Ejercicio 5: Mtriz Bidimensional
    public static void matrizBidimensional(){
        //Matriz bidimensional de 5x5
        int[][] w = new int[5][5];
        int contador = 1;
        
        System.out.println("*********************************");
        System.out.println("EJERCICIO 5: MATRIZ BIDIMENSIONAL");
        System.out.println("*********************************");
        
        for(int i = 0; i < w.length; i++){
            for(int j = 0; j < w.length; j++){
                w[i][j] = contador;
                contador++;
            }
        }
        
        for(int i = 0; i < w.length; i++){
            for(int j = 0; j < w.length; j++){
                System.out.print(w[i][j] + ", ");
            }
            System.out.println(" ");
        }
        
        System.out.println("\n\n");
    }
}
