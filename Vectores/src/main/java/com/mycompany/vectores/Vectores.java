package com.mycompany.vectores;

public class Vectores {

    public static void main(String[] args) {
        // Ejercicios de vectores
        System.out.println("EJERCICIOS DE VECTORES Y MATRICES");
        
        //Ejercicio 1: Devolver un vector inversamente
        vectorInverso();
        //Ejercicio 2: Buscar en un vector
        buscarValor();
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
    }
}
