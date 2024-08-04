package labs_examples.conditions_loops.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 to find the day of the week: ");
        int day = sc.nextInt();

        if (day <= 7) {
            if (day >= 1) {
                if (day == 1) {
                    System.out.println("It is Monday");
                } else if (day == 2) {
                    System.out.println("It is Tuesday");
                } else if (day == 3) {
                    System.out.println("It is Wednesday");
                } else if (day == 4) {
                    System.out.println("It is Thursday");
                } else if (day == 5) {
                    System.out.println("It is Friday");
                } else if (day == 6) {
                    System.out.println("It is Saturday");
                } else {
                    System.out.println("It is Sunday");
                }
            } else {
                System.out.println("Please enter a number between 1 to 7 to find the day of the week: ");
            }

        } else {
            System.out.println("Please enter a number between 1 to 7 to find the day of the week: ");
        }

    }
}
