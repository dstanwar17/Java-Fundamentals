package Practice.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want in the pyramid: ");
        int n = sc.nextInt();

        String space = " ";
        String star = "*";

        for (int i = 1; i < n; i++) {
            System.out.println(space.repeat(n-i) + star.repeat((2*i)-1));
        }

        System.out.println("--------------- Ascending Pattern ---------------");

        for (int i = 0; i < n; i++) {
            System.out.println(star.repeat(i));
        }

        System.out.println("--------------- Descending Pattern ---------------");

        for (int i = 0; i < n; i++) {
            System.out.println(star.repeat(n-i));
        }

    }
}
