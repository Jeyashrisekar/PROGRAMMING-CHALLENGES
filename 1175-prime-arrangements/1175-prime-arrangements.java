class Solution {
    static final int MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        boolean[] x = new boolean[n+1];
        Arrays.fill(x, true);
        if (n < 2) return 1;
        x[0] = false;
        x[1] = false;
         for (int i = 2; i * i <= n; i++) {
            if (x[i]) {
                for (int j = i * i; j <= n; j += i) {
                    x[j] = false;   
                }
            }
        }
        int c = 0;
        for (int i = 2; i <= n; i++){
            if(x[i]) c++;
        }
        
        long res =  (fact(c) * fact(n-c)) % MOD;
        return (int) res;
    }
    long fact(int x){
        long res = 1;

        for (int i = 1; i <= x; i++) {
            res = (res * i) % MOD; 
        }

        return res;

    }
   

}