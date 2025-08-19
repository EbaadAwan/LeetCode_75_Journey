// Ebaad Awan
// August 19, 2025

class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        int count = 0;
        int zero = 0;

        while(right < nums.length){
            if(nums[right] == 1){
                count += 1;
                right += 1;
            }
            else if(nums[right] == 0){
                zero += 1;
                count += 1;
                right += 1;
            }

            if(zero <= 1){
                if(count > max){
                    max = count;
                }
            }
            else if(zero > 1){
                while(zero > 1 && left < nums.length){
                    if(nums[left] == 1){
                        count -= 1;
                    }
                    else if(nums[left] == 0){
                        zero -= 1;
                        count -= 1;
                    }
                    left += 1;
                }
            }
        }
        return max - 1;
    }
}
