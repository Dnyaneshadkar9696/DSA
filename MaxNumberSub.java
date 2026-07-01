
public class MaxNumberSub{

    public static void main(String[] args){

        int[] arr = {2, 1, 5, 1, 3, 2};

        int k = 3;

        // so for the max sum of the window we want to print that max sum

        int windowSum = 0; // and the sum of elements in the window
        int maxSum = 0; // compare the max sum each time with the window sum
        int left = 0;  // starting

        for(int right = 0 ; right < arr.length; right++){

            windowSum += arr[right];

            if(right - left + 1 == k){
                
                if(maxSum < windowSum){
                    maxSum = windowSum;
                }
            

             windowSum = windowSum - arr[left]; // substract the last element from the window sum 
             // before moving further and then do left++;

             left++;
            }
        }

        System.out.println("The max Sum of the subarray is : " + maxSum);
    }
}