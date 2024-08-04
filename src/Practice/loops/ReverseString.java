package Practice.loops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */

// Reverse a string using while loop
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to reverse: ");
        String word = sc.nextLine();
        int len = word.length();
        String reverseStr = "";

        while (len > 0) {
            reverseStr += word.charAt(len - 1);
            len--;
        }
        System.out.println(reverseStr);
    }
}
