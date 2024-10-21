package Practice.loops.nested;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class rectangularPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the rectangular pattern: ");
        int r = sc.nextInt();
        System.out.println("Enter the columns of the rectangular pattern: ");
        int c = sc.nextInt();

//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
