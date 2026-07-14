class Solution {
    public int findGCD(int[] nums) {
        int n = 0;
        n = nums.length;
        Arrays.sort(nums);
        int gcd = 1, s = nums[0], l = nums[n-1];
        for(int i = 2; i <= l; i++){
            if(s%i == 0 && l%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}