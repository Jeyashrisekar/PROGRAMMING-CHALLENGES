class Solution {
    public int findTheWinner(int n, int k) {
        
        int i = win(n, k);
        return i + 1;

    }
    public int win(int n, int k){
        if(n == 1) return 0;
        return (win(n-1, k)+k) % n;
    }
}