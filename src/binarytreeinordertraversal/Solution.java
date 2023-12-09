package binarytreeinordertraversal;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
	
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) {
		val = x;
	}
	
}

public class Solution {

	// 94. Binary Tree Inorder Traversal // Medium //
	
	// Given a binary tree, return the inorder traversal of its nodes' values.
	
	// Example:
	// Input: [1,null,2,3]
	// 1
	//  \
	//   2
	//  /
	// 3
	// Output: [1,3,2]
	
	// Follow up: Recursive solution is trivial, could you do it iteratively?
	
	public List < Integer > inorderTraversal(TreeNode root) {
		
		// Preorder, inorder and postorder refer to how the root node is traversed
		
		// In-Order (LNR)
		// 1. Check if the current node is empty or null.
		// 2. Traverse the left subtree by recursively calling the in-order function.
		// 3. Display the data part of the root (or current node).
		// 4. Traverse the right subtree by recursively calling the in-order function.
		// In a binary search tree, in-order traversal retrieves data in sorted order.
		
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> output_arr = new ArrayList<>();
		
		if (root == null) {
			return output_arr;
		}
		
		TreeNode current = root;
		
		while (current != null || !stack.isEmpty()) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			output_arr.add(current.val);
			current = current.right;
		}
		
		return output_arr;		
	}
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		Solution sol = new Solution();
		
		List<Integer> result = sol.inorderTraversal(root);
		
		System.out.println(result);

	}

}
