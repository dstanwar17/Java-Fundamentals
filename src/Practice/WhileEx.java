package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class WhileEx {
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
