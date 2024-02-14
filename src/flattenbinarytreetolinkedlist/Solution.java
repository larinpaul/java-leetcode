package flattenbinarytreetolinkedlist;

import java.util.Stack;

// 114. Flatten Binary Tree to Linked List
// Medium

// Given a binary tree, flatten it to a linked list in-place.

// For example, given the following tree:
//     1
//    /\
//   2  5
//  / \  \
// 3   4  6

// The flattened tree should look like:
// 1
//  \
//   2
//    \
//     3
//      \
//       4
//        \
//         5
//          \
//           6

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
	
	public void flatten(TreeNode root) {
		if (root == null) return;
		Stack<TreeNode> stack = new Stack();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			TreeNode current_node = stack.pop();
			if (current_node.right != null) {
				stack.push(current_node.right);
			}
			
			if (current_node.left != null) {
				stack.push(current_node.left);
			}
			
			if (!stack.isEmpty()) {
				current_node.right = stack.peek();
			}
		
			current_node.left = null;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
