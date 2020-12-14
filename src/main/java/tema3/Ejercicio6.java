/*/*Realiza un programa en JAVA que pida dos Nº enteros por pantalla y 
muestre el mas grande ( hay que utilizar el operador ternario)
....modifica el ejercicio que muestre los numeros de forma creciente
*/
package tema3;

import java.util.Scanner;

public class Ejercicio6 {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte dato1, dato2;
        String f;
        System.out.println("Escribe dos Numeros enteros: ");
        System.out.print("1º: ");
        dato1 = sc.nextByte();
        System.out.print("2º: ");
        dato2 = sc.nextByte();
        
        f=dato1>dato2? " "+ dato2 +","+dato1 : " "+dato1+","+dato2;

       System.out.println("Nº de forma creciente: "+f);
       
        
    }
    
}

