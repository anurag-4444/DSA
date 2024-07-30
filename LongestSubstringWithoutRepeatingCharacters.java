package Leetcode_Interview_Questions;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, l = 0;
        Set<Character> set = new HashSet<>();
        
        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(set.size(), res);
        }
        return res;
    }
}
