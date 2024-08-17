package Practice.loops.forloop;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Factorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to find the factorial of : ");
        double n = scanner.nextInt();
        double factorial = 1;

        for (double i = n; i >= 1; i-- ) {
            factorial *= i;

        }
        System.out.println(factorial);
    }
}
