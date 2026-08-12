class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <i; j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;

    }

}

//MEMOIZATION

// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int n = nums.length;
//         int[][] dp = new int[n][n-1];
//         for(int[] r : dp) Arrays.fill(r, -1);
//         return lis(0, -1, nums, dp);

//     }
//     public int lis(int i, int prev, int[] nums, int[][] dp){
//         if(i == nums.length) return 0;
//         if(prev != -1 && dp[i][prev] != -1) return dp[i][prev];
//         int pick = 0;
//         if(prev == -1 || nums[i] > nums[prev]){ //prev -1 means lis is empty
//             pick = 1 + lis(i+1, i, nums, dp);
//         }
//         int np = lis(i+1, prev, nums, dp);
//         if(prev!= -1) return dp[i][prev] = Math.max(pick, np);

//         else return Math.max(pick, np);
//     }
// }