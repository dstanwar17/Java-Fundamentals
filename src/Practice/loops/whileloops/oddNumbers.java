package Practice.loops.whileloops;

import java.util.ArrayList;

/**
 * @author dstanwar17
 */
public class oddNumbers {
    public static void main(String[] args) {
        // Print Odd numbers between 1 to 20 and then from 20 to 1 using while loop.

        int i = 0;
        int j = 20;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();

        while (i < 20) {
            if (i % 2 != 0) {
                numbers.add(i);
            }
            i++;

        }
        System.out.println(numbers);

        while (j > 0) {
            if (j % 2 != 0) {
                numbers2.add(j);
            }
            j--;
        }
        System.out.println(numbers2);
    }
}
