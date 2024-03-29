package middleofthelinkedlist;

//// 876. Middle of the Linked List
// Easy

// Given a non-empty, singly linked list with head node head, return a middle node of linked
// list.

// If there are two middle nodes, return the second middle node.

// Example 1:
// Input: [1,2,3,4,5]
// Output: Node 3 from this list (Serialization: [3,4,5])
// The returned node has value 3. (The judge's serialization of this
// node is [3,4,5]).
// Note that we returned a ListNode object ans, such that:
// ans.val = 3, and.next.val = 4, ans.next.next.val = 5, and
// ans.next.next.next = NULL.

// Example 2:
// Input: [1,2,3,4,5,6]
// Output: Node 4 form this list (Serialization: [4,5,6])
// Since the list has two middle nodes with values 3 and 4, we return
// the second one.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * 		int val;
 * 		ListNode next;
 * 		ListNode(int x) { val = x; }
 * }
 */
public class Solution {
	
	public ListNode middleNode(ListNode head) {

		ListNode a_pointer = head;
		ListNode b_pointer = head;
		
		while (b_pointer != null && b_pointer.next != null) {
			a_pointer = a_pointer.next;
			b_pointer = b_pointer.next.next;
		}
		
		return a_pointer;
		
	}

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
