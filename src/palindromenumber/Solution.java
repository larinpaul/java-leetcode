package palindromenumber;

public class Solution {
	// 9 . Palindrome Number
	// Easy 
	
	// Determine whether an integer is a palindrome. And integer is a palindrome when it reads the same
	// backward as forward.
	
	// Example 1:
	// Input: 121
	// Output: true
	
	// Example 2:
	// Input: -121
	// Output: false
	// Explantion: From left to right, it reads - 121. From right to left, it
	// becomes 121-. Therefore it is not a palindrome.
	
	// Example 3:
	// Input: 10
	// Output: false
	// Explanation: Reads 01 from right to left. Therefore it is not a
	// palindrome.
	
	
	public boolean isPalindrome(int x) {
		if (x == 0) {
			return true;
		}
		
		if (x < 0 || x % 10 == 0) {
			return false;
		}
		
		int reversed_int = 0;
		while(x > reversed_int) {
			int pop = x % 10;
			x /= 10;
			
			reversed_int = (reversed_int * 10) + pop;
		}
		
		if (x == reversed_int || x == reversed_int / 10) {
			return true;
		} else {
			return false;
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
