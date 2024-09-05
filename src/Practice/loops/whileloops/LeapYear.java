package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isLeapYear = false;

        while (!isLeapYear) {
            System.out.println("Enter a year: ");
            int year = new Scanner(System.in).nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        System.out.println("It is a Leap Year");

        String password = "Devsin@2517";
        int i = 0;
        while (i < 4) {
            System.out.println("Please enter your password: ");
            String pass = new Scanner(System.in).nextLine();
            if (!pass.equals(password)) {
                System.out.println("Passwords do not match. Please enter again");
            } else {
                System.out.println("You are logged in! ");
                break;
            }
            i++;
            sc.close();
        }

    }
}
