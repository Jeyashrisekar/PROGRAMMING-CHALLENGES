class Solution {
    int min = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int[] c = new int[k];
        distribute(0, c, cookies, k);
        return min;
    }
    public void distribute(int i , int[] c, int[] cookies, int k){
        if(i == cookies.length)
        {
            int max = Integer.MIN_VALUE;
            for(int x : c){
                max = Math.max(max, x);
            }
            min = Math.min(min, max);
            return;
        }
        int y = cookies[i];
        for(int j = 0; j < k; j++){
            c[j] +=y;
            distribute(i+1, c, cookies, k);
            c[j]-=y;
        }

    }
}