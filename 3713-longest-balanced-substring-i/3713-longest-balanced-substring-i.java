class Solution {
    public int longestBalanced(String s) {
        
        int l = 0;
        
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                freq[s.charAt(j) - 'a']++;
                if(isBalanced(freq)) l = Math.max(l, j - i+1);

            }
        }
        return l;
    }
    boolean isBalanced(int[] freq){
        int c = 0;
        for(int f : freq){
            if(f!= 0){
                if(c == 0) c = f;
                else if(c!= f) return false;
            }
        }
        return c!=0;
    }
}