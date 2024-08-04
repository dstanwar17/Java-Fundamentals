package Practice.loops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */

// Using For loop, count the number of vowels
public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word for which you need vowel count: ");
        String word = sc.nextLine();
        String vowels = "aeiou";
        word = word.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (word.charAt(i) == vowels.charAt(j)) {
                    vowelCount++;
                }
            }
        }
        System.out.println(vowelCount);
    }
}
