package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class nNumber {
    public static void main(String[] args) {

        // Take user input and print natural numbers till n number given by user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(); // will take user input and save it in variable n
        int i = 1; // Iterator
        int sum = 0;

        while (i <= n) {
            System.out.print(i + " | ");
            sum = sum + i;
            i++;

        }

//        No print the sum of natural numbers till n.

//        while (i <= n) {
//            sum = sum + i;
//            i++;
//        }
        System.out.println();
        System.out.println(sum);

    }
}
