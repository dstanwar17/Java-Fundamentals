package Practice.loops.forloop;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class FindingLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find length of: ");
        String word = sc.nextLine();
        sc.close();

        int length = 0;

        for (int i = 0; i < word.length(); i++) {
            length = i+1;
        }
        System.out.println(length);

    }
}
