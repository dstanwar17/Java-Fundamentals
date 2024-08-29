package CalcEngine;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class SwitchCalcEngine {
    public static void main(String[] args) {

        // Operating Calculations using If-Else Statements without using block statement.

        double val1;
        double val2;
        double result = 0d;
        char opCode;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        val1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        val2 = sc.nextDouble();
        System.out.println("Enter the operator: ");
        opCode = sc.next().charAt(0);

       sc.close();

       switch(opCode) {
           case 'a':
               result = val1 + val2;
               break;
           case 's':
               result = val1 - val2;
               break;
           case 'd':
               result = (val1 != 0 || val2 != 0) ? val1 / val2 : 0.0d;
           case 'm':
               result = val1 * val2;
               break;
           default:
               System.out.println(0.0d);

       }
        System.out.println(result);

    }
}
