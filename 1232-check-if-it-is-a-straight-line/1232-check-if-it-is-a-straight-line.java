class Solution {
    public boolean checkStraightLine(int[][] p) {
        int x1 = p[0][0] , y1 = p[0][1];
        int x2 = p[1][0], y2 = p[1][1];
        for(int i = 2; i < p.length; i++){
            int x = p[i][0];
            int y = p[i][1];
            if(((y2 - y1)*(x - x2)) != ((y - y2)*(x2 - x1))) return false;

        }
        return true;
    }
}