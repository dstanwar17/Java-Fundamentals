package Practice.loops.nested;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" "); //Print Spaces before printing the number
            }

            for (int k = 1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==rows){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
