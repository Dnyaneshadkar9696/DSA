
// here we want to find the maximum sum of sub array k

// the array is for example like 
//Given an integer array and an integer k, find the maximum sum of any 
// contiguous subarray of size k.

public class MaxiSubArray{

public class MaximumSumSubarray {

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int maxSum = findMaxSum(nums, k);

        System.out.println("Maximum Sum = " + maxSum);
    }

    public static int findMaxSum(int[] nums, int k) {

        // Stores the sum of the current window
        int windowSum = 0;

        // Stores the maximum sum found so far
        int maxSum = 0;

        // Left pointer of the window
        int left = 0;

        // Right pointer moves through the array
        for (int right = 0; right < nums.length; right++) {

            // Step 1: Include the current element in the window
            windowSum += nums[right];

            // It is the windowSum = windowSum + nums[right]; // this is short form of this
            

            // Step 2: Check if the window size becomes exactly k
            if (right - left + 1 == k) {

                // Step 3: Update maximum sum if needed
                maxSum = Math.max(maxSum, windowSum);

                // Step 4: Remove the leftmost element
                // because the window is going to slide
                windowSum -= nums[left];

                // Step 5: Move the left pointer forward
                left++;
            }
        }

        return maxSum;
    }
}
}