import java.util.ArrayList;
import java.util.List;

public class TypeParameterAndTypeArgument {
    public static void main(String[] args) {
        /* List<E> E is a TypParameter */
        /* List<Integer> Integer is a TypArgument */
        /*
        Naming Convention:
        E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
        K – Key (Used in Map)
        N – Number
        T – Type
        V – Value (Used in Map)
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
