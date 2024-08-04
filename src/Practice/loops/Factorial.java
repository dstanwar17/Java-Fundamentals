package Practice.loops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */

// Calculate factorial of a number using while loop
public class Factorial {
    public static void main(String[] args) {

        System.out.println(10*9*8*7*6*5*4*3*2*1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        int number = sc.nextInt();
        int factorial = 1;

        while (number != 1) {
            factorial *= number;
            number--;
        }
        System.out.println("The factorial of number is " + factorial);


    }
}
