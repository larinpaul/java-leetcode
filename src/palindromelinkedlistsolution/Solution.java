package palindromelinkedlistsolution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * 	int val;
 * 	ListNode next;
 *  ListNode(int x) { val = x; }
 * }
 */
public class Solution {

	// 234. Palindrome Linked List // Easy //
	
	// Given a singly linked list, determine if it is a palindrome.
	
	// Example 1:
	// Input: 1->2
	// Output: false
	
	// Example 2:
	// Input: 1->2->2->
	// Output: true
	
	// Follow up:
	// Could you do it in O(n) time and O(1) space?
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	// The algorithm is kinda the same as to do another palindrome problem.
	// We can use two pointers, one of them is going to be faster than the other
	// The fast one gets to the end of the List by the time the slow one gets to the middle
	// And then we will basically reverse the right side of the list
	// And will iterate at the end to see if they are the same.
	public boolean isPalindrome(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow = reversed(slow);
		fast = head;
		
		while (slow != null) {
			if (slow.val != fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
		return true;		
	}
	
	public ListNode reversed(ListNode head) {
		
		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}
	
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Input: 1->2, Output: false
        Solution.ListNode head1 = solution.new ListNode(1);
        head1.next = solution.new ListNode(2);
        boolean result1 = solution.isPalindrome(head1);
        System.out.println("Test Case 1: " + result1); // Expected output: false

        // Test Case 2: Input: 1->2->2, Output: true
        Solution.ListNode head2 = solution.new ListNode(1);
        head2.next = solution.new ListNode(2);
        head2.next.next = solution.new ListNode(1);
        boolean result2 = solution.isPalindrome(head2);
        System.out.println("Test Case 2: " + result2); // Expected output: true
    }

}
