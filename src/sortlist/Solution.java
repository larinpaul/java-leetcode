package sortlist;

// 148. Sort List
// Medium

// Sort a linked list in O(n log n) time using constant space complexity.

// Example 1:
// Input: 4->2->1->3
// Output: 1->2->3->4

// Example 2:
// Input: -1->5->3->4->0
// Output: -1->0->3->4->5

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
	
	// We're gonna do mergesort, it's a bit more reliable that quicksort...
	public ListNode sortList(ListNode head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode temp = head;
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		temp.next = null;
		
		ListNode left_side = sortList(head);
		ListNode right_size = sortList(slow);
		
		return merge(left_side, right_size);
	}
	
	public ListNode merge(ListNode l1, ListNode l2) {
		
		ListNode sorted_temp = new ListNode(0);
		ListNode current_node = sorted_temp;
		
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				current_node.next = l1;
				l1 = l1.next;
			} else {
				current_node.next = l2;
				l2 = l2.next;
			}
			
			current_node = current_node.next;
		}
		
		if (l1 != null) {
			current_node.next = l1;
			l1 = l1.next;
		}
		
		if (l2 != null) {
			current_node.next = l2;
			l2 = l2.next;
		}
		
		return sorted_temp.next;
		
	}
	
	public static void main(String[] args) {
	    Solution solution = new Solution();

	    // Example 1
	    Solution.ListNode head1 = solution.new ListNode(4);
	    head1.next = solution.new ListNode(2);
	    head1.next.next = solution.new ListNode(1);
	    head1.next.next.next = solution.new ListNode(3);
	    printList(head1);
	    Solution.ListNode sorted1 = solution.sortList(head1);
	    printList(sorted1); // Output: 1 -> 2 -> 3 -> 4

	    // Example 2
	    Solution.ListNode head2 = solution.new ListNode(-1);
	    head2.next = solution.new ListNode(5);
	    head2.next.next = solution.new ListNode(3);
	    head2.next.next.next = solution.new ListNode(4);
	    head2.next.next.next.next = solution.new ListNode(0);
	    printList(head2);
	    Solution.ListNode sorted2 = solution.sortList(head2);
	    printList(sorted2); // Output: -1 -> 0 -> 3 -> 4 -> 5
	}

	private static void printList(Solution.ListNode head) {
	    while (head != null) {
	        System.out.print(head.val + " -> ");
	        head = head.next;
	    }
	    System.out.println("null");
	}

}
