package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class practiceProblem {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + ",");
        }

        int a = 1;
        while (a < 4) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Number of columns: ");
        int columns = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();

        }

    }
}
