// Ebaad Awan
// August 5, 2025

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area;
        int length;
        int h;
        int i = 0;
        int j = height.length - 1;


        while(i < j){
            length = j - i;
            h = Math.min(height[i], height[j]);

            area = length * h;

            if(area > maxArea){
                maxArea = area;
            }

            if(height[i] > height[j]){
                j -= 1;
            }
            else{
                i += 1;
            }
        }

        return maxArea;
    }
}