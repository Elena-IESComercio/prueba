/*Realiza un programa en Java que pide el día mayor de un mes y te muestre en texto los meses
que tienen ese número de días (por ejem. 31-&gt;Enero, 28-&gt;Febrero …)*/
package tema3;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        //Variables
        Scanner sc =new Scanner (System.in);
        String mes;
        //Pedimos el Nº maximo al usuario
        System.out.print("Buenas escribeme 1 mes con todas minusculas: ");
        mes = sc.next();
        
        
        switch (mes){
            case "enero":
            case "diciembre":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
                System.out.println("Tiene 31 dias");
                break;
            case "febrero":
                System.out.println("Tiene 28 o 29 dias");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("Tiene 30 dias");
                break;
            default:
                System.out.println("Mes escrito incorrectamente");
        }
    }
    
}
