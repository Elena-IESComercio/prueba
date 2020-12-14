/*Realizar un programa en JAVA que muestre mediante la intruccion do while y for
los numeros 3 5 7 9 y 11 haciendo uso de la instruccion continue.
 */
package tema4;

public class Ejercicio10 {
    public static void main(String[] args) {
        byte i=1;
        
        //Realizamos el bucle
        
        do {
            if(i%2==1){
                i++;
                continue;
            }
            i++;
            System.out.println("La i vale: "+i);  
        }while (i<=11);
    }
    
}
