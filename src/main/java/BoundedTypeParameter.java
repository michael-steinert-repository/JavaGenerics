public class BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers1 = {1, 2, 3};
        Double[] numbers2 = {1.0, 2.0, 3.0};
        String[] strings = {"Michael", "Micha"};
        System.out.println(countGreaterThan(numbers1, 0));
        System.out.println(countGreaterThan(numbers2, 0.0));
        System.out.println(countGreaterThan(strings, ""));
    }

    /* Every Argument which is passed to the Method have to extends the Interface Comparable */
    /* Further Interfaces can be added with & and the extended Class must be at the Beginning */
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
