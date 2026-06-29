package CodingPattern;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PointerSecond {

	// now we want all the zero at the right side and all the one at the left side

	public void calling() {

		System.out.println();
		this.moveAllZero();

		System.out.println();
		this.removeDuplicate();

		System.out.println();
		this.myCollectionTry();

		System.out.println();
		this.reverseChararray();
		
		System.out.println();
		this.checkStirngPalindrome();
		
		System.out.println();
		this.targetTwo();

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

		System.out.println("Sorted array is : " + java.util.Arrays.toString(arr1));

	}

	public void FirstQuestion() {

		// we have to find the largest length palindrome from the array

		String[] arr = { "racecar", "level", "hello", "madam", "world" };

		String longest = "";

		for (int i = 0; i < arr.length; i++) {

			// it will give one one element to me

			String element = arr[i];

			boolean isPalindrome = true;

			int start = 0;
			int end = element.length() - 1;

			while (start < end) {

				if (element.charAt(start) != element.charAt(end)) {
					isPalindrome = false;
					break;
				}
				start++;
				end--;
				// if it is not palindrome move forward.
			}

			if (isPalindrome && element.length() > longest.length()) {
				longest = element;
			}
		}

		System.out.println("Longest String Palindrome: " + longest);
	}

	public void moveAllZero() {

		int[] input = { 0, 1, 0, 3, 12 };

		int write = 0; // left and right we have to store the index

		// write is the position where the next non zero element should go

		// we can use the for loop or like the wile loop for this two pointer approach

		for (int read = 0; read < input.length; read++) {

			if (input[read] != 0) {

				int temp = input[read];
				// we swap the read and write

				input[read] = input[write];
				input[write] = temp;

				write++;
				// for 0 0 condition it will now come in the if block only
			}

		}

		System.out.println(java.util.Arrays.toString(input));
	}

	public void removeDuplicate() {

		// remove the duplicated from the sorted array

		int[] arrsort = { 1, 1, 2, 2, 3, 4, 4 };

		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < arrsort.length; i++) {

			s.add(arrsort[i]);

		}

		System.out.println(s);
		;

	}

	public void myCollectionTry() {

		int[] tryfirstExample = { 1, 0, 1, 0, 1, 1 };

		int write = 0;

		// all zeros to the left and all the 1 to the right

		for (int read = 0; read < tryfirstExample.length; read++) {

			// use the read write swap method

			if (tryfirstExample[read] == 0) {

				int temp = tryfirstExample[read];
				tryfirstExample[read] = tryfirstExample[write];
				tryfirstExample[write] = temp;
				write++;
			}

		}

		System.out.println(java.util.Arrays.toString(tryfirstExample));
	}

	// reverse the character array using the two pointers

	public void reverseChararray() {

		char[] ac = { 'h', 'e', 'l', 'l', 'o' };

		// we have to print is reverse

		int start = 0;

		int end = ac.length - 1;

		while (start < end) {

			char temp = ac[end];
			ac[end] = ac[start];
			ac[start] = temp;

			start++;
			end--;
		}

		System.out.println(java.util.Arrays.toString(ac));

	}
	
	
	// check if the string is palindrome
	
	public void checkStirngPalindrome() {
		
		String exp = "racecar";
		
		int start = 0 ;
		
		int end = exp.length() - 1;
		boolean check = true;
		
		for(int i = 0 ; i< exp.length(); i++) {
			
			// do while loop instead of the for loop to check the string is palindrome or not
			
			if(exp.charAt(start) == exp.charAt(end)) {
				break;
			}else {
				check = false;
			}
		}
		
		if(check) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
	}
	
	
	
	// find two numbers in the array whose two numbers sum is equals to the target
	
	public void targetTwo() {
		
		int[] numbers = { 2,7,11,15 };
		
		int target = 9;
		
		
		int start = 0;
		
		
		for(int end =1; end < numbers.length ; end++) {
			
			
			if((numbers[start] + numbers[end]) == target) {
				System.out.println(numbers[start]+ " "+numbers[end]);
				break;
			}
			
			start++;
		}
		
		
		
		
		
	}

}
