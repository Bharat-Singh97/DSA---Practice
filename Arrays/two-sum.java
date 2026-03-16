/*
Problem: Two Sum
Platform: LeetCode
Topic: Arrays
Concept Used: HashMap

Approach:
We use a HashMap to store numbers and their indices.
For each element, we check if the complement (target - nums[i]) exists in the map.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

          for(int i = 0; i < nums.length; i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
          }
          return new int[]{-1, -1};
        
    }
}
