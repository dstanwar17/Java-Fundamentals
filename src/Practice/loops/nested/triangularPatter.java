package Practice.loops.nested;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class triangularPatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the triangular patter: ");
        int rows = sc.nextInt();

//        inverted triangle
        for (int i = rows; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//        normal triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

//        another way of printing inverted triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
