package Practice.loops.whileloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class GCD {
    public static void main(String[] args) {
        // We need to find the GCD of two numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        ArrayList<Integer> aDivisors = new ArrayList<>();
        ArrayList<Integer> bDivisors = new ArrayList<>();

        int i = 1;
        int j = 1;

        while (i <= a) {
            if (a % i == 0) {
                aDivisors.add(i);
            }
            i++;
        }
        while (j <= b) {
            if (b % j == 0) {
                bDivisors.add(j);
            }
            j++;
        }
        aDivisors.retainAll(bDivisors);

        if (aDivisors.size() > 0) {
            System.out.println("The GCD of " + a + " and " + b + " is " + Collections.max(aDivisors));
        } else {
            System.out.println("No Common Factor found.");
        }


    }


}

