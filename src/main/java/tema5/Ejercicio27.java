/* Realiza una funcion que muestre por programa la secuencia de los primeros 20 números siguientes
 1 , 5 , 3 , 15 , 5 , 75 , 7... */
package tema5;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println(secuencia28(19));
    }
    public static void secuencia27(int n) {
        long a=1, b=5;
        n = n/2;
        
        for (byte cont=0;cont<n;cont++){
            System.out.print(a+",");
            System.out.print(b+",");
            a = a+2;
            b = b*a;
        }
        
    }
    
    public static String secuencia28(int n) {
        int a=3, b=6, c=7,num;
        String numero="";
        num=n;
        n=n/3;
        
        for(byte cont=0;cont<n+1;cont++){
            if(cont==n && (n*3-1)==num){
                numero = numero + a+","+b+".";
                break;
                
            }else if (cont==n && (n*3-2)==num){
                numero = numero + a+".";
                break;
            }else if (cont==n && n*3==num){
                break;
            }
            else{
                numero = numero + a+","+b+","+c+",";
                a=a+2;
                b=b+4;
                c=c+4;
            }
                       
        }
        return numero;
        
        
    }
    
    
}
