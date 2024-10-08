package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] someArray = new int[5][5];
        int value = 1;
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < someArray[i].length; j++ ) {
                someArray[i][j] = value * 3;
                value++;
                System.out.print(someArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
