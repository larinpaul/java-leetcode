package containsduplicate;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
	}
	
	// Uses O(n) speed but more space
	public boolean containsDuplicateViaHashSet(int[] nums) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (numbers.contains(nums[i])) return true;
			numbers.add(nums[i]);
		}
		return false;
	}
	
	// Uses O(nlogn) to sort but less space
	public boolean containsDuplicateViaSortingTheArray(int[] nums) {
		
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1]) return true;
		}
		return false;
	}

}
