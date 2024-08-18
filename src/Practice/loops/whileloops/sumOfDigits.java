package Practice.loops.whileloops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class sumOfDigits {
    public static void main(String[] args) {
        // Here we need to find a solution to give sum of digits as an output.
        // For example if user input is 12345, then the solution should perform the following 1 + 2 + 3 + 4 + 5 to give the output as 15.
        // Take input from user, using Scanner class.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String userInput = sc.nextLine();

        ArrayList<Integer> numbers = new ArrayList<>();

        int sum = 0;
        int i = 0;

        while (i < userInput.length()) {
            numbers.add(Integer.parseInt(userInput.substring(i, i + 1)));
            sum += numbers.get(i);
            i++;
        }
        System.out.println(sum);



    }
}
