package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word and I will tell you the first vowel of it: : ");
        String word = sc.nextLine();
        word = word.toLowerCase();

        String vowels = "aeiou";

        int i = 0;
        int j = 0;
        String blank = "";



        while (i < word.length()) {
            while (j < vowels.length()) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    blank += vowels.charAt(j);

                }
                j++;

            }
            j = 0;
            i++;

        }
        System.out.println(blank.charAt(0));

    }

}
