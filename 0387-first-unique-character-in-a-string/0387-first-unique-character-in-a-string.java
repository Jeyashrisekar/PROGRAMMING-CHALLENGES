class Solution {
    public int firstUniqChar(String s) {
        int[] f = new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
        {
         int idx = s.charAt(i) - 'a';
         f[idx]++;   
            
        }
        }
        for(int i = 0; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            if(f[idx] == 1)
            return i;
            
        }
        return -1;     
       
    }
}