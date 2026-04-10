class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int dest) {
        if(start > dest){
            int t = start;
            start = dest;
            dest = t;

        }
        int total = 0;
        int x = 0;
        for(int i = 0; i < distance.length; i++){
            total += distance[i];
        }
        for(int i = start; i< dest; i ++){
            x += distance[i];
        }
        return Math.min(x , total-x);
    }
}