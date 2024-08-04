package Practice.loops;

/**
 * @author dstanwar17
 */

// Calculate sum of numbers from 1 to 100 using a for loop
public class CalculateSum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println(sum);
    }
}
