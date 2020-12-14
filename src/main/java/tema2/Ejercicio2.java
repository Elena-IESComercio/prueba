/* Realizar un programa en JAVA que guarde en una variable vuestro nombre, 
   en otra vuestros dos apellidos, en otra vuestra edad, en otra
   vuestro numero de telefono y en otra si teneis o no bicicleta. 
   Posteriormente se mostrara esta información por pantalla haciendo uso de 
   los datos guardados en las variables
*/
package tema2;

/**
 *
 * @author Vespertino
 */
public class Ejercicio2 {
       /* Este es el primer ejercicio y trata sobre las variables y sus usos 
       en esta primera parte vamos a marcar cada tipo con su identificador
       y con su dato: Tipo (Boolean) Identificador (unBoolean) y dato (true)*/
    public static void main(String[] args) {
        boolean tienesBicicleta = false;
        byte edad = 24;
        int numeroTelefono = 638766002;
        float altura = 1.66F;
        String nombre = "Jorge", apellidos = "Ramos Carol";
        
        /* En esta segunda parte hacemos que el programa salga por pantalla
           un comentario que deseemos y la variable marcada en cada tipo */
        System.out.println("Mi nombre es " + nombre);
        System.out.println("¿Cual es tu nombre completo? " + nombre + " " + apellidos);
        System.out.println(nombre + " " + apellidos + " " + "¿Que edad tienes? " + edad);
        System.out.println("¿Tienes Bici? " + tienesBicicleta);
        System.out.println("Tu numero es " + numeroTelefono);
        
    }
}
