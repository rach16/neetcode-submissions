class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> count = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char countS = s.charAt(i);
            char countT = t.charAt(i);

            count.put(countS, count.getOrDefault(countS, 0) + 1);
            count.put(countT, count.getOrDefault(countT, 0) - 1); 
        }
            for(int j: count.values()) {
                if(j != 0) {
                    return false;
                }
            }
                return true;
        
    }
}
