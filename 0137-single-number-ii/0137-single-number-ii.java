class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int twos = 0;
        for(int i : nums) {
            ans ^= (i & ~twos);
            twos ^= (i & ~ans);
        }
        return ans;
    }
}