/*Realiza un programa que pida un numero al usuario entre 1 y 7 ( en caso de error mostramos un mensaje)
que muestre por pantalla el dia de la semana correspontiende.
 */
package tema3;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner (System.in);
        byte dia, dia2;
        //Pedimos dia
        System.out.println("Buenas escribe un Nº entre 1 y 7");
        dia = sc.nextByte();
        
        //Comprobamos que dia es
        switch(dia){
            case 1:
                System.out.println("Es LUNES");
                break;
            case 2:
                System.out.println("Es MARTES");
                break;
            case 3:
                System.out.println("Es MIERCOLES");
                break;
            case 4:
                System.out.println("Es JUEVES");
                break;
            case 5:
                System.out.println("ES VIERNES");
                break;
            case 6:
                System.out.println("Es SABADO");
                break;
            case 7:
                System.out.println("Es DOMINGO");
                break;
            default:
                System.out.println("Nº invalido");
        }
        System.out.println("Buenas escribe un Nº entre 1 y 7");
        dia2 = sc.nextByte();
        //Ahora lo haremos con el if
        if (dia2>7 || dia2<1){
            System.out.println("Nº Invalido");
        }
        else if (dia2==1){
            System.out.println("Es LUNES");        
        }
        else if (dia2==2){
            System.out.println("Es MARTES");        
        }
        else if (dia2==3){
            System.out.println("Es MIERCOLES");        
        }
        else if (dia2==4){
            System.out.println("Es JUEVES");        
        }
        else if (dia2==5){
            System.out.println("Es VIERNES");        
        }
        else if (dia2==6){
            System.out.println("Es SABADO");        
        }
        else if (dia2==7){
            System.out.println("Es DOMINGO");        
        }
    }  
}
