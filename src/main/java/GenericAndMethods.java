public class GenericAndMethods {
    public static void main(String[] args) {
        /* With Generics have to use the Wrapper Class instead of the Primitive Values */
        String[] strings = {"Michael"};
        Character[] letters = {'M'};
        Integer[] integers = {1};
        print(strings);
        print(letters);
        print(integers);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(String.format("%s - %s",e.getClass().getName(),e));
        }
    }
}
