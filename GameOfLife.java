package Leetcode_Interview_Questions;

class Solution {
    public void gameOfLife(int[][] board) {
        // Original | New | State
        //    0     |  0  |   0
        //    1     |  0  |   1
        //    0     |  1  |   2
        //    1     |  1  |   3
        int r = board.length;
        int c = board[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                int nei = countLiveCells(i, j, board);
                if(board[i][j] == 1){
                    if(nei == 2 || nei == 3) board[i][j] = 3;
                } else {
                    if(nei == 3) board[i][j] = 2;
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(board[i][j] == 1) 
                    board[i][j] = 0;
                else if(board[i][j] == 2 || board[i][j] == 3) 
                    board[i][j] = 1;
            }
        }

    }

    public int countLiveCells(int r, int c, int[][] board){
        int nei = 0;
        int row = board.length;
        int col = board[0].length;

        for(int i = r - 1; i < r + 2; i++){
            for(int j = c - 1; j < c + 2; j++){
                if((i == r && j == c) || i < 0 || j < 0 || i == row || j == col) continue;
                if(board[i][j] == 1 || board[i][j] == 3) nei++;
            }
        }
        return nei;
    }
}
