package ej1.personas;

import java.util.Scanner;

public class Ej1Personas {

    public static void main(String[] args) {
        int total = 3;
        Scanner input = new Scanner(System.in);
        Persona[] personas = new Persona[total];
        
        for (int i = 0; i < total; i++) {
            personas[i]= new Persona();
            System.out.println("Introduce el nombre de la persona");
            personas[i].setNombre(input.nextLine());
        }
        System.out.println("");
        input.close();
        
        for (int i = 0; i < total; i++) {
            System.out.println(personas[i].toString());
        }
    }
    
}
