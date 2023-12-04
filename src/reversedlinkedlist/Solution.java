package reversedlinkedlist;

public class Solution {
	
	// 206. Reverse Linked List // Easy
	
	// Reverse a singly linked list.
	
	// Example:
	// Input: 1->2->3->4->5->NULL
	// Output: 5->->3->2->1->NULL
	
	// Follow up:
	// A linked list can be reversed either iteratively or recursively.
	// Could you implement both?

	public static void main(String[] args) {

	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 * int val;
	 * ListNode next;
	 * ListNode(int x) { val = x; }
	 */
	
	// Just to simply further:
	// Result of the 1st iteration of 4 lines of code in tha while loop:
	// next = 2
	// 1-> null
	// prev = 1
	// head =2
	
	// 2nd:
	// now, next = 3
	// 2->1 (remember 1 already points to null)
	// prev = 2
	// head = 3
	
	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}
	
}

class ListNode {

	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
}
