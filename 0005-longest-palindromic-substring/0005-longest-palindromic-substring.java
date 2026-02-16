class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 1;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j <= 1; j++){
                int low = i;
                int high = i+j;
                while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)){
                    int curend = high - low +1;
                    if(curend > end){
                        start = low;
                        end = curend;
                    }
                    low--;
                    high++;
                }
            }

        }
        return s.substring(start, start + end);
    }
}