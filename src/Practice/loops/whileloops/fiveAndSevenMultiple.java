package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class fiveAndSevenMultiple {
    public static void main(String[] args) {

        // Take the user input and print n numbers which are multiple of 5 and 7

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers you want to see that" +
                " are multiple of 5 and 7: ");

        int n = sc.nextInt();
        sc.close();

        int counter = 0;
        int i = 1;
        while (counter < n) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i + " is a multiple of 5 and 7");
                counter++;
            }
            i++;
        }

        // Another way of doing it using break key word

        int j = 1;
        int counter2 = 0;

        while (true) {
            if (j % 5 == 0 && j % 7 == 0) {
                System.out.println("The number " + j + " is a multiple of 5 and 7");
                counter2++;
                if (counter2 == n) {
                break;
                }
            }
            j++;
        }



    }
}
