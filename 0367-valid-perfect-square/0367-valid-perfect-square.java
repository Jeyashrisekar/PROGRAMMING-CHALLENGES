class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        if(n % 1 == 0) return true;
        else return false;
    }
}