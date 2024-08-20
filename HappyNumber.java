package Leetcode_Interview_Questions;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visit = new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n = sumOfSquares(n);
            if(n == 1) return true;
        }
        return false;
    }
    
    public int sumOfSquares(int n){
        int sq = 0;
        while(n != 0){
            int a = n % 10;
            sq += (a*a);
            n = n/10;
        }
        return sq;
    }
}
