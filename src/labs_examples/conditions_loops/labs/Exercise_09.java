package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                break;
            } else {
                System.out.println(i + " is not even");
            }
        }
    }
}
