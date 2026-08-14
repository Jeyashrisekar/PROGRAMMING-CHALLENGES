class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int t = 0;
        int max = Integer.MIN_VALUE;
        for(int i : quantities){
           if(max < i) max = i;
        }
        int low = 1;
        int high = max;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(isItpossible(mid, quantities, n)){
                ans = mid;
                high = mid -1;
            }
            else low = mid +1;

        }
        return ans;

    }
    public boolean isItpossible(int mid, int[] quantities, int totalstores){
        int storesneeded = 0;
        for(int i = 0; i < quantities.length; i++){
            storesneeded +=  Math.ceil((double) quantities[i]/mid);
        }
        return (storesneeded <= totalstores);

    }
}