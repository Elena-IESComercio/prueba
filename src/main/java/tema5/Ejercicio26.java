/* Se desea obtener el promedio de g grupos que están en un mismo año escolar; siendo que
cada grupo puede tener n alumnos, que cada alumno puede llevar m materias y que en todas
las materias se promedian tres calificaciones para obtener el promedio de la materia. Lo que
se desea desplegar es el promedio de los grupos, el promedio de cada grupo y el promedio de
cada alumno. */
package tema5;

public class Ejercicio26 {
    public static void main(String[] args) {
            System.out.println(mediaAlumno());
    }
    
    
    
    
    
    public static double mediaAsignatura (){
        double nota1, nota2, nota3, media;
        
        nota1 = Double.parseDouble(misfunciones.IntroducirDatos.pedirDato("Introduce la 1ª nota: ", "\\d\\.\\d*"));
        nota2 = Double.parseDouble(misfunciones.IntroducirDatos.pedirDato("Introduce la 2ª nota: ", "\\d\\.\\d*"));
        nota3 = Double.parseDouble(misfunciones.IntroducirDatos.pedirDato("Introduce la 3ª nota: ", "\\d\\.\\d*"));
        media = (nota1+nota2+nota3)/3;
        return media;
    }
    
    public static double mediaAlumno (){
       byte nAsignaturas, cont =0;
       double media=0,mediaAlumno, notaAsignatura;
       
       nAsignaturas = Byte.parseByte(misfunciones.IntroducirDatos.pedirDato("Introduce en Nº cuantas asignaturas tiene el alumno: ","\\d" ));
       
       for(;cont<nAsignaturas;cont++){
           System.out.println(cont+1+"ª Asignatura");
           notaAsignatura = mediaAsignatura();
           media = media + notaAsignatura;  
       }
       mediaAlumno = media/(cont+1);
       return mediaAlumno;
    }
    
}
