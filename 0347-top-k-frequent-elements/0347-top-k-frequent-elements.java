class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i : nums) {
            map.put(i ,map.getOrDefault(i ,0)+1);
        }
        int[] ans = new int[k];
        int index = 0;

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
         
        return ans;
    }
}