package squaresofasortedarray;

import java.util.Arrays;

//// 977. Squares of a Sorted Array
// Easy

// Given an array of integers A sorted in non-decreasing order,
// return an array of the squares of each number,
// also in sorted non-decreasing order.

// Example 1:
// Input: [-4,-1,0,3,10]
// Output: [0,1,9,16,100]

// Example 2:
// Input: [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

// Note:
// 1. 1 <= A.length <= 10000
// 2. -10000 <= A[i] <= 10000
// 3. A is sorted in non-decreasing order.

public class Solution {

	public int[] sortedSquares(int[] A) {
	    int N = A.length;
	    int positive_pointer = 0;

	    while (positive_pointer < N && A[positive_pointer] < 0) {
	        positive_pointer += 1;
	    }

	    int negative_pointer = positive_pointer-1;

	    int[] sorted_squares = new int[N];
	    int counter = 0;

	    while (negative_pointer >= 0 && positive_pointer < N) {
	        if (A[negative_pointer] * A[negative_pointer] < A[positive_pointer] * A[positive_pointer]) {
	            sorted_squares[counter] = A[negative_pointer] * A[negative_pointer];
	            negative_pointer -= 1;
	        } else {
	            sorted_squares[counter] = A[positive_pointer] * A[positive_pointer];
	            positive_pointer += 1;
	        }

	        counter += 1;
	    }

	    int second_counter = 0;
	    while (negative_pointer >= 0) {
	        sorted_squares[counter + second_counter] = A[negative_pointer] * A[negative_pointer];
	        negative_pointer -= 1;
	        second_counter += 1;
	    }

	    int third_counter = 0;
	    while (positive_pointer < N) {
	        sorted_squares[counter + second_counter + third_counter] = A[positive_pointer] * A[positive_pointer];
	        positive_pointer += 1;
	        third_counter += 1;
	    }

	    return sorted_squares;
	}
	
	
//	public int[] sortedSquares(int[] A) {
//		int N = A.length;
//		int positive_pointer = 0;
//		
//		while (positive_pointer < N && A[positive_pointer] < 0) {
//			positive_pointer += 1;
//		}
//		
//		int negative_pointer = positive_pointer-1;
//		
//		int[] sorted_squares = new int[N];
//		int counter = 0;
//		
//		while (negative_pointer >= 0 && positive_pointer < N) {
//			if (A[negative_pointer] * A[negative_pointer] < A[positive_pointer] * A[positive_pointer]) {
//				sorted_squares[counter] = A[negative_pointer] * A[negative_pointer];
//				negative_pointer -= 1;
//			} else {
//				sorted_squares[counter] = A[positive_pointer] * A[positive_pointer];
//				positive_pointer += 1;
//			}
//			
//			counter += 1;
//		}
//		
//		while (negative_pointer >= 0) {
//			sorted_squares[counter] = A[negative_pointer] * A[negative_pointer];
//			negative_pointer -= 1;
//			counter += 1;
//		}
//		
//		while (positive_pointer <= N) {
//			sorted_squares[counter] = A[positive_pointer] * A[positive_pointer];
//			positive_pointer += 1;
//			counter += 1;
//		}
//		
//		return sorted_squares;
//		
//	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Solution solution = new Solution();
	    int[] input1 = {-4, -1, 0, 3, 10};
	    int[] output1 = solution.sortedSquares(input1);
	    System.out.println("Input: [-4, -1, 0, 3, 10]");
	    System.out.println("Output: " + Arrays.toString(output1));
	    System.out.println("Expected: [0, 1, 9, 16, 100]");
	    System.out.println();

	    int[] input2 = {-7, -3, 2, 3, 11};
	    int[] output2 = solution.sortedSquares(input2);
	    System.out.println("Input: [-7, -3, 2, 3, 11]");
	    System.out.println("Output: " + Arrays.toString(output2));
	    System.out.println("Expected: [4, 9, 9, 49, 121]");
	    System.out.println();

	    int[] input3 = {-10000, -10, 0, 2};
	    int[] output3 = solution.sortedSquares(input3);
	    System.out.println("Input: [-10000, -10, 0, 2]");
	    System.out.println("Output: " + Arrays.toString(output3));
	    System.out.println("Expected: [0, 4, 100, 100000000]");
	    System.out.println();

	    int[] input4 = {1, 2, 3, 4, 5};
	    int[] output4 = solution.sortedSquares(input4);
	    System.out.println("Input: [1, 2, 3, 4, 5]");
	    System.out.println("Output: " + Arrays.toString(output4));
	    System.out.println("Expected: [1, 4, 9, 16, 25]");
	    System.out.println();

	    int[] input5 = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int[] output5 = solution.sortedSquares(input5);
	    System.out.println("Input: [-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
	    System.out.println("Output: " + Arrays.toString(output5));
	    System.out.println("Expected: [0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961, 1000]");
	    System.out.println();

	}

}
