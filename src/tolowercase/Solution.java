package tolowercase;

public class Solution {

	// 709. To Lower Case
	// Easy
	
	// Implement function ToLowerCase() that has a strong parameter str,
	// and returns the same string to lowercase.
	
	// Example 1:
	// Input: "Hello"
	// Output: "hello"
	
	// Example 2:
	// Input: "here"
	// Output: "here"
	
	// Example 3:
	// Input: "LOVELY"
	// Output: "lovely"
	
	// Cheesy solution
	public String toLowerCaseEasy(String str) {
		return str.toLowerCase();
	}
	
	// Slow solution
	public String toLowerCaseSlow(String str) {
		String result = "";
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				result = result + (char)(c + 32);
			} else {
				result = result + c;
			}
		}
		
		return result;		
	}
	
	// StringBuilder solution:
	public String toLowerCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) sb.append((char) (c | 32));
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
