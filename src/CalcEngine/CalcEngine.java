package CalcEngine;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class CalcEngine {
    public static void main(String[] args) {

        // Operating Calculations using If-Else Statements.

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
    }
}
