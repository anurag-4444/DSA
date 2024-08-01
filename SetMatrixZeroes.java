package Leetcode_Interview_Questions;

class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length - 1;
        int c = matrix[0].length - 1;
        boolean rowZero = false;
        boolean colZero = false;
        for(int i = 0; i <= r; i++){
            for(int j = 0; j <= c; j++){
                if(matrix[i][j] == 0){
                    if(i == 0) rowZero = true;
                    if(j == 0) colZero = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }

        if(rowZero){
            for(int i = 0; i <= c; i++) matrix[0][i] = 0;
        }

        if(colZero){
            for(int i = 0; i <= r; i++) matrix[i][0] = 0;
        }
    }
}
