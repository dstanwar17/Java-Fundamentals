package Practice.LetsSplit;

/**
 * @author dstanwar17
 */
public class TotalBill {

    public static double TotalBill(double billAmount, double transactionCharge, double taxRate) {
        double transactionCharges = transactionCharge * billAmount;
        double tax = taxRate * billAmount;
        double result = transactionCharges + tax + billAmount;
        return result;
    }
}
