// Ebaad Awan
// August 2, 2025

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int temp;
        int zeroCount = 0;

        for(int k = 0; k < nums.length; k++){
            if(nums[k] == 0){
                zeroCount += 1;
            }
            if(k == nums.length - 1 && zeroCount == 0){
                return;
            }
        }
        
        while(i < nums.length - zeroCount){

            while(j < nums.length && nums[j] == 0){
                j++;
            }

            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;

            i++;
            j++;
        }
    }
}