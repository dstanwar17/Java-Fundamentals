package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b){
            System.out.println("a is less than b");
        }

        // write your code below

        // less than or equal to
        if (a <= b) {
            System.out.println("a is less than or equal to b");
        }

        int c = 925;
        int d = 897;

        if (c > d) {
            System.out.println("c is greater than d");
        }
        if (c >= d) {
            System.out.println("c is greater than or equal to d");
        }

        int e = 85;
        int f = 85;

        if (e == f) {
            System.out.println("e is equal to f");

        }

        if (d != e) {
            System.out.println("d is not equal to e");
        }

    }

}

