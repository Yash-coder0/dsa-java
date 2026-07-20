class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, left_max = 0, right_max = 0;
        int sum = 0;
        while(left < right){
            if(height[left]<=height[right]){
                if(height[left] >= left_max){
                    left_max = height[left];
                    left++;
                }else{
                    sum += left_max - height[left];
                    left++;
                }
            }else{
                if(height[right] >= right_max){
                    right_max = height[right];
                    right--;
                }else{
                    sum += right_max - height[right];
                    right--;
                }
            }
        }
        return sum;
    }
}