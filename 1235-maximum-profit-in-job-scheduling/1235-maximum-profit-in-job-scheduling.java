class Solution {
    static int[][]arr;
    static int []dp;
    static int n ;
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
         n=profit.length;
           arr=new int[n][3];
           for(int i=0;i<n;i++){
            arr[i][0]=startTime[i];
            arr[i][1]=endTime[i];
            arr[i][2]=profit[i];
           }
           dp=new int[n+1];
           Arrays.fill(dp,-1);
           Arrays.sort(arr,(a,b)->a[0]-b[0]);
           return solve(0);

    }
    public int solve(int i){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int next=getNextIndex(i+1,arr[i][1]);
            int take=arr[i][2]+solve(next);
            int nottake=solve(i+1);
        return dp[i]=Math.max(take,nottake);
    }
    public int getNextIndex(int lo,int currentjobend){
        int high=n;
       
        while(lo<high){
             int mid=lo+(high-lo)/2;
            if(arr[mid][0]>=currentjobend){
                high=mid;
            }
            else{
                lo=mid+1;
            }
            
        }
        return lo;
    }
}