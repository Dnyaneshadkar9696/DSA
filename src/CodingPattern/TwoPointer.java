package CodingPattern;

public class TwoPointer {
	
	public static void main(String[] args) {
		
		// we have a array and we have to move all the zero to the left and 1 to the right
		
		int[] arr = {1, 0, 1, 0, 0, 0, 1, 1 ,1};
		
		int left = 0; // i want the left and right to store the index not the value.
		
		int right = arr.length -1; // and the end we set the index as the pointers
		
		while(left < right) {
			
			// as left is 0 1 2 and right will be like 5 4 3 and when the left is big so the point is met
			
			// condition to check if the value in he arr left is zero so move left 
			
			if(arr[left] == 0) {
				left++;
			}
			else if(arr[right] == 1) {
				right--; // it is walking behind not in the forward direction
			}
			else {
				// if at left we got the 1 and right 0 so both are stuck , at this point we swap them 
				// and for swaping in java we use the temp variable
				int temp = arr[left];  // here we basically swap their positions.
				arr[left] = arr[right];
				arr[right] = temp;
				
				// we swap the values 
			}
			
			// now if we print the array we will get the array required as per us and in the time complexity of O(n)
			
			
		}
		
		System.out.println(java.util.Arrays.toString(arr));
		
		
		
	}

}
