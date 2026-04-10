class Solution {
    public int minDeletionSize(String[] str) {
        int n = str[0].length();
        int m = str.length;
        int d = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                 if(str[j].charAt(i) < str[j-1].charAt(i)){
                    d++;
                    break;
                } 
            }
        }
        return d;
    }
}