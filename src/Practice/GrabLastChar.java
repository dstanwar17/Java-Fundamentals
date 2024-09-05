package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class GrabLastChar {
    // Grabbing the last character of the user input.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter word you want to know the last character of: ");
        String word = sc.nextLine();

        System.out.println(word.charAt(word.length()-1));

        // Now Grabbing first character of the user input

        System.out.println("Please enter your first Name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last Name: ");
        String lastName = sc.nextLine();

        System.out.println("Your initials are " + firstName.charAt(0) + "." + lastName.charAt(0));



    }
}
