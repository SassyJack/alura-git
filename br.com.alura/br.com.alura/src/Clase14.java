import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Clase14 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Ramon", 05);
        Alumno alumno2 = new Alumno("Pipe", 01);
        Alumno alumno3 = new Alumno("Kaka", 02);
        Alumno alumno4 = new Alumno("Checho", 03);
    
        Collection<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);

        Alumno alumnoNuevo = new Alumno("Ramon", 05);

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));
    }
}
