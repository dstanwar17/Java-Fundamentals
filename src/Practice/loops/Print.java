package Practice.loops;

import java.util.Collection;
import java.util.Map;

/**
 * @author dstanwar17
 */
public class Print {

    // Varargs method to print multiple parameters
    public static void print(Object... args) {
        for (Object arg : args) {
            if (arg instanceof Collection) {
                print((Collection<?>) arg);
            } else if (arg instanceof Map) {
                print((Map<?, ?>) arg);
            } else if (arg instanceof int[]) {
                print((int[]) arg);
            } else if (arg instanceof double[]) {
                print((double[]) arg);
            } else if (arg instanceof char[]) {
                print((char[]) arg);
            } else if (arg != null) {
                System.out.println(arg);
            } else {
                System.out.println("null");
            }
        }
    }

    // Overloaded method to print a Collection
    public static void print(Collection<?> collection) {
        for (Object element : collection) {
            System.out.println(element);
        }
    }

    // Overloaded method to print a Map
    public static void print(Map<?, ?> map) {
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Overloaded method to print an int array
    public static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    // Overloaded method to print a double array
    public static void print(double[] array) {
        for (double element : array) {
            System.out.println(element);
        }
    }

    // Overloaded method to print a char array
    public static void print(char[] array) {
        for (char element : array) {
            System.out.println(element);
        }
    }
}
