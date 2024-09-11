package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in your Pyramid: ");
        int n = sc.nextInt();



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
