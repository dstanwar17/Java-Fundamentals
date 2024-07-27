package labs_examples.datatypes_operators.labs;

import java.sql.SQLOutput;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below
        // AND

        if (a & b){
            System.out.println("In 'a & b' either of the condition is false");
        }

        // Short Circuit AND
        if (a && b){
            System.out.println("In 'a && b' either of the condition is false");
        }

        // Short Circuit OR
       if (a || b){
           System.out.println("Unlike regular OR, in this it will evaluate second condition only if first condition is false");
       }


        // XOR
        if (a ^ b){
            System.out.println("One of the condition to be false and other one true for printing the output");
        }

        // NOT
        if (a && !b) {
            System.out.println("a is true and b is false");
        }

    }

}

