package Leetcode_Interview_Questions;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int res = points.length;
        int[] prev = points[0];
        for(int i = 1; i < points.length; i++){
            int[] curr = points[i];
            if(curr[0] <= prev[1]){
                res--;
                prev[0] = curr[0];
                prev[1] = Math.min(curr[1], prev[1]);
            } else prev = curr;
        }
        return res;
    }
}
