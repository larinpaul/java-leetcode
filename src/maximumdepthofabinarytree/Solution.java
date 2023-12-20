package maximumdepthofabinarytree;

public class Solution {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 * 		int val;
	 * 		TreeNode left;
	 * 		TreeNode right;
	 * 		TreeNode(int x) { val = x; }
	 * }
	 */
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
//	// "Top-down" Solution
//	private int answer; // don't forget to initialize answer before call maximum_depth
//	public int maxDepthTopDown(TreeNode root, int depth) {
//		if (root == null) {
//			return ;
//		}
//		if (root.left == null && root.right == null) {
//			answer = Math.max(answer, depth);
//		}
//		maxDepthTopDown(root.left, depth + 1);
//		maxDepthTopDown(root.right, depth + 1);
//	}
	
	// "Bottom-up" Solution
	public int maximum_depth(TreeNode root) {
		if (root == null) {
			return 0;	// returns 0 for null node
		}
		int left_depth = maximum_depth(root.left);
		int right_depth = maximum_depth(root.right);
		return Math.max(left_depth, right_depth) + 1; // returns depth of the subtree rooted at root
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
