import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Clase5 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", 30);
        Curso curso2 = new Curso("JavaScript", 20);
        Curso curso3 = new Curso("PHP",40);
        Curso curso4 = new Curso("Ruby", 60);
        Curso curso5 = new Curso("Ruby", 10);
        Curso curso6 = new Curso("Java", 80);

        ArrayList <Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        Collections.sort(cursos,Collections.reverseOrder());
        System.out.println(cursos);
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        Map<String, List<Curso>> groupCursos = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        groupCursos.forEach((key , value)->System.out.println(key + " "+ value.size()));
}
}
