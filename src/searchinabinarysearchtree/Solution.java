package searchinabinarysearchtree;

// 700. Search in a Binary Search Tree
// Easy

// Given the root node of a binary search tree (BST) and a value. You need to find the node in
// the BST that the node's value equals the given value. Return the subtree rooted with that
// node. If such node doesn't exist, you should return NULL.

// For example,
// Given the tree:
// 4
// / \
// 2 7
// / \
// 1 3
// And the value to search: 2

// You should return this subtree:
// 2
// / \
// 1 3

// In the example above, if we want to search the value 5, since there is no node with value S,
// we should return NULL.

// Note that an empty tree is represented by NULL, therefore you would see the expected
// output (serialized tree format) as [], not null.


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

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) return null;
		if (root.val == val) return root;
		
		if (val < root.val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
