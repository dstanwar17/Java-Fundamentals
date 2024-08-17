package Practice.loops.forloop;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word you want to reverse: ");
        String word = sc.nextLine();

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(reversedWord);


    }



}
