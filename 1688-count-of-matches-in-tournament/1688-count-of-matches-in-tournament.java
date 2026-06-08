class Solution {
    public int numberOfMatches(int n) {
        int m = 0;
        int t = 1;
        if(n <= 1) return 0;
        while(n > 2){
        if(n % 2 == 0){
            m = (n-1)/2;
        } 
        else m = n/2;
        n = n - m;
        t += m;
        }
        return t;
    }
}