
package tema6;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase, muestra="";
        
        do{
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
            
            if (frase.equals("FIN")){
                break;
            }
            else{
                for(int i=0;i<frase.length();i++){
                    muestra = muestra+frase.charAt(i)+" ";      
                }
                
            }
            System.out.println(muestra);
            
            
        }while (!frase.equals("FIN"));
        
    }
    
}
