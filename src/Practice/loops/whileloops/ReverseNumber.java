package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class ReverseNumber {
    public static void main(String[] args) {
        // Take an input from User and give output in reverse order.
        // Though the exercise was to reverse the number; however the program is capable of reversing any
        // data type, as it takes user input in string format.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything you want to reverse: ");
        String userInput = sc.nextLine();

        int i = userInput.length();
        String reversed = "";
        while (i > 0) {
            reversed = reversed + (userInput.charAt(i - 1));
            i--;
        }
        System.out.println(reversed);
    }
}
