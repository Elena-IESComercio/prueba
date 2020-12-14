/* Comprueba las cadenas de caracteres char */

package tema6;

public class Ejercicio1 {
    public static void main(String[] args) {
        char prueba1='a', prueba2='9', prueba3='0';
        
        System.out.println("Son digitos: "+prueba1+" o "+prueba2);
        System.out.println(Character.isDigit(prueba1));
        System.out.println(Character.isDigit(prueba2));
        System.out.println("Son letras: "+prueba1+" o "+prueba2);
        System.out.println(Character.isLetter(prueba1));
        System.out.println(Character.isLetter(prueba2));
        System.out.println("Es letra minuscula: "+prueba1);
        System.out.println(Character.isLowerCase(prueba1));
        System.out.println("Es letra es espacio: "+prueba2);
        System.out.println(Character.isSpaceChar(prueba2));
        System.out.println("Pasa a Mayuscula: "+prueba1);
        System.out.println(Character.toUpperCase(prueba1));
        System.out.println(Character.digit(prueba2, 16));
        System.out.println(Character.forDigit(1999, prueba2));
        System.out.println("Los valores iniciales de eran y son: ");
        System.out.println(prueba1);
        System.out.println(prueba2);
        
        for(int a=0;a<1024;a++){
            System.out.print(a+"es: "+prueba3+" ");
            prueba3++;
        }
        
    }
    
}
