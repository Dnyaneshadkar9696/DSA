
import java.util.*;

public class MaxElemWindow {

    public static void main(String[] args) {

        // example of the max window is 
        int[] arrmax = {1, 3, -1, -3, 5, 3, 6, 7};

        ArrayList<Integer> ari = new ArrayList<>();

        int k = 3;

        // take the three elements and find which number greater in those three and add that element in the arraylist
        int max = 0; // the max element of the window

        int left = 0;

        for (int right = 0; right < arrmax.length; right++) {

            if (right - left + 1 == k) {

                // once the window reaches the its size then 
                max = arrmax[left];

                // agin do the for loop that will run from the left to right to the window
                for (int i = left; i <= right; i++) {

                    if (arrmax[i] > max) {
                        max = arrmax[i];

                        
                    }

                }

                ari.add(max);
                // add it to our window 

                left++; // the left ++ slides the window forward
            }

        }

        System.out.println(ari);

        // The timecomplexity for this problem is O(n*i)

    }

}
