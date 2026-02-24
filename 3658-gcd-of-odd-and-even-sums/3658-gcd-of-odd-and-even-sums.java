class Solution {
    public int gcdOfOddEvenSums(int n) {
        int x = n * (n+1);
        int y = n * n;
        while(y != 0){
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }
}