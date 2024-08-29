package CalcEngine;

/**
 * @author dstanwar17
 */
public class LetsGetLogical {
    public static void main(String[] args) {

        int students = 150;
        int rooms = 0;

        // Single & works more like either or rather than ensuring both conditions are met.
        /*
        '&' is a bitwise AND operator whereas '&&' is a logical AND operator. "&&" ensures that both conditions must be
        true. So in case first condition is false, it will not proceed further to check second condition.
        Whereas "&" forces both conditions to be evaluated regardless of whether first condition is false or not.
        In the Below code, if we use "&" it will check both conditions and then will give the division by zero error
        as 30 can't be divided by ZERO. where as && would have exited from the condition as soon as first condition wasnt
        met.
         */


        if (rooms != 0 && students/rooms > 30)
            System.out.println("You are over 30 students and it is crowded!!!");

        System.out.println(" ");
        System.out.println("*** End of the Program ***");

    }
}
