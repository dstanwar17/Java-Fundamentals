package Practice.loops.forloop;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * @author dstanwar17
 */
public class PrimeNumbers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        ArrayList<Integer> myList = new ArrayList<Integer>();
        sc.close();

        int sqRoot = (int) sqrt(n);

        for (int i = 2; i <= sqRoot; i++) {
            myList.add(n % i);
        }
 //       System.out.println(myList);

        if (myList.contains(0)) {
            System.out.println(n + " is not a Prime number");
        } else {
            System.out.println(n + " is a Prime number");
        }


    }
}
