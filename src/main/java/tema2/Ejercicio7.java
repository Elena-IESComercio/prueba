/* Un frutero necesita calcular los beneficios actuales
que obtiene de la venta de manzanas y peras. Por este motivo,
es necesario diseñar una aplicación que solicite las ventas (en kilos)
de cada trimestre para cada fruta. La aplicacion mostrará el importe
total sabiendo que el precio del kilo de manzanas está fijado
en 2.35€ y el kilo de peras está fijado en 1.95€.
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static final  float PRECIO_MANZANA = (float) 2.35;
    public static final  float PRECIO_PERA = (float) 1.95;
            
    public static void main(String[] args) {
       // Primero añadimos las variables que vamos a utilizar //
        Scanner s = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        short manzana_primer, manzana_segundo, manzana_tercero, manzana_cuarto;
        short pera_primer, pera_segundo, pera_tercero, pera_cuarto;        
        float dinero_manzana, dinero_pera, dinero_total;        
        
        // Pediremos los datos de los kilos de cada fruta
        
        System.out.println("Bienvenido al programa de calculo de beneficio");
        System.out.println("Introduzca los siguientes datos:");
        System.out.print("Kilos de manzanas primer trimestre: ");
        manzana_primer = s.nextShort();
        System.out.print("Kilos de peras primer trimestre: ");
        pera_primer = s.nextShort();
        System.out.print("Kilos de manzanas segundo trimestre: ");
        manzana_segundo = s.nextShort();
        System.out.print("Kilos de peras segundo trimestre: ");
        pera_segundo = s.nextShort();
        System.out.print("Kilos de manzanas tercer trimestre: ");
        manzana_tercero = s.nextShort();
        System.out.print("Kilos de peras tercer trimestre: ");
        pera_tercero = s.nextShort();
        System.out.print("Kilos de manzanas cuarto trimestre: ");
        manzana_cuarto = s.nextShort();
        System.out.print("Kilos de peras cuarto trimestre: ");
        pera_cuarto = s.nextShort();
        
        
        /* Realizaremos el calculo para saber cuanto dinero ganamos con
        cada fruta*/
        
        dinero_manzana = (manzana_primer + manzana_segundo + manzana_tercero + manzana_cuarto)*PRECIO_MANZANA;
        dinero_pera = (pera_primer + pera_segundo + pera_tercero + pera_cuarto)* PRECIO_PERA;
        
        System.out.println("El dinero total por las peras son: " + dinero_pera);
        System.out.println("El dinero total por las peras son: " + dinero_manzana);
        dinero_total = dinero_manzana + dinero_pera;
        System.out.println("El total de dinero obtenido son: " + dinero_total);
        
        
        }
    }
        
        
     

        
        
        
        
        
        
        
        
      
        
