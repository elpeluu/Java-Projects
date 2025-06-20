package com.mycompany.ciclofor;

public class CicloFor {
    
    public CicloFor(){}

    public static void main(String[] args) {
     
        cicloFor();
        mostrarAbecedario();
    }
    
    public static void cicloFor(){
    
        System.out.println("*********");
        System.out.println("CICLO FOR");
        System.out.println("*********");
        int numeroEjecuciones = 0;
        
        for(int i = 0; i<10; i++){
            i += 2;
            numeroEjecuciones++;
            System.out.println("Ejecucion " + numeroEjecuciones + " del bucle FOR, i vale " + i);
        }         
        System.out.println("\n\n\n");
    }
    
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
    }
}
