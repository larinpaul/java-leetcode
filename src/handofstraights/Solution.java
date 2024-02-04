package handofstraights;

import java.util.TreeMap;

// 847. Hands of Straights 
// Medium

// Alice has a hand of cards, given as an array of integers.

// Now she wants to rearrange the cards into groups so that each group is size N,
// and consists of W consecutive cards.

// Return true if and only if she can.

// Example 1:
// Input: hand = [1,2,3,6,2,3,4,7,8], W = 3
// Output: true
// Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8].

// Example 2:
// Input: hand = [1,2,3,4,5], W = 4
// Output: false
// Explanation: Alice's hand can't be rearranged into groups of 4.

// Note:
// 1. 1 <= hand.length <= 10000
// 2. 0 <= hand[i] <= 10^9
// 3. 1 <= W <= hand.length

public class Solution {

	public boolean isNStraightHand(int[] hand, int W) {
		TreeMap<Integer, Integer> card_counts = new TreeMap();
		for (int card : hand) {
			if (!card_counts.containsKey(card)) {
				card_counts.put(card, 1);
			} else {
				card_counts.replace(card, card_counts.get(card) + 1);
			} 
		}
		
		while (card_counts.size() > 0) {
			int first_card = card_counts.firstKey();
			for (int i = first_card; i < first_card + W; i++) {
				if (!card_counts.containsKey(i)) return false;
				int count = card_counts.get(i);
				if (count == 1) {
					card_counts.remove(i);
				} else {
					card_counts.replace(i, card_counts.get(i) - 1);
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
