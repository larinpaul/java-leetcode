package narytreepreordertraversal;

import java.util.List;

public class Solution {

	// 589. N-ary Tree Preorder Traversal
	// Easy
	
	// Given an n-ary tree, return the preorder traversal of its nodes' values.
	
	// For example, given a 3-ary tree:
	//     1
	//    /|\
	//   3 2 4
	//  /\
	// 5  6
	// Return its preorder traversal as: [1,3,5,6,2,4].
	
	// Note:
	// Recursive solution is trivial, could you do it iteratively?
	
	/*
	// Defintion for a Node.
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
	
	class Node {
		public int val;
		public List<Node> children;
		
		public Node() {}
		
		public Node(int _val,List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

}
