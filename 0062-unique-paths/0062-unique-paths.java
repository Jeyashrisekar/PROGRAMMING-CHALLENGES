class Solution {
    public int uniquePaths(int m, int n) {
        //memoization
        int[][] dp = new int[m][n];
        for(int[] r : dp){
            Arrays.fill(r, -1);
           
        }
         return paths(m-1, n-1, dp);
        
    
    }
    public int paths(int i, int j, int[][] dp){
        if(i < 0 || j < 0) return 0;
        if(i == 0 && j == 0) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int l = paths(i, j -1, dp);
        int u = paths(i-1, j, dp);
        dp[i][j] = l + u;
        return dp[i][j];
    }
}
// public int paths(int i, int j){  ----> i= m-1, j = n-1
//         if(i < 0 || j < 0) return 0;
//         if(i == 0  && j == 0) return 1;
//         int l = paths(i, j -1);
//         int u = paths(i-1, j);
//         return l+u;
//}