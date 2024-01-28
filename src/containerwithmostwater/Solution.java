package containerwithmostwater;

//// 11. Container with most water
// Medium

// Given n non-negative integers a1, a2, ..., an, where each
// represents a point at coordinate (i, aj). 
// n vertical lines are drawn such
// that the two endpoints of line i is at (i, aj) and (i, 0).
// Find two lines, which together with x-axis forms a container,
// such that the container contains the most water.

// Note: You may not slant the container and n is at least 2.

// Picture

// The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
// In this case, the max area of water (blue section)
// the container can contain is 49.

// Example:
// Input: [1,8,6,2,5,4,8,3,7]
// Output: 49

public class Solution {
	
	public int maxArea(int[] height) {
		
		// We can use a two-pointer technique
		
		int max_area = 0;
		int a_pointer = 0;
		int b_pointer = height.length-1;
		
		while (a_pointer < b_pointer) {
			if (height[a_pointer] < height[b_pointer]) {
				max_area = Math.max(max_area, height[a_pointer] * (b_pointer - a_pointer));
				a_pointer += 1;
			} else {
				max_area = Math.max(max_area, height[b_pointer] * (b_pointer-a_pointer));
				b_pointer -= 1;
			}
		}
		
		return max_area;
	}
	
	public static void main(String[] args) {
	    Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = solution.maxArea(height);
        System.out.println("The maximum area of water that can be contained is: " + maxArea);
	}
	
}
