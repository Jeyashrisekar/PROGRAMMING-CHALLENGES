class Solution {
    public boolean checkDivisibility(int n) {

        int x = n; 
        int sum = 0;
        int product = 1;

        while(n > 0){
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        //if (sum == 0 || product == 0) return false;
        if(x % (sum + product) == 0) return true;
        else return false;
    }
}