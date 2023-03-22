import java.lang.reflect.Array;
import java.util.ArrayList;

public class Clase4 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria", 30);
        Curso curso2 = new Curso("Física", 20);
        Curso curso3 = new Curso("Química",40);
        Curso curso4 = new Curso("Matemática", 60);

        ArrayList <Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);
    }
}