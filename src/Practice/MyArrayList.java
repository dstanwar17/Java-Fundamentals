package Practice;
import java.util.ArrayList;

/**
 * @author dstanwar17
 */
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add("!");
        list.add(" I love Programming.");


        list.clear();
        System.out.println(list);

        if (!list.isEmpty()) {
            for (String s : list) {
                System.out.print(s + " ");
            }
        }

    }
}
