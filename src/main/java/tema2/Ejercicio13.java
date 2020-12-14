/*Desarrolle un programa que calcule el desglose de una cantidad en billetes
y monedas en euros tal que se minimice la cantidad de monedas y billetes.
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        //Añadimos las variables necesarias
        Scanner sc = new Scanner (System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        short billete500 = 500;
        short billete200 = 200;
        byte billete100 = 100;
        byte billete50 = 50;
        byte billete20 = 20;
        byte billete10 =10;
        byte billete5 = 5;
        byte moneda2 = 2;
        byte moneda1 = 1;
        float moneda050 = 0.50F;
        float moneda020 = 0.20f;
        float moneda010 = 0.10f;
        float moneda005 = 0.05f;
        float moneda002 = 0.02f;
        float moneda001 = 0.01f;
        float valor;
        byte b1, b2, b3, b4, b5, b6, b7, m1, m2, m3, m4, m5, m6, m7, m8;
        
        
        //Pediremos el numero que deseemos
        
        System.out.print("Indique el valor que deseas desgrosar: ");
        valor = sc.nextFloat();
                
        // Realizaremos el calculo necesario
        
        b1 = (byte) (valor / billete500);
        valor = (valor % billete500);
        b2 = (byte) (valor / billete200);
        valor = (valor % billete200);
        b3 = (byte) (valor / billete100);
        valor = (valor % billete100);
        b4 = (byte) (valor / billete50);
        valor = (valor % billete50);
        b5 = (byte) (valor / billete20);
        valor = (valor % billete20);
        b6 = (byte) (valor / billete10);
        valor = (valor % billete10);
        b7 = (byte) (valor / billete5);
        valor = (valor % billete5);
        m1 = (byte) (valor / moneda2);
        valor = (valor % moneda2);
        m2 = (byte) (valor / moneda1);
        valor = (valor % moneda1);
        m3 = (byte) (valor / moneda050);
        valor = (valor % moneda050);
        m4 = (byte) (valor / moneda020);
        valor = (valor % moneda020);
        m5 = (byte) (valor / moneda010);
        valor = (valor % moneda010);
        m6 = (byte) (valor / moneda005);
        valor = (valor % moneda005);
        m7 = (byte) (valor / moneda002);
        valor = (valor % moneda002);
        m8 = (byte) (valor / moneda001);
        valor = (valor % moneda001);
        
        //Mostramos por pantalla los resultados
        
        System.out.println("Cantidad de billete de 500 es: " +b1);
        System.out.println("Cantidad de billete de 200 es: " +b2);
        System.out.println("Cantidad de billete de 100 es: " +b3);
        System.out.println("Cantidad de billete de 50 es: " +b4);
        System.out.println("Cantidad de billete de 20 es: " +b5);
        System.out.println("Cantidad de billete de 10 es: " +b6);
        System.out.println("Cantidad de billete de 5 es: " +b7);
        System.out.println("Cantidad de moneda de 2 es: " +m1);
        System.out.println("Cantidad de moneda de 1 es: " +m2);
        System.out.println("Cantidad de moneda de 0.50 es: " +m3);
        System.out.println("Cantidad de moneda de 0.20 es: " +m4);
        System.out.println("Cantidad de moneda de 0.10 es: " +m5);
        System.out.println("Cantidad de moneda de 0.05 es: " +m6);
        System.out.println("Cantidad de moneda de 0.02 es: " +m7);
        System.out.println("Cantidad de moneda de 0.01 es: " +m8);
        
        
                
        
        
        
        
        
        
        
    }
    
}
