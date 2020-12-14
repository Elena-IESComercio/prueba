/*
El tipo short permite almacenar valores comprendidos
entre -32768 y 32768. Se piderealizar un programa que compruebe
que el rango de valoresde un tipo se comporta de
forma cíclica, es decir, el valor siguiente al máximo
es el valor mínimo y viceversa.
 */
package tema2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        short valor = (short)32767;
        short valor1 = (short) ((short)1 + valor);
        short valor2 = (short) ((short)valor1 - 1);
        
        
        System.out.println("Si pulsas enter se sumara 1 a " + valor);
        s.nextLine();
        System.out.println("Al sumar 1 a 35767 da la vuelta al marcador " + valor1);
        System.out.println("Si pulsas enter realizara la operación restando");
        s.nextLine();
        System.out.println("Al restar 1 a -35768 da la vuelta al marcador " + valor2);
        
    }        
        
          
        
        
}
    

