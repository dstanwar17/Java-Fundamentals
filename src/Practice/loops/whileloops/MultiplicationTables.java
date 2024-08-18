package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        // Create Multiplication Table using input from user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you need multiplication table: ");
        int n = sc.nextInt();
        System.out.println("Enter the number till which you need multiplication table: ");
        int m = sc.nextInt();

        int i = 1;

        while (i <= m) {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }



    }
}
