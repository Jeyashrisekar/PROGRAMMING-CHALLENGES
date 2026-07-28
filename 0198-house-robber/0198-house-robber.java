class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        int prev2 = 0;
        int prev1 = 0;
         for(int i : nums){
            int cur = Math.max(prev1, i+prev2);
            prev2 = prev1;
            prev1 = Math.max(cur, 0); 
         }
        return prev1;
    }
}