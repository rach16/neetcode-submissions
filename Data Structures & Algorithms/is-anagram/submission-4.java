class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);  // Fixed: was s.charAt(i)
            
            map.put(charS, map.getOrDefault(charS, 0) + 1);  // Fixed typo
            map.put(charT, map.getOrDefault(charT, 0) - 1);   // Fixed typo
        }
        
        // Check after the loop, not inside it
        for (int count : map.values()) {  // Fixed: values() not value()
            if (count != 0) {
                return false;
            }
        }
        
        return true;  // Fixed: was returning false
    }
}