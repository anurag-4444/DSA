package Leetcode_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            int t = -nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while(i < nums.length - 2 && nums[i] == nums[i + 1]) i++;
            while(l < r){
                int sum = nums[l] + nums[r];
                if(sum > t) r--;
                else if(sum < t) l++;
                else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l] == nums[l + 1]) l++;
                    while(l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}
