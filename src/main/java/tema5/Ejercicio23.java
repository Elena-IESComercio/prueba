/*Diseñar un programa que pide al usuario una letra (mayúscula o minúscula) y muestra por
pantalla un triángulo como el que aparece en el ejemplo:  */
package tema5;

public class Ejercicio23 {
    public static void main(String[] args) {
        char caracter, caracter2='A'|'a', caracter3;
        String letras;
        letras = misfunciones.IntroducirDatos.pedirDato("Introduce una letra", "[Aa-zZ]+");
        caracter = letras.charAt(0);
        
        for(;caracter>=caracter2;caracter--){
            caracter3 = caracter2;
            for(;caracter3<caracter+1;caracter3++){
                System.out.print(caracter3);
            }
            System.out.println("");
        }
    }
    
}
