/*Introduce la nota de n Alumnos y di cual es la nota mas alta de la clase,
la menor y la media.
 */
package ejercicios;

public class EjercicioAlumnos {
    public static void main(String[] args) {
        int alumnos;
        double nota, notaMayor=0, notaMenor=10, notaMedia=0;
        
        // Pedimos la cantidad de alumnos que tiene la clase
        
        alumnos = Integer.parseInt(misfunciones.IntroducirDatos.pedirDato("Introduce la cantidad de alumnos en clase: ", "\\d+"));
        
        for (int cont=0;cont<alumnos;cont++){
            nota = Double.parseDouble(misfunciones.IntroducirDatos.pedirDato("Introduce la nota del alumno "+(cont+1), "\\d\\.?\\d.{0,2}"));
            if(nota>notaMayor){
                notaMayor = nota;
            }
            else if(nota<notaMenor){
                notaMenor = nota;
            }
            notaMedia=notaMedia+nota;
        }
        notaMedia = notaMedia/alumnos;
        System.out.println("La nota media de la clase es: "+notaMedia);
        System.out.println("La nota mayor es de: "+notaMayor);
        System.out.println("La nota menor es de: "+notaMenor);
    }
    
}
