package Leetcode_Interview_Questions;

class Solution {
    public int trap(int[] height) {
        int count = 0;
        int len = height.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int maxL = height[0];
        for(int i = 0; i < len; i++){
            maxL = Math.max(maxL, height[i]);
            leftMax[i] = maxL;
        }
        int maxR = height[len - 1];
        for(int i = len - 1; i >= 0; i--){
            maxR = Math.max(maxR, height[i]);
            rightMax[i] = maxR;
        }
        for(int i = 0; i < len; i++){
            count += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }
        return count;
    }
}
