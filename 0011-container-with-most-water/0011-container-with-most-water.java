class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int l = 0;
        int r = n - 1;

        while(l < r){
            int water = (r - l ) * Math.min(height[l], height[r]);
            max = Math.max(max, water);
            if(height[l] <= height[r]){
                l++;
            } else{
                r--;
            }
        }
        return max;
        
    }
}