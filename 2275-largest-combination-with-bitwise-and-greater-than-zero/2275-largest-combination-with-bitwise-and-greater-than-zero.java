class Solution {
    public int largestCombination(int[] candidates) {
        int ans = 0;
        for(int i = 0; i < 24; i++){
            int count1 = 0;
            for(int val : candidates){
                if((val & (1<<i)) != 0) count1++;

            }
            ans = Math.max(count1, ans);
        }
        return ans;
    }
}