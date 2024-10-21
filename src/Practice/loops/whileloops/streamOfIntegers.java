package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class streamOfIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer 1: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != -1) {
            sum += n;
            n = sc.nextInt();
        }
        System.out.println("The sum is: " + sum);


//      Solving the same problem using do while loop and using break statement

        System.out.println("Enter an integer 2: ");
        int n2 = sc.nextInt();
        int sum2 = 0;

        do {
            sum2 += n2;
            n2 = sc.nextInt();

            if (n2 == -1) {
                break;
            }
        } while (n2 != -1);

        System.out.println(sum2);

        sc.close();

    }
}
