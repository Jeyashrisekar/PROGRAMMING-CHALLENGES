class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        
        int sum = 0;
        for(int i : nums){
            if(i <= 9) sum += i;
            else{
                int x = i;
                int max = 0;
                while(x > 0){
                     max = Math.max(max, x % 10);
                     x /= 10;
                }
                int r = 0;
                int mul = 1;
                while (i > 0) {
                r += max * mul;
                mul *= 10;
                i/= 10;
                }
                sum += r;
            }
        }
        return sum;

    }
}