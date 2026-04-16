class Solution {
    public int maxProfit(int[] price) {
        int curbuy = -price[0];
        int prevbuy = curbuy;
        int cursell = 0;
        int prevsell  = 0;
        int prev2sell = 0;
        for(int i = 0; i < price.length; i++){
            curbuy = Math.max(prevbuy, prev2sell - price[i]);
            cursell = Math.max(prevsell, prevbuy + price[i]);
            prevbuy = curbuy;
            prev2sell = prevsell;
            prevsell = cursell;
        }
        return cursell;
    }
}