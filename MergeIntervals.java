package Leetcode_Interview_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int[] ele = intervals[i];
            int[] last = res.get(res.size() - 1);
            if(ele[0] <= last[1]){
                last[1] = Math.max(last[1], ele[1]);
                res.set(res.size() - 1, last);
            } else res.add(ele);
        }
        return res.toArray(new int[res.size()][]);
    }
}
