// Problem: Two Sum
// Platform: LeetCode
// Topic: Arrays
// Language: Java
// Approach 1: Brute Force (O(n^2))
// Approach 2: HashMap (O(n)) we can optimize it


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; // calculated length of given array
      
        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (target == nums[i] + nums[j]){    // if target found we are the array of indexes
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
