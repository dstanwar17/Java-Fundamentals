package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class doNotPrint3Multiples {
    public static void main(String[] args) {

//        Take User input and print natural numbers till n input while skipping the multiples of 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number: ");
        int n = sc.nextInt();

        int i = 0;

        while (i <= n) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }


    }
}
