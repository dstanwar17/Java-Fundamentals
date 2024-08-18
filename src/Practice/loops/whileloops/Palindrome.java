package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Palindrome {
    public static void main(String[] args) {
        // Using while loop check for palindrome.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word or number to check if it is a palindrome");
        String userInput = sc.nextLine();
        String userInputLC = userInput.toLowerCase();
//        System.out.println(userInputLC);

        String reverseInput = "";
        int i = userInput.length();
        while (i > 0) {
            i--;
            reverseInput = reverseInput + userInputLC.charAt(i);
        }

//        System.out.println(reverseInput);

        if (!reverseInput.equals(userInputLC)) {
            System.out.println(userInput + " is not a palindrome");
        }
        else {
            System.out.println(userInput + " is a palindrome");

        }


    }
}
