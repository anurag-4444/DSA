package Leetcode_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        int j = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - 1 != nums[i - 1]){
                if(j != i - 1) res.add(nums[j] + "->" + nums[i - 1]); 
                else res.add(nums[j] + "");
               j = i;
            }
        }
        if(j == nums.length - 1) res.add(nums[j] + "");
        else res.add(nums[j] + "->" + nums[nums.length - 1]);
        return res;
    }
}