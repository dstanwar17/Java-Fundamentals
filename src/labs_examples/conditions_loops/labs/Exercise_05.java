package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lowerBound number: ");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upperBound number: ");
        int upperBound = sc.nextInt();

        int sum =0;

        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;

        }
        System.out.println(sum);
        System.out.println("Average is " + sum/(((double) upperBound-lowerBound)+1));
    }
}
