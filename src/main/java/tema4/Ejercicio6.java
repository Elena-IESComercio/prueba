/*Diseñar un programa que muestre el producto de los 10 primeros números impares.*/
package tema4;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int valor=1, resultado = 1, max;
        System.out.print("Indique cuantos numeros impares deseas multiplicar: ");
        max = sc.nextShort();
        //bucles
        while (valor<(2*max)){ 
            resultado = resultado*valor;
            valor = valor+2;  
        }
        System.out.println("El producto de los "+max+" numeros es: "+resultado);
    } 
}
