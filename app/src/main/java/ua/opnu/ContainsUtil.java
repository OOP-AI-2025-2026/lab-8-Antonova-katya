package ua.opnu;

public class ContainsUtil {
    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {

        if (element == null) {
            for (T str : array)
                if (str == null)
                    return true;
            return false;
        }

        for (T str : array)
            if (element.equals(str))
                return true;
        return false;
    }
}
