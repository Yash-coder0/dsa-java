class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int idx = index[i];
            int val = nums[i];
            if(idx == i){
                ans[i] = val;
            }else{
                for(int j = i; j > idx; j--){
                    ans[j] = ans[j - 1];
                }
                ans[idx] = val;
            }
        }
        return ans;
    }
}