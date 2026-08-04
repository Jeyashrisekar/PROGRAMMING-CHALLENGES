class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1]* nums[i];
        }
        int product = 1;
        //int totalp = prefix[n-1];
        for(int i = n-1; i >= 0; i--){
            int leftp = (i== 0)?1:prefix[i-1];
            int rightp = product;
            prefix[i] = leftp * rightp;
            product = rightp * nums[i];
            
                
            
        }
        return prefix;
    }
}