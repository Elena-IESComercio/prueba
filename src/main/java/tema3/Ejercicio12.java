/*Realiza un programa en Java que el usuario introdizca la hora en formato 24H
y nosotros le mostraremos la hora 1s mas tarde
 */
package tema3;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        //Introducimos las variables
        Scanner sc = new Scanner (System.in);
        byte hora, minuto, segundo;
        
        //Pedimos la hora al usuario
        System.out.println("Buenas, introduce la hora minutos y segundos separados por un espacio");
        hora = Byte.parseByte(sc.next());
        minuto = Byte.parseByte(sc.next());
        segundo = Byte.parseByte(sc.next());
        
        //Si introduce una hora no valida mostraremos un error y se acaba el programa
        if (hora>=24 || minuto>=60 || segundo>=60 || hora<0 || minuto<0 || segundo<0){
            System.out.println("Hora incorrecta, por listo se acaba programa");
        }
        else{
            if (segundo+1==60){
                segundo = -1;
                minuto = (byte) (minuto+1);
                if (minuto==60){
                    minuto = 0;
                    hora = (byte) (hora+1);
                    if (hora==24)
                        hora = 0;
                }
            }
            System.out.println(hora+"H "+minuto+"m "+(segundo+1)+"s");
        }  
    }
}
