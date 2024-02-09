package univaluedbinarytree;

// 2024/02/09
// 965. Univalued Binary Tree
// Easy

// A binary tree is univalued if every node in the tree has the same value.

// Return true if and only if the given tree is univalued.

// Example 1:
//   1
//   /\
//   1 1
//  / \ \
// 1  1  1
// Input: [1,1,1,1,1,null,1]
// Output: true

// Example 2:
//    2
//   /\
//  2 2
// / \
// 5 2
// Input: [2,2,2,5,2]
// Output: false

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
	
	public boolean isUnivalTree(TreeNode root) {
		boolean left_univaled = root.left == null || root.left.val == root.val && isUnivalTree(root.left);
		boolean right_univaled = root.right == null || root.right.val == root.val && isUnivalTree(root.right);
		return left_univaled && right_univaled;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
