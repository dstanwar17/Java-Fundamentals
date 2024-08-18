package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class CountDown {
    public static void main(String[] args) {
        // Give the countdown from User input till 1.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from which you want a countdown :D : ");
        int number = sc.nextInt();
        int i = number;
        while (i > 0) {
            System.out.println(i);
            i--;

        }

        sc.close();

    }
}
