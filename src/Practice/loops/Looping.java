package Practice.loops;

/**
 * @author dstanwar17
 */
public class Looping {

//  Creating the multiplication tables using while loop
    public static void main(String[] args) {
        int innerCount = 1;
        int outerCount = 1;

//        while (outerCount < 11) {
//            while (innerCount < 11) {
//                System.out.println(outerCount + " x " + innerCount + " = " + innerCount * outerCount);
//                innerCount++;
//
//            }
//            innerCount = 1;
//            outerCount++;
//        }

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }

        }

        int p = 10;
        int q = 20;
        p += q;
        System.out.println(p);

        int a = 4, b = 3, c = 2;
        int sum = a-++c-++b; // 4 - (++2) - (++3) => 4 - 3 - 4
        System.out.println(sum);
        System.out.println("abc" + 4 + 2);
        System.out.println(4 + 2 + "abc");
    }
}
