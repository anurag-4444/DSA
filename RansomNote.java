package Leetcode_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> countFreq = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            countFreq.put(ch, countFreq.getOrDefault(ch, 0) + 1);
        }
        for(char ch: ransomNote.toCharArray()){
            if (countFreq.getOrDefault(ch, 0) < 1) return false;
            countFreq.put(ch, countFreq.get(ch) - 1);
        }
        return true;
    }
}
