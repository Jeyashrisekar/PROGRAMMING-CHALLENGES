class Solution {
    public int arrangeCoins(int n) {
        int x = n * (n + 1)/2;
        long l = 1;
        long h = n;
        long ans = 0;
        while(l <= h){
            long mid = (l + h)/2;
            long reqcoins = mid * (mid + 1)/2;
            if(  reqcoins <= n){
                ans = Math.max(ans, mid);
                l = mid + 1;
            }
            else h = mid - 1;
        }
        return (int) ans;
    }
}