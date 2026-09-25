class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], nums[i]);
        }

        for(int j = k; j < n ; j++){
            max = Math.max(prefix[j - k] + nums[j], max);
        }
        return max;
    }
}