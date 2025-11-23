package ua.opnu;
import java.util.Arrays;

interface Predicate<T> {
    boolean test(T t);
}

public class FilterUtil {
    public static <T> T[] filter(T[] input, Predicate<T> p) {

        // Початковий масив максимально можливої довжини
        T[] result = (T[]) new Object[input.length];

        int counter = 0;
        for (T i : input) {
            if (p.test(i)) {
                result[counter] = i;
                counter++;
            }
        }

        return Arrays.copyOf(result, counter);
    }
}
