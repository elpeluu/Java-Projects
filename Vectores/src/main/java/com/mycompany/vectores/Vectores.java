package com.mycompany.vectores;

public class Vectores {

    public static void main(String[] args) {
        // Ejercicios de vectores
        System.out.println("EJERCICIOS DE VECTORES Y MATRICES");
        
        //Ejercicio 1: Devolver un vector inversamente
        vectorInverso();
    }
    
    public static void vectorInverso(){
        int v1[] = {1, 2, 3, 4, 5};
        
        System.out.println("***************************");
        System.out.println("EJERCICIO 1: VECTOR INVERSO");
        System.out.println("***************************");
        
        for(int i = v1.length-1; i >= 0; i--){
            System.out.print(v1[i] + " ");
        }
    }
}
