
import java.util.*;

public class AverageSlideW {

    public static void main(String[] args) {

        int[] arrs = {1, 3, 2, 6, -1, 4, 1, 8, 2};

        int k = 5;

        ArrayList<Double> ar = new ArrayList<>();

        int windowSum = 0; // sum of all the elements in the window

        int left = 0;

        for (int right = 0; right < arrs.length; right++) {

            windowSum += arrs[right];

            // the count will go till it reaches to the final value that is k
            if (right - left + 1 == k) {

                // here left is always zero , just when the right reach the index 4 so we add one and then it equals to the k
                double avg = (double) windowSum / k;

                ar.add(avg);

                windowSum -= arrs[left];

                left++;

            }
        }

        System.out.println(ar);

    }
}
