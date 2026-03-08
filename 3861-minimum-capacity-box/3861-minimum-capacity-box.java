class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n = capacity.length;
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i < n; i++) {
            int box = capacity[i];
            if(box >= itemSize && box < min){
                min = box;
                ans = i;
            } 
        }
        return ans;
    }
}