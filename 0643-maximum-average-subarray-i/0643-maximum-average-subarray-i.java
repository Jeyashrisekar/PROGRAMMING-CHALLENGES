class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int msum = Integer.MIN_VALUE;
        int wsum = 0;
        for(int i = 0; i < k; i++){
            wsum += nums[i];

        }
        msum = wsum;
        for(int j = k; j < nums.length; j++){
            wsum += nums[j];
            wsum -= nums[j-k];
            msum = Math.max(msum, wsum);
        }
        return (double) msum/k;
    }
}