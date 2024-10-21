package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class factorialNumbers {
    public static void main(String[] args) {

//        Find the factorial number for given input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find Factorial of: ");
        int n = sc.nextInt();
        int ans = 1;

        for(int i = 1; i <= n; i++) {
            ans *= i;
            System.out.println("The Factorial of " + i + " is " + ans);
        }
        System.out.println(ans);

    }
}
