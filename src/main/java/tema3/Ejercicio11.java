/*Realizar un programa que simule el juego de la “ruleta rusa”. Para ello, generaremos un
número aleatorio entre [1,6] y le mostraremos al usuario mensajes del tipo: “¿Quieres
dispararte el primer tiro?”, ¿Quieres dispararte el segundo tiro? …”. A medida que el usuario
se vaya disparando doblaremos el dinero ganado por él, partiendo inicialmente de 1000€. Si
coincide el tiro con el número aleatorio el usuario muere y lo pierde todo. Siempre podrá
retirarse en cualquiera de las preguntas de disparo.
 */
package tema3;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);              
        byte lugarBala;
        boolean decision;
             
        
        lugarBala = (byte)(Math.random()*6+1);
        
        System.out.print("Muy buenas, bienvenido a la ruleta rusa, pulsa enter si deseas jugar:");
        sc.nextLine();
        System.out.print("Por 1000€ ¿deseas dispararte? true/false: ");
        decision = sc.nextBoolean();
        
        if (decision == false){
            System.out.println("Eres un CACAS");
        }
        else{
            if (lugarBala == 6){
                System.out.println("MUERTO");
            }
            else {
                System.out.println("Enhorabuena sigues vivo");
                System.out.print("¿Quieres volverte a disparar por 2000€? true/false: ");
                decision = sc.nextBoolean();
                
                if (decision == false){
                    System.out.println("Eres un CACAS");
                }
                else {
                    if (lugarBala == 5){
                        System.out.println("MUERTO");
                    }
                    else {
                        System.out.println("Enhorabuena sigues vivo");
                        System.out.print("¿Quieres volverte a disparar por 4000€? true/false: ");
                        decision = sc.nextBoolean();
                        
                        if (decision == false){
                            System.out.println("Eres un CACAS");
                        }
                        else {
                            if (lugarBala == 4){
                               System.out.println("MUERTO"); 
                            }
                            else{
                                System.out.println("Enhorabuena sigues vivo");
                                System.out.print("¿Quieres volverte a disparar por 8000€? true/false: ");
                                decision = sc.nextBoolean();
                                
                                if (decision == false){
                                    System.out.println("Eres un CACAS");
                                }
                                else{
                                    if (lugarBala == 3){
                                        System.out.println("MUERTO");
                                    }
                                    else{
                                        System.out.println("Enhorabuena sigues vivo");
                                        System.out.print("¿Quieres volverte a disparar por 16000€? true/false: ");
                                        decision = sc.nextBoolean();
                                        
                                        if (decision == false){
                                            System.out.println("Eres un CACAS");
                                        }
                                        else{
                                            if (lugarBala == 2){
                                                System.out.println("MUERTO");
                                            }
                                            else{
                                                System.out.println("Enhorabuena sigues vivo, no te dejo disparar que es el ultimo hueco");
                                            }
                                        }
                                    }
                                }
                                
                            }
                        }
                    }
                    
                    
                }
            }
                
        }
        
        
        
        
        
        
        
    }
}
