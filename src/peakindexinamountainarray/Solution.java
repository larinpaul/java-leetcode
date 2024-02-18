package peakindexinamountainarray;

// 852. Peak Index in a Mountain Array
// Easy

// Let's call an array A a mountain if the following properties hold:
// * A.length >= 3
// * There exist some 0 < i < A.length - 1 such that A[0] < A[1] < ...
// A[i-1] < A[i] > A[i+1] > ... > A[A.length -1]


// Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ...
// A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

// Example 1:
// Input: [0,1,0]
// Output: 1

// Example 2:
// Input: [0,2,1,0]
// Output: 1

// Note:
// 1. 3 <= A.length <= 10000
// 2. 0 <= A[i] <= 10^6
// 3. A is a mountain, as defined above.

public class Solution {
	
	// To do this, you can do a linear scan...
	
	// But we are going to use something like a binary search...
	
	public int peakIndexInMountainArray(int[] A) {
		int left = 0;
		int right = A.length-1;
		
		while (left < right) {
			int midpoint = left + (right-left) / 2;
			if (A[midpoint] < A[midpoint + 1]) { // We're still increasing
				left = midpoint + 1;
			}
		} 
		
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
