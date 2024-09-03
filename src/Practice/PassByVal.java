package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class PassByVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter the second number: ");
        int b = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        someMethod(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void someMethod(int a, int b) {
        a = a * 20;
        System.out.println(a);
        b = b * 40;
        System.out.println(b);
    }
}
