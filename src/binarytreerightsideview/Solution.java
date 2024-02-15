package binarytreerightsideview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 2024/02/15

// 199. Binary Tree Right Side View
// Medium

// Given a binary tree, imagine yourself standing on the RIGHT side of it,
// return the values of the nodes you can see ordered from top to bottom.

// Example:
// Input: [1,2,3,null,5,null,4]
// Output: [1, 3, 4]
// Explanation:
//  1            <---
// / \		
// 2 3			 <---
// \ \
//  5 4			 <---

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

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList();
		Queue<TreeNode> queue = new LinkedList();
		
		if (root == null) return result;
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode current_node = queue.poll();
				if (i==0) result.add(current_node.val);
				if (current_node.right != null) queue.offer(current_node.right);
				if (current_node.left != null) queue.offer(current_node.left);
			}
		}
		
		return result;
	}
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
