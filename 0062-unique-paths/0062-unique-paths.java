class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        int res = count(0, 0, m, n);
        return res;

    }
    static int count(int i , int j, int m, int n){
        if(i >= m || j >= n) return 0;
        if(i == m -1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = count(i+1, j, m, n)+count(i, j+1, m, n);
        return dp[i][j];
    }
}