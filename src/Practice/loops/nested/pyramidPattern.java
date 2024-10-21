package Practice.loops.nested;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class pyramidPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows you want in your pyramid: ");
        int r = sc.nextInt();

//        for (int i = 1; i <= r; i++) {  // Traversing over rows
//
////            print r-i spaces
//            for (int j = 1; j <= r - i; j++) {
//                System.out.print(" ");
//            }
//
////            print 2*i - 1
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();

//        Printing an inverted triangle

            for (int i = r; i > 0; i--) {  // Traversing over rows
                for (int j = 1; j <= r - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }

