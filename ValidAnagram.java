package Leetcode_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()) return false;
      Map<Character, Integer> countS = new HashMap<>();  
      Map<Character, Integer> countT = new HashMap<>();  
      for(int i = 0; i < s.length(); i++){
        char s1 = s.charAt(i);
        char t1 = t.charAt(i);
        countS.put(s1, countS.getOrDefault(s1, 0) + 1);
        countT.put(t1, countT.getOrDefault(t1, 0) + 1);
      }
      return countS.equals(countT);
    }
}
