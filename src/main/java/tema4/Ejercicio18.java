
package tema4;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente, resultado=0, base1;
        byte cont1, cont2;
        
        System.out.print("Base: ");
        base = sc.nextInt();
        System.out.print("Exponente: ");
        exponente = sc.nextInt();
        
        base1=base;
        
        for(cont1=1;cont1<exponente;cont1++){
            resultado=0;
            for(cont2=0;cont2<base;cont2++){
                resultado = resultado+base1;
            }
            base1=resultado;
        }
        System.out.println(resultado);
    }
    
}
