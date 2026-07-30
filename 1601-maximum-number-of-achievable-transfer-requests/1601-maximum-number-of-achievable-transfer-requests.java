class Solution {
    static int ans = 0;
    public int maximumRequests(int n, int[][] requests) {
        ans = 0;
        int[] b = new int[n];
        maxrequest(0, 0, b, requests);
        return ans;
    }
    public static void maxrequest(int i , int count, int[]b, int[][] request){
        //base case
        if(i == request.length) {
            for(int y : b){
                if( y != 0) return;
            }
            ans = Math.max(ans, count);
            return;
        }
        //pick 
        int from = request[i][0];
        int to = request[i][1];
        b[from]--;
        b[to]++;
        maxrequest(i+1, count+1, b, request);
        //backtrack
        b[from]++;
        b[to]--;

        maxrequest(i + 1, count,b, request);

    }
}