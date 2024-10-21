package Practice.loops.nested;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class numericalPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows you want in your pyramid: ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {  // Traversing over rows

//            print r-i spaces
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }

//            print 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
//            print i-1 to 1
            for (int l = i-1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }

    }
}
