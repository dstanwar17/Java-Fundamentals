package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int length = str.length();
        System.out.println(length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean equals = str.equalsIgnoreCase(str2);
        System.out.println(equals);

        // please concatenate str & str2 and set the result to a new String variable below

        String str3 = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        System.out.println(str3.substring(1,4));
        System.out.println(str3.replace('h', 'b'));
        System.out.println(str3.contains("Hello"));

        // Additional Fundamental Java exercises on Arithmetic Operators
        int a = 5000;
        int b = 3000;
        System.out.println(a ^ b);
        System.out.println(a | b);

        String result = a > b ? "A is greater than B" : "A is less than B";
        System.out.println(result);

    }


}