package Practice;

/**
 * @author dstanwar17
 */
public class CalcEngine {
    public static void main(String[] args) {
        double val1;
        double val2;
        double result;
        char opCode;

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
