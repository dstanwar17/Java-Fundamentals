package Practice.Arrays;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class SummingNumbers {
    public static void main(String[] args) {
        int [] someArray = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        // Summing the numbers in the array using traditional for loop

        for (int i = 0; i < someArray.length; i++) {
            sum += someArray[i];
        }
        System.out.println("Using the Traditional for loop, sum of all the numbers in the someArray is " + sum);

        int j = 0;
        int sum2 = 0;
        while (j < someArray.length) {
            sum2 += someArray[j];
            j++;
        }
        System.out.println("Using the while loop, sum of all the numbers in the someArray is " + sum2);

        int sum3 = 0;
        for (int k : someArray) {
            sum3 += k;
        }
        System.out.println("Using the enhanced for loop, sum of all the numbers in the someArray is " + sum3);

    }
}