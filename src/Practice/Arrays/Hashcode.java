package Practice.Arrays;

import java.util.*;

/**
 * @author dstanwar17
 */
public class Hashcode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = arr;
        int[] arr4 = arr2;

        boolean result = arr.equals(arr2);
        System.out.println(result);

        System.out.println(arr.hashCode());
        System.out.println(arr2.hashCode());

        System.out.println(arr.hashCode() == arr2.hashCode());

        System.out.println(arr3.hashCode());
        System.out.println(arr4.hashCode());

        int[] one = new int[1];
        int[] two = new int[1];

        System.out.println(one.hashCode() == two.hashCode());
    }
}
