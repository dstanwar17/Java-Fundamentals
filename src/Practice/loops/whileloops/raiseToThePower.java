package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class raiseToThePower {
    public static void main(String[] args) {

//        Given two numbers as user input; find number 1 raise to the power number two.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the power of a number: ");
        int power = sc.nextInt();

        int answer = 1;

        for (int i = 1; i <= power; i++) {
            answer *= number;
        }
        System.out.println(answer);


    }
}
