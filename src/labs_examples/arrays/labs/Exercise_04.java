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

        int[][] someArray = new int[5][];

        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = new int[i * 3];
            for (int j = 0; j < someArray[i].length; j++) {
                someArray[i][j] = (j * 3);
            }
        }
        for (int i = 0; i < someArray.length; i++) {
            for (int element : someArray[i]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
