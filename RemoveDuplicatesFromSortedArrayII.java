package Leetcode_Interview_Questions;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int idx = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] == nums[i] && count < 2){
                nums[idx++] = nums[i];
                count++; 
            } else if(nums[i - 1] != nums[i]){
                nums[idx++] = nums[i];
                count = 1;
            }
        }
        return idx;
    }
}
