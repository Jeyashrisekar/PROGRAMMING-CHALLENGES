class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return count(0, 0 , target, nums);
    }
    public int count(int i , int cur, int t , int[] a){
        if(i == a.length) return (cur == t)?1:0;

        int p = count(i + 1, cur+ a[i], t, a);
        int m = count(i+1, cur - a[i], t, a);
        return p+m;
    }
}