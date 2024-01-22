package validpalindrome;

// 125. Valid Palindrome
// Easy
// 519 likes // 1449 dislikes //

// Given a string, determine if it is a palindrome, considering only alphanumeric characters
// and ignorint cases.

// Note: For the purpose of this problem, we define empty string as valid palindrome.

// Example 1:
// Input: "A man, a plan, a canal: Panama"
// Output: true

// Example 2:
// Input: "race a car"
// Output: false

public class Solution {
	
	// This solution is kinda slow though	
	public boolean isPalindrome(String s) {
		
		String fixed_string = "";
		
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				fixed_string += c;
			}
		}
		
		fixed_string = fixed_string.toUpperCase();
		
		int a_pointer = 0;
		int b_pointer = fixed_string.length()-1;
		
		while (a_pointer <= b_pointer) {
			if (fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)) {
				return false;
			}
			a_pointer += 1;
			b_pointer -= 1;
		}
		
		return true;
	}
	
	
	public boolean isPalindromeOptimized(String s) {
	    int left = 0;
	    int right = s.length() - 1;

	    while (left < right) {
	        if (!Character.isLetterOrDigit(s.charAt(left))) {
	            left++;
	            continue;
	        }
	        if (!Character.isLetterOrDigit(s.charAt(right))) {
	            right--;
	            continue;
	        }

	        if (Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) {
	            return false;
	        }

	        left++;
	        right--;
	    }

	    return true;
	}

	public static void main(String[] args) {
	    Solution solution = new Solution();
	    String[] testCases = {"A man, a plan, a canal: Panama", "race all cars", "A", "abcba", "abccba"};
	    for (String testCase : testCases) {
	        boolean originalResult = solution.isPalindrome(testCase);
	        boolean optimizedResult = solution.isPalindromeOptimized(testCase);
	        System.out.println("Original solution: " + originalResult);
	        System.out.println("Optimized solution: " + optimizedResult);
	        System.out.println();
	    }
	}

}
