class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int max = Integer.MIN_VALUE;
        for(int i : piles) if(i > max) max = i;
        int l = 1;
        int h = max;
        int ans = -1;
        while(l <= h){
            int mid = (l+h)/2;
            if(canEatAllBanana(mid, piles, H)){
                ans = mid;
                h = mid -1;
            }
            else{
                l = mid +1;
            }
        }
        return ans;
    }
    public boolean canEatAllBanana(int mid, int[] piles, int maxHours){
        int hoursneeded = 0;
        for(int i = 0; i < piles.length; i++){
            hoursneeded += Math.ceil((double) piles[i]/mid);
        }
        return hoursneeded <= maxHours;
    }
}