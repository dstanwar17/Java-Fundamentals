package Practice.loops.whileloops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        // Take user input as k and print first k fibonacci numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to see the fibonacci series: ");
        int n = sc.nextInt();

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();

        int i = 2;

        if (n == 0) {
            fibonacciNumbers.add(0);
            System.out.println(fibonacciNumbers);
        } else if (n == 1) {
            fibonacciNumbers.add(0);
            fibonacciNumbers.add(1);
            System.out.println(fibonacciNumbers);
        } else {
            fibonacciNumbers.add(0);
            fibonacciNumbers.add(1);

            while (i < n) {
                fibonacciNumbers.add(fibonacciNumbers.get(i) + fibonacciNumbers.get(i + 1));
                i++;

            }
            System.out.println(fibonacciNumbers);
        }
    }
}
