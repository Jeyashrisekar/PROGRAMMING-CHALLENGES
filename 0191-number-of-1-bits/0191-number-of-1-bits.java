class Solution {
    public int hammingWeight(int n) {
        //Approach1:
            // int count = 0;
            // while (n != 0) {
            //     n = n & (n - 1);
            //     count++;
            // }
            // return count;
        //Approach2: 
            // int c = 0;
            // for(int i = 0; i < 32; i++){
            //     if((n & (1 << i)) != 0) c++;
            // }
            // return c;
        //Approach 3:
            int c = 0;
            while(n!= 0){
                c = c + n % 2;
                n/=2;
            }
            return c;
    }
}