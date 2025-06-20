package com.mycompany.estructuraifelse;

public class EstructuraIfElse {

    public static void main(String[] args) {
        double nota = 9;
        
        if(nota < 5){
            System.out.println("Insuficiente");
        }else if(nota == 5){
            System.out.println("Suficiente");
        }else if(nota >= 6 && nota <7){
            System.out.println("Bien");
        }else if (nota >= 7 && nota <9){
            System.out.println("Notable");
        }else
            System.out.println("Sobresaliente");
    }
}
