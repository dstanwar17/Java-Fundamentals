package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

//        System.out.println("Enter number 1: ");
//        numbers[0] = sc.nextInt();
//        System.out.println("Enter number 2: ");
//        numbers[1] = sc.nextInt();
//        System.out.println("Enter number 3: ");
//        numbers[2] = sc.nextInt();
//        System.out.println("Enter number 4: ");
//        numbers[3] = sc.nextInt();
//        System.out.println("Enter number 5: ");
//        numbers[4] = sc.nextInt();
//        System.out.println("Enter number 6: ");
//        numbers[5] = sc.nextInt();
//        System.out.println("Enter number 7: ");
//        numbers[6] = sc.nextInt();
//        System.out.println("Enter number 8: ");
//        numbers[7] = sc.nextInt();
//        System.out.println("Enter number 9: ");
//        numbers[8] = sc.nextInt();
//        System.out.println("Enter number 10: ");
//        numbers[9] = sc.nextInt();

        for (int j = 0; j < 10; j++) {
            System.out.println("Please enter " +(j+1)+ " number: "); // How can I make i here to increase from 1 onwards rather than 0?
            numbers[j] = sc.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        int sumNumbers = 0;
        int avgNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumNumbers += numbers[i];
        }
        System.out.println("Sum of numbers: " + sumNumbers);
        avgNumbers = sumNumbers / numbers.length;
        System.out.println("Average of numbers: " + avgNumbers);
    }

}