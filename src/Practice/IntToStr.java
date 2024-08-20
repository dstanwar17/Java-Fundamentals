package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class IntToStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        String s = Integer.toString(n);
        System.out.println(s);

    }
}
