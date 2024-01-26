package keysandrooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//// 841. Keys and Rooms
// Medium

// There are N rooms and you start in room 0. Each room has a distinct number in 0, 1,
// 2, ..., N-1, and each room may have some keys to access the next room.

// Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an
// integer in [0, 1, ..., N-1] where N = rooms.length. A key rooms[i][j] = v
// opens the room with number v.

// Initially, all the rooms start locked (except for room 0).

// You can walk back and forth between rooms freely.

// Return true if and only if you can enter every room.

// Example 1:
// Input: [[1],[2],[3],[]]
// Output: true
// Explanation:
// We start in room 0, and pick up key 1.
// We then go to room 0, and pick up key 1.
// We then go to room 2, and pick up key 3.
// We then go to room 3. Since we were able to go to every room, we return true,

// Example 2:
// Input: [[1,3][3,0,1],[2],[0]]
// Output: false
// Explanation: We can't enter the room with number 2.

// Note:
// 1. 1 <= rooms.length <= 1000
// 2. 0 <= rooms[i].length <= 1000
// 3. The number of keys in all rooms combined is at most 3000.

public class Solution {

	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		
		boolean[] seen = new boolean[rooms.size()];
		seen[0] = true;
		
		Stack<Integer> keys = new Stack();
		keys.add(0);
		
		while (!keys.isEmpty()) {
			int current_key = keys.pop();
			for (int new_key : rooms.get(current_key)) {
				if (!seen[new_key]) {
					seen[new_key] = true;
					keys.add(new_key);
				}
			}
		}
				
		
		for (boolean visited : seen) {
			if (!visited) return false;
		}
	
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Solution solution = new Solution();

        // Example 1
        List<List<Integer>> rooms1 = new ArrayList<>();
        rooms1.add(new ArrayList<>(Arrays.asList(1)));
        rooms1.add(new ArrayList<>(Arrays.asList(2)));
        rooms1.add(new ArrayList<>(Arrays.asList(3)));
        rooms1.add(new ArrayList<>());
        System.out.println(solution.canVisitAllRooms(rooms1)); // Output: true

        // Example 2
        List<List<Integer>> rooms2 = new ArrayList<>();
        rooms2.add(new ArrayList<>(Arrays.asList(1, 3)));
        rooms2.add(new ArrayList<>(Arrays.asList(3, 0, 1)));
        rooms2.add(new ArrayList<>(Arrays.asList(2)));
        rooms2.add(new ArrayList<>(Arrays.asList(0)));
        System.out.println(solution.canVisitAllRooms(rooms2)); // Output: false

	}

}
