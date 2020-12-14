/*Realizar un ejercicio que simule la tirada de dos dados de poker*/
package tema3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);              
        byte dado1, dado2;
        String as = "AS", j = "J", q = "Q", k = "K";
        byte siete = 7, ocho = 8;
        
        //Generamos dos tiradas
        dado1 = (byte)(Math.random()*6+1);
        dado2 = (byte)(Math.random()*6+1);
        //Mostramos las tiradas       
        System.out.println("Pulsa enter para tirar los dados:");
        sc.nextLine();
        //"\033[35m" es para ponerle color a las letras que salgan despues de ello
        if (dado1==1){
            System.out.println("Te ha salido un: " + "\033[35m"+as);
        }
        else if (dado1==2){
            System.out.println("Te ha salido un: "+siete);
        }
        else if (dado1==3){
            System.out.println("Te ha salido un: "+ocho);
        }
        else if (dado1==4){
            System.out.println("Te ha salido un: " + "\033[35m"+j);
        }
        else if (dado1==5){
            System.out.println("Te ha salido un: "+ "\033[35m"+q);
        }
        else{
            System.out.println("Te ha salido un: "+ "\033[35m"+k);
        }
        
        if (dado1==2){
            System.out.println("Te ha salido un: "+"\033[35m"+as);
        }
        else if (dado2==2){
            System.out.println("Te ha salido un: "+siete);
        }
        else if (dado2==3){
            System.out.println("Te ha salido un: "+ocho);
        }
        else if (dado2==4){
            System.out.println("Te ha salido un: "+"\033[35m"+j);
        }
        else if (dado2==5){
            System.out.println("Te ha salido un: "+"\033[35m"+q);
        }
        else{
            System.out.println("Te ha salido un: "+"\033[35m"+k);
        }
        
        
        
     }  
       
        
        

    
    
}
