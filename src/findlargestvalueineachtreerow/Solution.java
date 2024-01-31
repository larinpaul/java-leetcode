package findlargestvalueineachtreerow;

import java.util.ArrayList;
import java.util.List;

// 515. Find Largest Value in Each Tree Row
// Medium

// You need to find the largest value in each row of a binary tree.

// Example:

// Input:
//
//     1
//    /\
//   3  2
//  /\   \
// 5  3   9
//
// Output: [1, 3, 9]

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * 		int val;
 * 		TreeNode left;
 * 		TreeNode right;
 * 		TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> largest_vals = new ArrayList();
		helper_method(root, largest_vals, 0);
		return largest_vals;
	}
	
	public void helper_method(TreeNode root, List<Integer> largest_vals, int level) {
		if (root == null) return;
		
		if (level == largest_vals.size()) {
			largest_vals.add(root.val);
		} else {
			largest_vals.set(level, Math.max(largest_vals.get(level), root.val));
		}
		
		helper_method(root.left, largest_vals, level+1);
		helper_method(root.right, largest_vals, level+1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Solution solution = new Solution();
	    TreeNode root = solution.new TreeNode(1);
	    root.left = solution.new TreeNode(3);
	    root.right = solution.new TreeNode(2);
	    root.left.left = solution.new TreeNode(5);
	    root.left.right = solution.new TreeNode(3);
	    root.right.right = solution.new TreeNode(9);
	    List<Integer> largestValues = solution.largestValues(root);
	    System.out.println(largestValues);
	}

}
