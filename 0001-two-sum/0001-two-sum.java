class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> val = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(val.containsKey(need)){
                return new int[]{val.get(need),i};

            }
            val.put(nums[i], i);
        }
        return new int[]{};
    }
}