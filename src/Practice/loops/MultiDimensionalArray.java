package Practice.loops;

import java.util.Arrays;

/**
 * @author dstanwar17
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] arr = new int[54][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * j;
                System.out.print(arr[i][j] + " \\_/ ");

            }
            System.out.println();
        }
    }
}
