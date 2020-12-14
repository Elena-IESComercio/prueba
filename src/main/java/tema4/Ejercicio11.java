//Realizar un programa en Java que muestre los números entre 1 y 100 salvo los múltiplos de 7.
package tema4;

public class Ejercicio11 {
    public static void main(String[] args) {
        byte i=0;
        
        System.out.println("Los numeros del 1-100 menos los multiplos de 7 son: ");
        //Bucle
        while(i<100){
            i++;
            if(i%7==0){
                continue;  
            }
            System.out.println(i);
        }
    }
}
