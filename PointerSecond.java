package CodingPattern;

public class PointerSecond {

	// now we want all the zero at the right side and all the one at the left side
	
	
	public void calling() {
		
		this.moveAllZero();
		
		
	}

	public void secondQuesion() {

		int[] arr1 = { 1, 0, 1, 1, 0, 1, 1 };

		int left = 0;
		int right = arr1.length - 1;

		while (left < right) {

			if (arr1[left] == 1) {
				left++;
			} else if (arr1[right] == 0) {
				right--;
			} else {
				// and if you got 0 at right side and 1 at left side then swap
				int temp = arr1[left];
				arr1[left] = arr1[right];
				arr1[right] = temp;
			}
		}
		
		System.out.println("Sorted array is : "+java.util.Arrays.toString(arr1));

	}
	
	
	public void FirstQuestion() {
		
		//we have to find the largest length palindrome from the array
		
		String[] arr = {"racecar", "level", "hello", "madam", "world"};
		
		String longest = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			// it will give one one element to me
			
			String element = arr[i];
			
			boolean isPalindrome = true;
			
			int start = 0; 
			int end = element.length() - 1;
			
			while(start < end) {
				
				if(element.charAt(start) != element.charAt(end)) {
					isPalindrome = false;
					break;
				}
				start++;
				end--;
				// if it is not palindrome move forward.
			}
			
			if(isPalindrome && element.length() > longest.length()) {
				longest = element;
			}
		}
		
		System.out.println("Longest String Palindrome: "+ longest);
	}
	
	
	
	public void moveAllZero() {
		
		int[] input = {0,1,0,3,12};
		
		int write = 0;  // left and right we have to store the index
		
		
		// we can use the for loop or like the wile loop for this two pointer approach
		
		for(int read = 0; read < input.length; read++) {
			
			if(input[read] != 0) {
				int temp = input[read];
				input[read] = input[write];
				input[write] = temp;
				
				write++;
			}
			
		}
		
		
		
		System.out.println(java.util.Arrays.toString(input));
	}

}
