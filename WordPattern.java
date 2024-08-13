package Leetcode_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if (pattern.length() != strArr.length) {
            return false;  // Check if lengths are different
        }
        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new HashMap<>();

        for(int i = 0; i < strArr.length; i++){
            char cr = pattern.charAt(i);
            String str = strArr[i];
            if((mapPS.containsKey(cr) && !mapPS.get(cr).equals(str)) ||
                mapSP.containsKey(str) && mapSP.get(str) != cr)
                return false;
            mapPS.put(cr, str);
            mapSP.put(str, cr);
        }
        return true;
    }
}
