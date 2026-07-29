class Solution {
    public boolean exist(char[][] board, String word) {
        for(int  i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(i, j, 0, board, word)==true) return true;
                }
            }
        }
        return false;
    }
    public boolean search(int r, int c , int k , char[][] b, String w){
            if(k == w.length()) return true;
            if(r < 0 || c < 0 || c == b[0].length || r == b.length || b[r][c] != w.charAt(k)) return false;
            char ch = b[r][c];
            b[r][c] = '*';
            boolean up = search(r-1, c, k + 1, b,w);
            boolean right = search(r, c+1, k+1 ,b, w);
            boolean down = search(r+1, c, k+1, b, w);
            boolean left = search(r, c-1, k+1, b, w);
            b[r][c] = ch;
            return up||right || down || left;




    }
}