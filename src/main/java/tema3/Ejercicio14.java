/*Realiza un programa en Java que pide el día mayor de un mes y te muestre en texto los meses
que tienen ese número de días (por ejem. 31-&gt;Enero, 28-&gt;Febrero …)*/
package tema3;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        //Variables
        Scanner sc =new Scanner (System.in);
        byte dia;
        //Pedimos el Nº maximo al usuario
        System.out.print("Buenas dime el dia maximo de un mes y te dire que meses pueden ser: ");
        dia = sc.nextByte();
        
        switch (dia){
            case 31:
                System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
                break;
            case 30:
                System.out.println("Abril, Junio, Septiembre y Noviembre");
                break;
            case 29:
            case 28:
                System.out.println("Febrero");
                break;
            default:
                System.out.println("No tiene mes");
        }
    }
    
}
