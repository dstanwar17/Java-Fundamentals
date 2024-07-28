package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class FactoralCalc {
    public static void main(String[] args) {
        // Factoral calculation is where the number is multiplied with backword till it reaches 1.
        // Example if asked to find factorial of 4, it should give the output by performing calculation like
        // 4 * 3 * 2 * 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you need factorial: ");
        int n = sc.nextInt();

        int sum = 1; // This will store the values.

        while (n > 1){

            sum *= n;
            n--;

        }
        System.out.println(sum);
    }
}
