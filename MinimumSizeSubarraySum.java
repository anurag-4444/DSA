package Leetcode_Interview_Questions;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, total = 0;
        int res = nums.length + 1;
        for(int r = 0; r < nums.length; r++){
            total += nums[r];
            while(total >= target){
                res = Math.min(r - l + 1, res);
                total -= nums[l];
                l++;
            }
        }
        return (res == nums.length + 1) ? 0 : res;
    }
}
