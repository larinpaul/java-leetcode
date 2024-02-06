package findbottomlefttreevalue;

import java.util.LinkedList;
import java.util.Queue;

// 513. Find Bottom Left Tree Value
// Medium

// Given a binary tree, find the leftmost value in the last row of the tree.

// Example 1:
// Input:
// 2
// /\
// 1 3
// Output:
// 1

// Example 2:
// Input:
// 1
// /\
// 2 3
// / / \
// 4 5 6
// / 
// 7
// Output: 7

// Note: you may assume the tree (i.e., the given root node) is not NULL.

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
		TreeNode(int x) { val = x; }
	}
	
	public int findBottomLeftValue(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			if (root.right != null) {
				queue.offer(root.right);
			}
			if (root.left != null) {
				queue.offer(root.left);
			}
		}
		return root.val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
