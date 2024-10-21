package Practice.pwClass;

/**
 * @author dstanwar17
 */
class Student {

    int rollNo;
    String studenName;

public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.studenName = "Devendra";
        System.out.println(s1.rollNo);
        System.out.println(s1.studenName);

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.studenName = "Shaivya";
        System.out.println(s2.rollNo);
        System.out.println(s2.studenName);
    }
}
