package CalcEngine;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class CalcEngine {
    public static void main(String[] args) {

        // Operating Calculations using If-Else Statements without using block statement.

        double val1;
        double val2;
        double result;
        char opCode;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        val1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        val2 = sc.nextDouble();
        System.out.println("Enter the operator: ");
        opCode = sc.next().charAt(0);


        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'm')
            result = val1 * val2;
        else if (opCode == 'd')
            result = val1 / val2;
        else
            result = 0.0d;

        System.out.println(result);

        // Operating Calculations using If-Else Statements using block statement.

        double val3;
        double val4;
        double result2;
        char opCode2;

        System.out.println("Enter the third number: ");
        val3 = sc.nextDouble();
        System.out.println("Enter the fourth number: ");
        val4 = sc.nextDouble();
        System.out.println("Enter the new operator: ");
        opCode2 = sc.next().charAt(0);

        sc.close();


        if (opCode2 == 'a') {
            result2 = val3 + val4;
        }
        else if (opCode2 == 's') {
            result2 = val3 - val4;
        }
        else if (opCode2 == 'm') {
            result2 = val3 * val4;
        }
        else if (opCode2 == 'd') {
            result2 = val3 / val4;
        }
        else {
            result2 = 0.0d;
        }
        System.out.println(result2);

    }
}
