package pathsum;

import java.util.Stack;

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
	
	// Path Sum
	
	// Given a binary tree and a sum, determine if the tree has a root-to-leaf path
	// such that adding up all the values along the path equals the given sum.
	
	// Note: A leaf is a node with no children.
	
	// Example:
	// Given the below binary tree and sum = 22,
	//      5
	//     / \
	//    4   8
	//   /   / \
	//  11  13  4
	//  / \  \
	// 7   2  1
	// returns true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
	
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) return false;
		
		Stack<TreeNode> node_stack = new Stack();
		Stack<Integer> sum_stack = new Stack();
		
		node_stack.add(root);
		sum_stack.add(sum-root.val);
		
		while (!node_stack.isEmpty()) {
			TreeNode current_node = node_stack.pop();
			int current_sum = sum_stack.pop();
			
			if (current_node.left == null && current_node.right == null && current_sum == 0) {
				return true;
			}
			
			if (current_node.left != null) {
				node_stack.add(current_node.left);
				sum_stack.add(current_sum-current_node.left.val);
			}
			
			if (current_node.right != null) {
				node_stack.add(current_node.right);
				sum_stack.add(current_sum-current_node.right.val);
			}
		}
		
		return false;
	}
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
