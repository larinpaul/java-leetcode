package binarysearch;

public class Solution {
	
	// Binary Search
	
	// Given a sorted (in ascending order) integer array nums of n elements
	// and a target value, write a function to search target in nums.
	// If target exists, then returns its index, otherwise returns -1;.
	
	// Example 1:
	// Input: nums = [-1,0,3,5,9,12], target = 9
	// Output: 4
	// Explanation: 9 exists in nums and its idnex is 4

	// Example 2:
	// Input: nums = [-1,0,3,5,9,12], target = 2
	// Output: -1
	// Explanation: 2 does not exist in nums so return -1
	
	// Note:
	// 1. You may assume that all elements in nums are unique.
	// 2. n will be in the range [1, 10000].
	// 3. The value of each element in nums will be in the range [-9999, 9999].
	
	public int search(int[] nums, int target) {
		if (nums.length == 0) return -1;
		
		int left = 0;
		int right = nums.length-1;
	
		while (left <= right) {
			int midpoint = left + (right-left) / 2;
			if (nums[midpoint] == target) {
				return midpoint;
			} else if (nums[midpoint] > target) {
				right = midpoint - 1;
			} else {
				left = midpoint + 1;
			}
		}
		return -1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
