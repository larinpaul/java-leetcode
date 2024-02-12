package maximumwidthofabinarytree;

import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * 		int val;
 * 		TreeNode left;
 * 		TreeNode right;
 * 		TreeNode(int x) { val = x; }
 * 	}
 */
public class Solution {
	
	// 662 Maximum Width of Binary Tree
	// Medium
	
	// Given a binary tree, write a function to get the maximum width of the given tree. The width
	// of a tree is the maximum width among all levels. The binary tree has the same structure as
	// a full binary tree, but some nodes are null.
	
	// The width of one level is defined as the length between the end-nodes (the leftmost and
	// right most non-null nodes in the level, where the null nodes between the end-nodes are
	// also counted into the length calculation.
	
	// Example 1:
	// Input:
	//    1
	//   /\ 
	//   3 2
	//  / \ \
	// 5  3  9
	// Output: 4
	// Explanation: The maximum width existing in the third level with
	// the length 4 (5,3,null,9).
	
	// Example 2:
	// Input:
	//     1
	//    /
	//   3
	//  / \
	// 5  3
	// Output: 2
	// Explanation: The maximum width existing in the third level with
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	int max_width;
	HashMap<Integer, Integer> leftmost_positions;
	public int widthOfBinaryTree(TreeNode root) {
		max_width = 0;
		leftmost_positions = new HashMap();
		get_width(root, 0, 0);
		return max_width;
	}
	
	public void get_width(TreeNode root, int depth, int position) {
		if (root == null) return;
		leftmost_positions.computeIfAbsent(depth, x -> position);
		max_width = Math.max(max_width, position - leftmost_positions.get(depth) + 1);
		get_width(root.left, depth+1, position*2);
		get_width(root.right, depth+1, position*2+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
