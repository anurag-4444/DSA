package Leetcode_Interview_Questions;

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        
        int idx = 1;
        for(int curr = 1; curr < nums.length; curr++){
            if(nums[curr - 1] != nums[curr]){
                nums[idx++] = nums[curr];
            }
        }
        return idx;
    }
}
