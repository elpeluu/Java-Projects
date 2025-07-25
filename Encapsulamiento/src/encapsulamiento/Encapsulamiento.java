package encapsulamiento;

/*
 El encapsulamiento consiste en almacenar la información en una determinada
 clase de forma privada, siendo posible su uso desde otras partes del proyecto
 mediante los métodos get y set.

 Esto tambien permite y mejora la modularidad del proyecto.
*/

public class Encapsulamiento {
    
    // Principal metodo del proyecto
    public static void main(String[] args) {
        // Creamos el objeto
        Animal perro = new Animal();
        // Aignamos sus variables
        perro.setNombre("Dana");
        perro.setEdad(8);
        perro.setRaza("Pastor aleman");
        
        // Imprimimos los valores de las variables
        System.out.println("El perro se llama " + perro.getNombre());
        System.out.println("El perro tiene " + perro.getEdad() + " anos");
        System.out.println("El perro es un " + perro.getRaza());
        System.out.println("");
        ////////////////////////////////////////////////////////////////////////
        Operaciones ope = new Operaciones();
        int num1 = 2, num2 = 6;
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + ope.sumar(num1,num2));
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + ope.restar(num1,num2));
    }
 
}
