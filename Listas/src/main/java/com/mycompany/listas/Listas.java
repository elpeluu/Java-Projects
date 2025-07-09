package com.mycompany.listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        
        System.out.println("********************************************");
        System.out.println("EJERCICIO 1: PEQUENAS PRUEBAS CON ARRAY LIST");
        System.out.println("********************************************");
        
        //Creacion de un arrayList
        List<String> animales = new ArrayList<>();
        
        //Agregar elementos al array
        animales.add("Leon");
        animales.add("Tigre");
        animales.add("Gato");
        animales.add("Perro");
        
        System.out.println("Array animales: " + animales);
        
        //Eliminacion de un elemento
        animales.remove("Tigre");
        
        System.out.println("Array animales sin Tigre: " + animales);
        
        //Volver a agregar Tigre en el array pero ahora en la primera posicion
        animales.add(0, "Tigre");
        
        System.out.println("Animales con Tigre al principio: " + animales);
        System.out.println("\n");
        
        System.out.println("**************************************");
        System.out.println("EJERCICIO 2: LENGUAJES DE PROGRAMACION");
        System.out.println("**************************************");
        
        List<String> lenguajesProgramacion = new ArrayList<>();
        lenguajesProgramacion.add("C++");
        lenguajesProgramacion.add("Pyton");
        lenguajesProgramacion.add("Java");
        
        System.out.println("Lenguajes programacion: " + lenguajesProgramacion);
        
        //Eliminar un elemento concreto del array (elemento 3, indice 2)
        lenguajesProgramacion.remove(2);
        System.out.println("Nueva lista lenguajes: " + lenguajesProgramacion);
    }
}
