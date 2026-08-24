class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            //For the character extraction: "First, I extract the character at the current index i for both strings, s and t."
            char countS = s.charAt(i);
            char countT = t.charAt(i);
            //For the s string logic: "Then, I update my frequency map. For string s, I add the character to the map and increment its frequency by 1. The getOrDefault method ensures that if it's the first time seeing this character, we start at 0 before adding 1."
            count.put(countS, count.getOrDefault(countS, 0) + 1);
            //For the t string logic: "Conversely, for string t, I take that character and decrement its frequency in the same map. This acts as a counterbalance."
            count.put(countT, count.getOrDefault(countT, 0) - 1);
        }
        for( int j: count.values()) {
            if( j != 0) {
                return false;
            }
        }
          return true;  
        }
    }
