package Practice.LetsSplit;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class LetsSplit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        double billAmount = sc.nextDouble();
        System.out.println("Enter transaction charges in percentage: ");
        double transactionCharge = (sc.nextDouble()) / 100;
        System.out.println("Enter tax rate: ");
        double taxRate = (sc.nextDouble()) / 100;

        TotalBill.TotalBill(billAmount, transactionCharge, taxRate);
        Split.Split(billAmount, transactionCharge, taxRate);


    }
}
