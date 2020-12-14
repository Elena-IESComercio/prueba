/*Prueba valores regulares*/
package tema4;

import java.util.Scanner;

public class PruebaValoresRegulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String e_a = ".+\\..+\\.\\w{3}";
        String b = "\\d{2}";
        String c = ".+@.+";
        String d = "\\d{2} \\d{2} \\d{2}";
        String e = ".*\\d{1,2}/\\d{1,2}/\\d{4}.*";
        String f = "[a-zA-Z0-9\\.-]*@[\\d\\w]*.\\w{2,3}";
        String g = "\\d{3}-\\d{3}-\\d{4}";
        String h = "-1|\\d+";
        
        String dato;
        
        do { 
            System.out.print("Escribe: ");
            dato = sc.nextLine();
            
        } while (!dato.matches(h));
        System.out.println("Bien");
        
    }
    
}
