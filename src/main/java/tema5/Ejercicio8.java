/* Realizar una funcion que pida dos numeros a y b y devuelva un booleano indicando si b es un divisor de a */

package tema5;

import misfunciones.IntroducirDatos;
import misfunciones.Matematicas;

public class Ejercicio8 {
    public static void main(String[] args) {
        int n1, n2;
        boolean resultado;
        
        n1 = Integer.parseInt(IntroducirDatos.dato("Introduce un Nº: "));
        n2 = Integer.parseInt(IntroducirDatos.dato("Introduce otro Nº: "));
        
        resultado = misfunciones.Matematicas.esDivisor(n1, n2);
        
        System.out.println("¿Se puede dividir "+n1+" entre "+n2+" : "+resultado);
        
        
    }
    
}
