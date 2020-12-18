/*Realiza un juego que uno ponga una contraseña y otro intente adivinarla  */
package tema6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String contraseña1, contraseña2="";
        byte cont=3;
        int mayor;
        
        System.out.print("Introduce una contraseña: ");
        contraseña1 = sc.nextLine();
        
        do{
            for(byte i=0; i<cont;i++){
                System.out.print("Intenta adivinar la contraseña de tu compañero: ");
                contraseña2 = sc.nextLine();
                if (contraseña1.equals(contraseña2)){
                    break;
                }
            }
            System.out.println("La contraseña tiene "+contraseña1.length()+" caracteres");
            
            for(byte a=0; a<cont;a++){
                System.out.print("Intenta adivinar la contraseña de tu compañero: ");
                contraseña2 = sc.nextLine();
                
                if (contraseña1.equals(contraseña2)){
                    break;
                } 
            }
            System.out.println("Los dos ultimos caracteres de la contraseña son: "+contraseña1.substring(contraseña1.length()-2));
            do{
                System.out.print("Intenta adivinar la contraseña de tu compañero: ");
                contraseña2 = sc.nextLine();
                mayor = contraseña1.compareTo(contraseña2);
                if (mayor<0){
                    System.out.println("Menor");
                }else{
                    System.out.println("Mayor");
                }
            }while (!contraseña1.equals(contraseña2));   
            
        }while (!contraseña1.equals(contraseña2));
    }
        
}
    
