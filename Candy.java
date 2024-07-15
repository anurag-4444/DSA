package Leetcode_Interview_Questions;

import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int sum = 0;
        int len = ratings.length;
        int[] arr = new int[len];
        Arrays.fill(arr, 0, len, 1);
        for(int i = 1; i < len; i++){
            if(ratings[i - 1] < ratings[i]){
                arr[i] = arr[i - 1] + 1;
            } 
        }
        for(int i = len - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }
        sum = Arrays.stream(arr).sum();
        return sum;
    }
}
