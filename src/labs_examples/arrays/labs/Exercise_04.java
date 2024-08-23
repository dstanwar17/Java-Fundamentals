package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {

        int[][] someArray = new int[5][3];

        int value = 1;

        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++) {
                someArray[i][j] = value * 2;
                value++;
                System.out.print(someArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        int[][] oneMoreArray = new int[7][9];
        for (int i = 0; i < oneMoreArray.length; i++) {
            for (int j = 0; j < oneMoreArray[i].length; j++) {
                oneMoreArray[i][j] = value * 3;
                value++;
                System.out.print(oneMoreArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
