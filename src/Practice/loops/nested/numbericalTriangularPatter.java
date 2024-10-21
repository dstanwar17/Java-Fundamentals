package Practice.loops.nested;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class numbericalTriangularPatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers of rows you want: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
