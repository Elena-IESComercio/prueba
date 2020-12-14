/* Crea un programa que pida los coeficientes a, b y c y calcula las dos
soluciones de la ecuación de segundo grado.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
       //Añadimos las variables
       Scanner sc = new Scanner (System.in);
       float a, b, c, total_1, total_2;
       
       //Pediremos las variables
       
        System.out.println("Vamos a relizar los calculos de un polinomio");
        System.out.println("Por favor, añada los datos deseados");
        System.out.print("Coeficiente a: ");
        a = sc.nextFloat();
        System.out.print("Coeficiente b: ");
        b = sc.nextFloat();
        System.out.print("Coeficiente c: ");
        c = sc.nextFloat();
        
       //Realizaremos los calculos
       
       total_1 = (float) (-b + Math.sqrt(Math.pow(b,2)- 4*a*c))/(2 * a);
       total_2 = (float) (-b - Math.sqrt(Math.pow(b,2)- 4*a*c))/(2 * a);
       
       //Mostraremos por pantalla los resultados
       
        System.out.println("El primer resultado es: " + total_1);
        System.out.println("El segundo resultado es: " + total_2);
        
                 
       
       
    }
    
}
