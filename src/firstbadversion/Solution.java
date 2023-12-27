package firstbadversion;

/*
 * The isBadVersion API is defined in the parent class VersionControl.
 * boolean isBadVersion(int version);
 */

// public class Solution extends VersionControl {
public class Solution {

	// First Bad Version
	
	// You are a product manager and currently leading a team to develop a new product.
	// Unfortunately, the latest version of your product fails the quality check.
	// Since each version is developed based on the previous versions,
	// all the versions after a bad version are also bad.
	
	// Suppose you have n version [1, 2, ..., n] and you want to find out the first
	// the first bad one, which causes all the following ones to be bad.
	
	// You are given an API bool isBadVersion(version) which will return whether version is bad.
	// Implement a function to find the first bad version.
	// You should minimize the number of calls to the API.
	
	// Example:
	// Given n = 5, and version = 4 is the first bad version.
	// 
	// call isBadVersion(3) -> false
	// call isBadVersion(5) -> true
	// call isBadVersion(4) -> true
	//
	// Then 4 is the first bad version.
		
	// We'll do a binary search solution
	public int firstBadVersion(int n) {
		
		int left = 0;
		int right = n;
		
		while (left < right) {
			int midpoint = left + (right-left) / 2;
			if (isBadVersion(midpoint)) {
				right = midpoint;
			} else {
				left = midpoint + 1;
			}
		}
		
		if (left == right && isBadVersion(left)) {
			return left;
		}
		
		return -1;
	}
	
	// Stub method
	static boolean isBadVersion(int input) {
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
