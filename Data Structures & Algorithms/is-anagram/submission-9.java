class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();


        for(int i = 0 ;i<s.length(); i++) {
            char countS = s.charAt(i);
            char countT = t.charAt(i);
            map.put(countS, map.getOrDefault(countS, 0) +1);
            map.put(countT, map.getOrDefault(countT,0) -1);
        }
            for(int j : map.values()) {
                if(j != 0) {
                    return false;
                }
            }
        
        return true;
            
        }
    }
