package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        byte byteVal = 8;
        System.out.println("byteVal is: " + byteVal);

        short shortVal = 8;
        System.out.println("shortVal is: " + shortVal);

        char charVal = 'A';
        System.out.println("charVal is: " + charVal);

        long longVal = 8000000000000000000l;
        System.out.println("longVal is: " + longVal);

        float floatVal = 8.5f;
        System.out.println("floatVal is: " + floatVal);

        double doubleVal = 8.5;
        System.out.println("doubleVal is: " + doubleVal);

        boolean success = true;
        System.out.println("Success is: " + success);

    }

}
