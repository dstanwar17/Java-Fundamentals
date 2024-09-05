package Practice.LetsSplit;

import java.util.Scanner;


/**
 * @author dstanwar17
 */
public class Split {

    static void Split(double billAmount, double transactionCharge, double taxRate ) {
        double result = TotalBill.TotalBill(billAmount, transactionCharge, taxRate);
        System.out.println("Do you want to split the bill? (Y/N)");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();

        if (choice.toLowerCase().equals("y")) {
            System.out.println("Split the bill in how many people? ");
            int people = sc.nextInt();

            sc.nextLine();
            System.out.println("Split the bill equally or custom split? Enter e or c for Equally or Custom split. ");
            String splitChoice = sc.nextLine();
            if (splitChoice.toLowerCase().equals("e")) {
                double eachPay = result  / people;
                System.out.println("Each Person should pay: $" + eachPay);
            }
            else {
                System.out.println("Please split offline. Your total bill is: " + result);
                }
            }
        else{
            System.out.println("Your total bill is: " + result);
        }
    }
}
