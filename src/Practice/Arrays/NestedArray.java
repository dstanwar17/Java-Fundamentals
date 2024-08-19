package Practice.Arrays;

/**
 * @author dstanwar17
 */
public class NestedArray {
    public static void main(String[] args) {
        int[][] firstArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                System.out.print((firstArray[i][j] = i * j) + " ");

            }
            System.out.println();
        }
//        for (int i = 0; i < someArray.length; i++) {
//            for (int j = 0; j < someArray[i].length; j++) {
//                System.out.print(someArray[i][j] + " ");
//            }
//            System.out.println(); // Move to the next line after each row
//        }
    }
}
