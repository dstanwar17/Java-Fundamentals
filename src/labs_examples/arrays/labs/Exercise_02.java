package labs_examples.arrays.labs;

import java.util.Scanner;
import java.util.Arrays;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 10 for which you want to know the index: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < array.length; i++) {

            if (num == array[i]) {
                System.out.println("Index of " + num + " is : " + i);
            }
        }


    }
}