
package tema5;

import misfunciones.IntroducirDatos;

public class Ejercicio15 {
    public static void main(String[] args) {
        int n1;
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº y hare un triangulo: "));
        asterisco(n1);
    }
    
    
    public static void asterisco (int a) {
        if (a==1){
            System.out.println("*");
        }else{
            for(int i=0;i<a;i++){
                System.out.print("*");
            }
            System.out.println("");
            asterisco(a-1);
        }
    }
    
}
