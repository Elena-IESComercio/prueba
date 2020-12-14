/*Un economista nos ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA a aplicar.
Debemos mostrar en pantalla en pantalla el importe correspondiente al IVA y al total.
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Primero vamos a añadir las variables
        Scanner sc = new Scanner (System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        
        float baseImponible, importeTotal, ivaProducto;
        byte iva;
        
                
        // Seguiremos pidiendo los datos al cliente
        
        System.out.print("Indique la base imponible del producto:");
        baseImponible = sc.nextFloat();
        System.out.print("Indica el IVA correspondiente a ese producto: ");
        iva = sc.nextByte();
        
        //Continuaremos realizando los calculos correspondientes
        
        ivaProducto = (baseImponible*iva)/100;
        importeTotal = baseImponible + ivaProducto;
        
        //Mostraremos por pantalla los resultados
        
        System.out.println("El precio total del producto es: " + decimal.format(importeTotal)+ "€");
        System.out.println("El iva es: " + decimal.format(ivaProducto)+"€");
    }
       
    
}
