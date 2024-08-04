package Practice.loops;

/**
 * @author dstanwar17
 */

// Print even numbers from 1 to 20 using while loop
public class EvenNumbers {
    public static void main(String[] args) {

        int i = 0;

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}