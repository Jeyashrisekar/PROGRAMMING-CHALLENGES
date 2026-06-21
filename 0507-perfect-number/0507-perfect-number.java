class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) return false;
        int s = 1;
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                s += i + num /i;
            }
        }
        //sum++;
        return s == num;
    }
}