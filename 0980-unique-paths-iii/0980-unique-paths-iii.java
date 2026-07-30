class Solution {
    
    public int uniquePathsIII(int[][] grid) {
        int r = 0, c = 0;
        int z = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    z++;
                }
                else if(grid[i][j] == 1){
                   r = i;
                   c = j;
                }
            }
        }
        return backtrack(r, c, z, grid);
    }
    public int backtrack(int r, int c, int z, int[][] g){
        if(r < 0 || c  < 0 || r == g.length || c == g[0].length || g[r][c]==-1) return 0;
        if(g[r][c] == 2){
            if(z == -1) return 1;
            else return 0;
        }
        g[r][c] = -1;
        z--;
        int a = backtrack(r-1, c, z, g);//up
        int b = backtrack(r, c+1, z, g);//right
        int e = backtrack(r+1, c, z, g);//down
        int d = backtrack(r, c-1, z, g);//left
        g[r][c] = 0;
        z++;
        return a+b+e+d;
    }
}