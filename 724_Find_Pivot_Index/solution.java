// Ebaad Awan
// August 21, 2025

class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        int sumL = 0;
        int sumR = 0;

        for(int i = 0; i < nums.length; i++){
            sumLeft[i] = sumL;
            sumL += nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--){
            sumRight[i] = sumR;
            sumR += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(sumLeft[i] == sumRight[i]){
                return i;
            }
        }

        return -1;
    }
}