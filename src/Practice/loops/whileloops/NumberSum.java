package Practice.loops.whileloops;

/**
 * @author dstanwar17
 */
public class NumberSum {
    public static void main(String[] args) {
        // Calculate the sum of first 10 natural numbers.

        int i =0;
        int sum = 0;

        while(i<11){
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of first 10 natural numbers using while loop is " + sum);

        int sum2 =0;
        for (int j = 0; j <11; j++) {
            sum2 += j;
        }
        System.out.println("The sum of first 10 natural numbers using for loop is " + sum2);


    }
}
