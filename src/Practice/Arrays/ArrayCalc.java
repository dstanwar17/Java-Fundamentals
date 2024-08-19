package Practice.Arrays;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class ArrayCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to add: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Please enter the number " + (i+1));
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        System.out.println("The sum of the numbers is: " + sum);

    }
}
