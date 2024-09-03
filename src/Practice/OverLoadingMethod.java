package Practice;

/**
 * @author dstanwar17
 */
public class OverLoadingMethod {
    public static void main(String[] args) {
        System.out.println(addition(2,3));
        System.out.println(addition(2,3, 4));
        System.out.println(addition(2.0, 3.0, 4.0, 5.0));
    }

    static int addition(int a, int b) {
        return a + b;
    }

    static int addition(int a, int b, int c) {
        return a + b + c;
    }
    static int addition(double a, double b, double c, double d) {
        return (int) (a + b + c + d);
    }
}
