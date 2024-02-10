package distributecoinsinabinarytree;

// 979. Distribute Coins in Binary Tree
// Medium

// Given the root of a binary tree with N nodes, each node in the tree has node.val coins,
// and there are N coins total.

// In one move, we may choose two adjacent nodes and move one coin from one node to
// another. (The move may be from parent to child, or from child to parent.)

// Return the number of moves required to make every node have exactly one coin.

// Example 1:
// PICTURE
// Input: [3,0,0]
// Output: 2
// Explanation: From the root of the tree, we move one coin to its
// left child, and one coin to its right chidl.

// Example 2:
// PICTURE
// 


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
	
	int num_moves;
	public int distributeCoins(TreeNode root) {
		num_moves = 0;
		give_coins(root);
		return num_moves;
	}
	
	public int give_coins(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = give_coins(node.left);
		int right = give_coins(node.right);
		num_moves += Math.abs(left) + Math.abs(right);
		return node.val + left + right - 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
