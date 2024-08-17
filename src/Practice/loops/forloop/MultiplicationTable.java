package Practice.loops.forloop;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication table of: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + (n * i));
        }

        sc.close();
    }
}
