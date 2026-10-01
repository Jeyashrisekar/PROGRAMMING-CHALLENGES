class Solution {
    public int singleNumber(int[] nums) {
        // int ans = 0;
        // int twos = 0;
        // for(int i : nums) {
        //     ans ^= (i & ~twos);
        //     twos ^= (i & ~ans);
        // }
        // return ans;
        int res = 0;
        for(int i = 0; i < 32; i++){
            int count0 = 0;
            int count1 = 0;
            for(int val : nums){
                if((val & (1 << i)) != 0){
                    count1 ++;

                }
                else count0++;

            }
            if(count1 % 3 != 0) res = res |(1<<i);
        }
        return res;
    }
}