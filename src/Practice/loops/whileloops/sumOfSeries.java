package Practice.loops.whileloops;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class sumOfSeries {
    public static void main(String[] args) {

//        Find the sum of series; i.e. S = 1 - 2 + 3 - 4 .....n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int ans =0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                ans -= i;
            }
            else
            {
                ans += i;
            }
        }
        System.out.println(ans);

    }
}
