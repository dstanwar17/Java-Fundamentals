package Practice.Arrays;

/**
 * @author dstanwar17
 */
public class MultiDArrays {
    public static void main(String[] args) {
        int[][] someArray = new int[5][];

        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = new int[i * 2];
        }

        for (int i = 0; i < someArray.length; i++) {
            System.out.println("Size of sub array at index " + i + ": " + someArray[i].length);
        }
    }
}
