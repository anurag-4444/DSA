package Leetcode_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(res.containsKey(nums[i])){
                if(Math.abs(res.get(nums[i]) - i) <= k) return true;
            }
            res.put(nums[i], i);
        }
        return false;
    }
}
