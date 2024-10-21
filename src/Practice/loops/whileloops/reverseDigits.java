package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class reverseDigits {
    public static void main(String[] args) {

        // Reverse the digits of given user input; i.e. if user enters 12345; then the output should be 54321.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        String reversed = "";
        int counter = 0;
        int i = number;

//      First way of using string and modulus operator
        while (i > 0) {
            reversed = reversed + i % 10;
            i = i / 10;
            counter++;
        }
        System.out.println(reversed);

//        Second or alternate way of finding reverse digit

        System.out.println("Enter second number: ");
        int n = sc.nextInt();
        int ans = 0;
        int n2 = n;


        while (n2 > 0) {
            System.out.println(n2);
            ans = (ans * 10) + (n2 % 10);
            n2 = n2/10;
        }
        System.out.println(ans);

    }
}
