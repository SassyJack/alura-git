import java.util.ArrayList;
import java.util.Collections;

public class Clase5 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("JavaScript", 20);
        Curso curso3 = new Curso("PHP",40);
        Curso curso4 = new Curso("Ruby", 60);

        ArrayList <Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        Collections.sort(cursos,Collections.reverseOrder());
        System.out.println(cursos);
}
}
