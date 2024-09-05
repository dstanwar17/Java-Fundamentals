package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class StringReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter any word you want the reversal of: ");
        String word = sc.nextLine();
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
//            System.out.print(word.charAt(i));
        }
        System.out.println(" ");
        System.out.println("Reversal of " + word + " is: " + reversed);

        // Now we will also check for the palindrome.

        if (word.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println("Yes, it is a Palindrome");
        } else {
            System.out.println("No, it is not a Palindrome");
        }

        System.out.println(word.substring(0, word.length() - 2));
    }

}
