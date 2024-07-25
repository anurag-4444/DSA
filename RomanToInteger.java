package Leetcode_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    class Solution {
        public int romanToInt(String s) {
            int len = s.length();
            int val = 0;
            Map<Character, Integer> obj = new HashMap<>();
            obj.put('I', 1);
            obj.put('V', 5);
            obj.put('X', 10);
            obj.put('L', 50);
            obj.put('C', 100);
            obj.put('D', 500);
            obj.put('M', 1000);
            for (int i = 0; i < len - 1; i++) {
                if (obj.get(s.charAt(i)) < obj.get(s.charAt(i + 1))) {
                    val -= obj.get(s.charAt(i));
                } else {
                    val += obj.get(s.charAt(i));
                }
            }
            val += obj.get(s.charAt(len - 1));
            return val;

        }
    }
}
