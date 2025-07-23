// Ebaad Awan
// July 23, 2025

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < first){
                first = nums[i];
            }

            if(nums[i] < second && nums[i] > first){
                second = nums[i];
            }

            if(first < second && second < nums[i]){
                return true;
            }
        }

        return false;
    }
}
