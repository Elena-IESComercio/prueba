/* Realizar una función recursiva en Java que pida un número entero positivo (t) y muestre por
pantalla la tabla de multiplicar de t. */
package tema5;

public class Ejercicio14 {
    public static void main(String[] args) {
        int n1, n2=10;
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce 1 Nº"));
        tabla(n1, n2);
    }
    
    public static int tabla(int a, int b) {
        int resultado=1;
        if (b==1){
            System.out.println(a+"x"+b+"="+a);
        }else{
            System.out.println(a+"x"+b+"="+(a*b));
            resultado = a * tabla(a, b-1);
        }
        return resultado;
    }
    
}
