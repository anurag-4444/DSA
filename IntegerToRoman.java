package Leetcode_Interview_Questions;

public class IntegerToRoman {
    class Solution {
        public String intToRoman(int num) {
            int[] values = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
            String[] strs = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
            String sum = "";
            for (int i = values.length - 1; i >= 0; i--) {
                int count = num / values[i];
                sum += strs[i].repeat(count);
                num = num % values[i];
            }
            return sum;
        }
    }
}
