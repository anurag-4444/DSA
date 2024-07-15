package Leetcode_Interview_Questions;

import java.util.Arrays;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() >= Arrays.stream(cost).sum()) {
            int start = 0, total = 0;
            for (int i = 0; i < gas.length; i++) {
                total += (gas[i] - cost[i]);
                if (total < 0) {
                    total = 0;
                    start = i + 1;
                }
            }
            return start;
        }
        return -1;
    }
}
