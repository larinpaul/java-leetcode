package jewelsandstones;

// 771. Jewels and Stones
// Easy

// You're given strings J representing the types of stones that are jewels,
// and S representing the stones you have. Each character in S is a type of stone you have.
// You want to know how many of the stones you have are also jewels.

// The letters in J are guaranteed distinct, and all characters in J and S are letters.
// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Example 1:
// Input: 3 = "aA", 5 = "aAAbbbb"
// Output: 3

// Example 2:
// Input: 3 = "z", S = "ZZ"
// Output: 0

// Note:
// * S and J will consist of letters and have length at most 50.
// * The characters in J are distinct.

public class Solution {

	public int numJewelsInStones(String J, String S) {
		int num_jewels = 0;
		
		for (int i = 0; i < S.length(); i++) {
			if (J.indexOf(S.charAt(i)) > -1) {
				num_jewels += 1;
			}
		}
		
		return num_jewels;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
