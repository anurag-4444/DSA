package Leetcode_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        int[] count = new int[26];
        for(String s: strs){
            Arrays.fill(count, 0);
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!res.containsKey(key)) res.put(key, new ArrayList<>());
            res.get(key).add(s);
        } 
        return new ArrayList<>(res.values());
    }
}
