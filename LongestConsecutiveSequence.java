package Leetcode_Interview_Questions;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int ele: nums) res.add(ele);
        int max = 0;
        for(Integer ele: res){
            if(!res.contains(ele - 1)){
                int longest = 0;
                while(res.contains(ele + longest)) longest++;
                max = Math.max(max, longest);
            }
        }
        return max;

    }
}
