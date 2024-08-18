package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Factorials {
    public static void main(String[] args) {
        // Finding the Factorial of the user input and displaying it in output.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to know the factorial of: ");
        int n = sc.nextInt();
        int userInput = n;

        int factorial = 1;

        while (n > 1) {
            factorial = factorial * n;
            n--;
        }
        System.out.println("The factorial of " + userInput + " is " + factorial);
        sc.close();


    }
}
