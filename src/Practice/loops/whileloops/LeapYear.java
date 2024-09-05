package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class LeapYear {
    public static void main(String[] args) {

        boolean isLeapYear = false;

        while (!isLeapYear) {
            System.out.println("Enter a year: ");
            int year = new Scanner(System.in).nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        System.out.println("It is a Leap Year");

    }
}
