package Practice.loops.forloop;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class nNumbers {
    public static void main(String[] args) {
        // Take user input and print the natural numbers till n (provided by user)

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int sum = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
//            System.out.println(i);
        }
        System.out.println(sum);

        for (int i = n; i > 0; i--) {
            sum2 += i;
        }
        System.out.println(sum2);

//        Do While Loop example
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= n*10);

    }


}
