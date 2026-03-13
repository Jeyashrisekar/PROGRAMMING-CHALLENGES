class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num, 1);
        }
        
        //int size = 0;
        int maxlen = 0;
        for(int i : map.keySet()){
            if (map.containsKey(i + 1)) {
               int size = map.get(i) + map.get(i + 1);
                maxlen = Math.max(maxlen, size);
            }
            
        }
        return maxlen;
    }
}