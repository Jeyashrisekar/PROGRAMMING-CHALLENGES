class Solution {
    public int minOperations(int[] nums, int k) {
        int curxor = 0;
        for(int i : nums){
            curxor ^= i;
            
        }
        int n = curxor ^ k;
        int c = 0;
        while(n != 0){
            n = n & (n-1);
            c++;
        }
        return c;
    }
}