package Practice;
import java.util.ArrayList;

/**
 * @author dstanwar17
 */
public class MyAL {
    public static void main(String[] args) {
        ArrayList<String> someString = new ArrayList();

        someString.add("Hello");
        someString.add("World");
        someString.add("!");
        someString.add("I");
        someString.add("Love");
        someString.add("Programming");
        someString.add("!!!");
        someString.add(".");
        someString.add("Phew");
        someString.add("ufff");
        someString.add("ufff");
        someString.add("ufff");
        someString.add("ufff");
        someString.add("ufff");
        someString.add("ufff");


        someString.contains("Love");
        someString.remove("!!!");
        System.out.println(someString);
        System.out.println(someString.size());
        System.out.println(someString.indexOf("ufff"));
        System.out.println(someString.get(12));
        System.out.println(someString.clone());
//        System.out.println(someString.iterator());


        someString.clear();
        System.out.println(someString);
        System.out.println(someString.isEmpty());


        ArrayList<Integer> someInt = new ArrayList();
        someInt.add(1);
        someInt.add(4);
        someInt.add(10);
        someInt.add(11);
        someInt.add(12);
        someInt.add(5);
        someInt.add(6);
        someInt.add(7);
        someInt.add(2);
        someInt.add(3);
        someInt.add(8);
        someInt.add(9);

        System.out.println(someInt);
        someInt.sort((a, b) -> a - b);
        System.out.println(someInt);
        someInt.sort((a, b) -> b -a);
        System.out.println(someInt);
        someInt.sort((a, b) -> a - b);
        System.out.println(someInt);

    }
}
