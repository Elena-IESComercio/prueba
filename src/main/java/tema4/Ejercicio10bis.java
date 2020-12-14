
package tema4;

public class Ejercicio10bis {
    public static void main(String[] args) {
        byte i=2;
        
        //bucle
        for (;i<12;i++){
            if(i%2==0){
                continue;
            }
            
            System.out.println("La i vale: "+i);
        }
    }
}
