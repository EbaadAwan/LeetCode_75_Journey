// Ebaad Awan
// August 7, 2025

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        double average;
        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        average = sum / k;

        if(average > maxAverage){
            maxAverage = average;
        }

        for(int i = 1; i <= nums.length - k; i++){
            sum = sum - nums[i - 1];
            sum = sum + nums[i + k - 1];

            average = sum / k;
            
            if(average > maxAverage){
                maxAverage = average;
            }
        }

        return maxAverage;
    }
}