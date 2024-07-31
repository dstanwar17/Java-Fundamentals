package Practice;

import java.util.Scanner;

/**
 * @author dstanwar17
 */
public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String mood = "How is Shaivya's Mood? Select from bad, good, periods, not responding, asleep";
        System.out.println(mood);
        String moodNow = sc.nextLine();
        moodNow = moodNow.toLowerCase();

        switch (moodNow) {

            case "bad":
                System.out.println("She is in bad mood..... She will eat you alive like a dragon");
                break;
            case "good":
                System.out.println("Live this moment, till she is happy.... like Kashmir's weather she is unpredictable");
                break;
            case "periods":
                System.out.println("Run and save your life.... if caught, your soul will be sent to purgatory");
                break;
            case "not responding":
                System.out.println("You are doomed!!!! God can't save you either...");
                break;
            case "asleep":
                System.out.println("Don't wake the devil.... live while you can");
                break;


        }
    }
}
