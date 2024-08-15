package Practice.loops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class ReverseStr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number you want to reverse: ");
        String s = sc.nextLine();
        sc.close();
        int n = s.length();
//        System.out.println(n);

        String reversestr = "";
        while (n > 0) {
            reversestr = reversestr + s.charAt(n-1);
            n--;
        }
        System.out.println(reversestr);

    }
}
