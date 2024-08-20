package Leetcode_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int val = target - nums[i];
            if(prevMap.containsKey(val)){
                res[0] = i;
                res[1] = prevMap.get(val);
            }
            prevMap.put(nums[i], i);
        }
        return res;
    }
}
