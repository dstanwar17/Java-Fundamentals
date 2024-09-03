package Practice;


import videos_source_code.classes.Person;

/**
 * @author dstanwar17
 */


public class PassByRef {
    public static void main(String[] args) {
        Person Devendra = new Person(36, 181, "Devendra");
        Person Shaivya = new Person(35, 168, "Shaivya");
        System.out.println(Devendra.toString());
        System.out.println(Shaivya.toString());

        increaseAge(Devendra);
        increaseAge(Shaivya);

        System.out.println(Devendra.toString());
        System.out.println(Shaivya.toString());
    }

    public static void increaseAge(Person person) {
        person.age = person.age + 1;
    }
}
