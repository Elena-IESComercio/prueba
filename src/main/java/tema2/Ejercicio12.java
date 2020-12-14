/*Se va a adquirir un préstamo para comprar una casa que tiene
un valor de ‘h’ y una tasa de interés de i (i debe de estar entre 0 y 100)
a un plazo de ‘n’ años . Calcule la cuota respectiva a partir de la siguiente
formula y muestre la salida con dos decimales:
 */
package tema2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        //Primero añadiremos las variables
        Scanner sc = new Scanner (System.in);
        DecimalFormat decimal = new DecimalFormat("#.00");
        byte interes, años;
        int valor;
        float r, cuota;
        
        //Seguido pediremos los datos
        
        System.out.print("Por favor indique el valor de la casa: ");
        valor = sc.nextInt();
        System.out.print("Indica el interes: ");
        interes = sc.nextByte();
        System.out.print("Por ulitmo introduzca los años que deseas el préstamo: ");
        años = sc.nextByte();
        
        //Realizaremos los calculos
        
        r = (float) interes /(100*12);
        cuota = (float)((valor*r)/(1-Math.pow(1+r, -12*años)));
        
        //Mostraremos por pantalla los resultados
        
        System.out.println("Deberas pagar al año "+decimal.format(cuota)+"€");
        
        
    }
    
}
