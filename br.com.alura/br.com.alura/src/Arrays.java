import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arrays {
    public static void main(String[] args) throws Exception {
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        ArrayList <String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        /*lista.set(2, "variableAlterada");

        System.out.println(lista);*/

        Collections.sort(lista);

        System.out.println(lista);

        Collections.sort(lista,Collections.reverseOrder());

        System.out.println(lista);

        lista.sort(Comparator.reverseOrder());

        System.out.println(lista);

        lista.sort(Comparator.naturalOrder());

        System.out.println(lista);
    }
}
