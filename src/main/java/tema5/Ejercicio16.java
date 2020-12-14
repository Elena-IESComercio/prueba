/*
 */
package tema5;

public class Ejercicio16 {

    public static void main(String[] args) {
        int n1;
        n1 = Integer.parseInt(misfunciones.IntroducirDatos.dato("Introduce un Nº y hare un triangulo: "));
        triangulo(n1, n1);
    }

    public static void triangulo(int a, int b) {
        if (a == 1) { // Caso base funcion
            System.out.println(".");
        } else if (a == b) {// Primera linea del triangulo
            for (int i = 0; i < a; i++) {
                System.out.print(".");
            }
            System.out.println("");
            triangulo(a - 1, b);
        } else { // Lineas intermedias del triangulo
            for (int i = 1; i <= a; i++) {
                if (i == 1 || i == a) {
                    System.out.print(".");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            triangulo(a - 1, b);
        }

    }
}
