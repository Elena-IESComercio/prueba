/*Modifica el ejercicio 2 para que los números aparezcan separados por una coma menos el
último que aparecerá un punto al final.
Por ejemplo: Si n=5 -&gt; mostraremos por pantalla 1,2,3,4,5.*/
package tema4;

import java.util.Scanner;

public class Ejercicio4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte numero=1, valor1, valor2;
        
        //Pedimos al usuario un Nº del 1 al 99
        System.out.print("Buenas indique un Nº del 1 al 99: ");
        valor1 = sc.nextByte();
        
        //Realizamos los bucles
        while (numero<valor1){
            System.out.print(+numero+",");
            numero++;            
        }
        System.out.println(valor1 + ".");
        System.out.print("Buenas indique otro Nº del 1 al 99: ");
        valor2= sc.nextByte();
        numero=0;
        do{            
            System.out.print(numero+",");
            numero++;
        }
        while (numero<valor2);
            System.out.println(valor2 + ".");
    }
    
}
   
