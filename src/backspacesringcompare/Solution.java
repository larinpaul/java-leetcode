package backspacesringcompare;

public class Solution {

	// 844. Backspace String Compare
	// Easy
	
	// Given two strings S and T, return if they are equal
	// when both are typed into empty text editors.
	// # means a backspace character.
	
	// Example 1:
	// Input: S = "ab#c", T = "ad#c"
	// Output: true
	// Explanation: Both S and T become "ac".
	
	// Example 2:
	// Input: S = "ab##", T = "c#d#"
	// Output: true
	// Explanation: Both S and T become "".
	
	// Example 3:
	// Input: S = "a##c", T = "#a#c"
	// Output: true
	// Explanation: Both S and T become "c".
	
	// Example 4:
	// Input: S = "a#c", T = "b"
	// Output: false
	// Explanation: S becomes "C" while T becomes "b".
	
	// Note:
	// 1. 1 <= S.length <= 200
	// 2. 1 <= T.length <= 200
	// 3. S and T only contain lowercase letters and '#' characters.
	
	public boolean backspaceCompare(String S, String T) {
		
		int S_pointer = S.length()-1;
		int T_pointer = T.length()-1;
		
		int S_skips = 0;
		int T_skips = 0;
		
		while (S_pointer >= 0 || T_pointer >= 0) {
			
			while (S_pointer >= 0) {
				if (S.charAt(S_pointer) == '#') {
					S_skips += 1;
					S_pointer -= 1;
				} else if (S_skips > 0) {
					S_pointer -= 1;
					S_skips -= 1;
				} else {
					break;
				}
			}
			
			while (T_pointer >= 0) {
				if (T.charAt(T_pointer) == '#') {
					T_skips += 1;
					T_pointer -= 1;
				} else if (T_skips > 0) {
					T_pointer -= 1;
					T_skips -= 1;
				} else {
					break;
				}
			}
			
			if (S_pointer >= 0 && T_pointer >= 0 && S.charAt(S_pointer) != T.charAt(T_pointer)) {
				return false;
			}
			
			if ((S_pointer >= 0) != (T_pointer >= 0)) {
				return false;
			}
		
			S_pointer -= 1;
			T_pointer -= 1;
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
