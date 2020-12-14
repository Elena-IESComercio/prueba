/*
 */
package tema3;

import java.util.Scanner;

public class Ejercicio9 {
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
       
       if (total_1<0){
           System.out.println("No existen soluciones reales");
       }
       else{
           System.out.println("El primer resultado es: " + total_1);  
       }
       if (total_2<0){
           System.out.println("No existen soluciones reales");
       }
       else{
           System.out.println("El segundo resultado es: " + total_2);  
       }
        
           
     }
}
