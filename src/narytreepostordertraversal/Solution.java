package narytreepostordertraversal;

import java.util.List;
import java.util.LinkedList;

public class Solution {

	// 590. N-ary Tree Postorder Traversal
	// Easy
	
	// Given an n-ary tree, return the postorder traversal of its nodes' values.
	
	// For example, given a 3-ary tree:
	// picture of a tree
	// Return its postorder traversal as: [5, 6, 3, 2, 4, 1].
	
	// Note:
	// Recursive solution is trivial, could you do it iteratively?
	
	/*
	 // Definition for a Node.
	 class Node {
	 	public int val;
	 	public List<Node> children;
	 	
	 	public Node() {}
	 	
	 	public Node(int _val,List<Node> _children) {
	 		val = _val;
	 		children = _children;
	 	}
	 };
	 */
	
	public static void main(String[] args) {
		
	}

	public List<Integer> postorder(Node root) {
		
		LinkedList<Node> stack = new LinkedList<>();
		LinkedList<Integer> output_arr = new LinkedList<>();
	
		if (root == null) {
			return output_arr;
		}
		
		stack.add(root);
		while(!stack.isEmpty()) {
			Node node = stack.pollLast();
			output_arr.addFirst(node.val);
			for (Node child : node.children) {
				stack.add(child);
			}
		}
		
		return output_arr;
	}
	
}

class Node {
	public int val;
	public List<Node> children;
	
	public Node() {}
	
	public Node(int _val,List<Node> _children) {
		val = _val;
		children = _children;
	}
};
