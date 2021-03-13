import java.util.Arrays;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");
        List<Double> list4 = Arrays.asList(1.0, 2.0);
        List<Number> list5 = Arrays.asList(1, 2);
        /* UnboundedWildcard */
        printWithUnboundedWildcard(list1);
        printWithUnboundedWildcard(list2);
        printWithUnboundedWildcard(list3);
        printWithUnboundedWildcard(list4);
        printWithUnboundedWildcard(list5);
        /* UpperBoundedWildcard */
        printWithUpperBoundedWildcard(list2);
        printWithUpperBoundedWildcard(list4);
        /* LowerBoundedWildcard */
        printWithLowerBoundedWildcard(list2);
        printWithLowerBoundedWildcard(list5);
    }

    /* Any Type is accepted as Argument */
    static void printWithUnboundedWildcard(List<?> list) {
        list.forEach(e -> System.out.println(String.format("%s - %s", e.getClass().getName(), e)));
    }

    /* Anything what is of Type Number or Type of his Subclasses is accepted as Argument */
    static void printWithUpperBoundedWildcard(List<? extends Number> list) {
        list.forEach(e -> System.out.println(String.format("%s - %s", e.getClass().getName(), e)));
    }

    /* Anything what is of Type Integer or Type of his Superclass is accepted as Argument */
    static void printWithLowerBoundedWildcard(List<? super Integer> list) {
        list.forEach(e -> System.out.println(String.format("%s - %s", e.getClass().getName(), e)));
    }
}
