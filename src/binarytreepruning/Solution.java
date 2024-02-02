package binarytreepruning;

//// 2024/02/02 // 18:24 //
// Medium

// We are given the head node root of a binary tree, where additionally every node's value
// is either a 0 or a 1.

// Return the same tree where every subtree (of the given tree) not containing a 1 has been
// removed.

// (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)

// Example 1:
// Input: [1,null,0,0,1]
// Output: [1,null,0,null,1]

// Explanation:
// Only the red nodes satisfy the property "every subtree not
// containing a 1".

// The diagram on the right represents the answer.
// 1           1
//  \           \
//   0      =>   0
//  / \           \
// 0   1           1

// Example 2:
// Input: [1,0,1,0,0,0,1]
// Output: [1,null,1,null,1]
//   1         1
//   /\         \   
//   0 1   =>    1  
//  /\ /\         \
// 0 0 0 1         1

// Example 3:
// Input: [1,1,0,1,1,0,1,0]
// Output: [1,1,0,1,1,null,1]
// IMAGE

// * The binary tree will have at most 100 nodes.
// * The value of each node will only be 0 or 1.

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
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public TreeNode pruneTree(TreeNode root) {
		if (root == null) return null;
		containsOne(root);
		return root;
	}
	
	public boolean containsOne(TreeNode node) {
		if (node == null) return false;
		boolean left_contains = containsOne(node.left);
		boolean right_contains = containsOne(node.right);
		if (!left_contains) {
			node.left = null;
		}
		if (!right_contains) {
			node.right = null;
		}
		
		return node.val == 1 || left_contains || right_contains;
	}
	
	
public static void main(String[] args) {
    Solution solution = new Solution();
    // create binary tree for example 1
    TreeNode root1 = solution.new TreeNode(1);
    root1.left = null;
    root1.right = solution.new TreeNode(0);
    root1.right.left = solution.new TreeNode(0);
    root1.right.right = solution.new TreeNode(1);
    // print original tree
    System.out.println("Original tree 1:");
    printTree(root1);
    // prune tree
    TreeNode pruned1 = solution.pruneTree(root1);
    // print pruned tree
    System.out.println("Pruned tree 1:");
    printTree(pruned1);

    // create binary tree for example 2
    TreeNode root2 = solution.new TreeNode(1);
    root2.left = solution.new TreeNode(0);
    root2.right = solution.new TreeNode(1);
    root2.right.left = solution.new TreeNode(0);
    root2.right.right = solution.new TreeNode(1);
    root2.right.left.left = solution.new TreeNode(0);
    root2.right.left.right = solution.new TreeNode(0);
    // print original tree
    System.out.println("Original tree 2:");
    printTree(root2);
    // prune tree
    TreeNode pruned2 = solution.pruneTree(root2);
    // print pruned tree
    System.out.println("Pruned tree 2:");
    printTree(pruned2);

    // create binary tree for example 3
    TreeNode root3 = solution.new TreeNode(1);
    root3.left = solution.new TreeNode(1);
    root3.right = solution.new TreeNode(0);
    root3.right.left = solution.new TreeNode(1);
    root3.right.right = solution.new TreeNode(1);
    root3.right.left.left = solution.new TreeNode(0);
    root3.right.right.left = solution.new TreeNode(0);
    // print original tree
    System.out.println("Original tree 3:");
    printTree(root3);
    // prune tree
    TreeNode pruned3 = solution.pruneTree(root3);
    // print pruned tree
    System.out.println("Pruned tree 3:");
    printTree(pruned3);
}

// utility method to print binary tree
public static void printTree(TreeNode root) {
    if (root == null) {
        return;
    }
    System.out.print(root.val + " ");
    printTree(root.left);
    printTree(root.right);
}

}
