package Practice.loops.whileloops;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * @author dstanwar17
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sqRoot = (int) sqrt(n);

        ArrayList<Integer> myList = new ArrayList<Integer>();


        sc.close();

        int i = 1;

        if (n == 2) {
            System.out.println(n + " is a prime number");
        } else if (n < 2) {
            System.out.println("Please enter a number greater than or equal to 2");
        } else{
            while (i <= sqRoot) {
                i++;
                myList.add(n % i);
                //i++;
            }
            System.out.println(myList);

            if (myList.contains(0)) {
                System.out.println(n + " is not a Prime number");
            } else {
                System.out.println(n + " is a Prime number");
            }
        }


    }
}
