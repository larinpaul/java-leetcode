package swapnodesinpairs;

// 24. Swap Nodes in Pairs
// Medium

// Given a linked list, swap every two adjacent nodes and return its head.

// You may not modify the values in the list's nodes, only nodes itself may be changed.

// Example:
// Given 1->2->3->4, you should return the list as 2->1->4->3.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * 		int val;
 * 		ListNode next;
 * 		ListNode(int x) { val = x; }
 *	}
 */
public class Solution {

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode swapPairs(ListNode head) {
		ListNode temp = new ListNode(0);
		temp.next = head;
		ListNode current = temp;
		
		while (current.next != null && current.next.next !=null) {
			ListNode first_node = current.next;
			ListNode second_node = current.next.next;
			first_node.next = second_node.next;
			current.next = second_node;
			current.next.next = first_node;
			current = current.next.next;
		}
		
		return temp.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
