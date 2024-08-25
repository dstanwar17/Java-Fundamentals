package labs_examples.arrays.labs;

import java.util.ArrayList; // We need to import this library before we can use the ArrayList and its associated methods.

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<String> someList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            someList.add("a".repeat(i*3));
            System.out.println(someList);
        }

        System.out.println(someList.size());

        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }
}
