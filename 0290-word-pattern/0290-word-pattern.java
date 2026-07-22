class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.trim().split(" ");
        HashMap<Character, String> map = new HashMap<>();
        
        if (pattern.length() != s1.length) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
           char cur = pattern.charAt(i); 
            
            if (map.containsKey(cur)) {
                if (!map.get(cur).equals(s1[i])) return false;
            }
            else {
                if (map.containsValue(s1[i])) return false;
                map.put(cur, s1[i]);
            }
        }
        return true;
    }
}