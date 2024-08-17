package Practice.loops.forloop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class fibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n number for fibonacci series: ");
        int n = in.nextInt();
        in.close();

        ArrayList<Integer> fibonacciNumbers = new ArrayList();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);

        for (int i = 1; i <= n-2; i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i) + fibonacciNumbers.get(i - 1));
        }
        System.out.println(fibonacciNumbers);

    }
}
