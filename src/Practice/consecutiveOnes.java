package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dstanwar17
 */
public class consecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,0,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1};

        int maxCount = 0;
        int count = 0;
                for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }
        System.out.println(maxCount);

    }
}
