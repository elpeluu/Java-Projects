package javaapplication13;

import java.util.Scanner;

public class Constructores {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int total = 3; 
        Persona[] personas = new Persona[total];
        
        for (int i = 0; i < total; i++) {
            System.out.println("Introduce el nombre de la persona: ");
            personas[i] = new Persona(input.nextLine()); 
        }
        input.close();
        
        for (int i = 0; i < 3; i++) {
            System.out.println(personas[i].toString());
        }
    }
    
}
