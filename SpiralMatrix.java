package Leetcode_Interview_Questions;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        
        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++) ans.add(matrix[top][i]);
            top++;
            if (top > bottom) break;
            for(int i = top; i <= bottom; i++) ans.add(matrix[i][right]);
            right--;
            if (left > right) break;

            for(int i = right; i >= left; i--) ans.add(matrix[bottom][i]);
            bottom--;

            for(int i = bottom; i >= top; i--) ans.add(matrix[i][left]);
            left++;
        }
        return ans;
    }
}
