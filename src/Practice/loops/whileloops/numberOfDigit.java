package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class numberOfDigit {
    public static void main(String[] args) {

        // Count the number of digits of the user input also find the sum of digits of the given input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        int i = number;
        int sum = 0;
        sc.close();

        while (i > 0) {
            sum += i % 10;
            i /= 10;
            count++;
        }
        System.out.println("The number " + number + " has total of " + count + " digits.");
        System.out.println(sum + " is the sum of " + number + " digits.");

    }
}
