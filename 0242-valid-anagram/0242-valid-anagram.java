class Solution {
    public boolean isAnagram(String s, String t) {
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();
        if(s.length() != t.length()) return false;

        Arrays.sort(x);
        Arrays.sort(y);
        
        if(Arrays.equals(x,y)) return true;
        return false;
    }
}