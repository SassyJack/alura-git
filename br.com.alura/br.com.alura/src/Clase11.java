import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {
    public static void main(String[] args) {
        String alumno1 = "Ramon";
        String alumno2 = "Pipe";
        String alumno3 = "Kaka";
        String alumno4 = "Checho";

        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });

        boolean validar = listaAlumnos.contains("Ramon");

        System.out.println(validar);

        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(max);

        listaAlumnos.removeIf(alumno -> "Ramon".equalsIgnoreCase(alumno));

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
    }

    
}
