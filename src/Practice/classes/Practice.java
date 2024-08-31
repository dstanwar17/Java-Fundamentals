package Practice.classes;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * @author dstanwar17
 */
public class Practice {
    public static void main(String[] args) {
        getCurrentTime();
    }

    public static void getCurrentTime() {
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("Today, it is " + date + " & the current time is : " + time);
    }

}
