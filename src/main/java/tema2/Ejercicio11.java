/*10.	Un corredor de atletismo necesita conocer cuales son sus franjas
de trabajo al 70%, 80%, 90% y 100%. Para ello necesitamos que dicho corredor
nos introduzca su edad y su frecuencia cardíaca en reposo (Frep)
. Mostraremos por pantalla una tabla con el siguiente aspecto tras calcular
dichas franjas haciendo uso de las fórmulas siguientes:
 */
package tema2;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        //Primero introducimos las variables
        
        Scanner sc = new Scanner (System.in);
        byte edad, fRep, frecuObjetivo;
        float fMax;
        short pulsObjetivo;
        
        
        // Seguiremos pidiendo los datos
        
        System.out.print("Buenas, introduce tu edad: ");
        edad = sc.nextByte();
        System.out.print("Indica tu frecuencia cardiaca en reposo: ");
        fRep = sc.nextByte();
        System.out.print("Introduce el porcentaje objetivo: ");
        frecuObjetivo = sc.nextByte();
        
        
         
        
        // Por ultimo haremos los calculos y los mostraremos
        
        fMax = (float) (208 -(0.7 * edad));
        pulsObjetivo = (short) ((short) (((fMax-fRep)*frecuObjetivo)/100)+fRep);
        
        System.out.println("Tus pulsaciones por minuto en " + frecuObjetivo + "% es igual a " + pulsObjetivo);
        
        
        
        
        
        
    }
    
}
