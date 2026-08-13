class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int max = Integer.MIN_VALUE;
        for(int i : time){
            if(i > max) max = i;
        }
        long l = 1;
        long h = (long) max * totalTrips;
        long ans = 0;
        while(l <= h){
            long mid = (l+ h)/2;
            if(ispossible(mid, time, totalTrips)){
                ans = mid;
                h = mid - 1;

            }
            else{
                l = mid + 1;

            }
        }
        return ans;
    }
    public boolean ispossible(long mid, int[] time, int totalTrips){
        long trips = 0;

        for(int i = 0; i < time.length; i++){
            trips += mid/time[i];
        }
        return trips >= totalTrips;
    }
}