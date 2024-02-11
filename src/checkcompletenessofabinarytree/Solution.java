package checkcompletenessofabinarytree;

import java.util.LinkedList;
import java.util.Queue;

// 958. Check Completeness of a Binary Tree
// Medium
//
// Given a binary tree, determine if it is a complete binary tree.
// 
// Definition of a complete binary tree from Wikipedia:
// In a complete binary tree every level, except possibly the last, is completely filled, and all
// nodes in the last level are as far left as possible. It can have between 1 and 2^h nodes
// inclusive at the last level h

// Example 1:
// IMAGE
// Input: [1,2,3,4,5,6]
// Output: true
// Explanation: Every level before the last is full (ie. levels wit
// node-values {1} and {2, 3}), and all nodes in the last level ({4,
// 5, 6}) are as far left as possible.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * 		int val;
 * 		TreeNode left;
 * 		TreeNode right;
 * 		TreeNode(int x) { val = x; }
 *	}
 */
public class Solution {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	
	public boolean isCompleteTree(TreeNode root) {
		boolean end = false;
		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			TreeNode current_node = queue.poll();
			if (current_node == null) {
				end = true;
			} else {
				if (end) return false;
				queue.offer(current_node.left);
				queue.offer(current_node.right);
			}
		}
		
		return true;
	}
	
	
}
