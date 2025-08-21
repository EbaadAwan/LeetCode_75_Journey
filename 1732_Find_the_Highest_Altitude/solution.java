// Ebaad Awan
// August 20, 2025

class Solution {
    public int largestAltitude(int[] gain) {
        int sum = gain[0];

        for(int i = 1; i < gain.length; i++){
            sum += gain[i];
            gain[i] = sum;
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < gain.length; i++){
            if(gain[i] > max){
                max = gain[i];
            }
        }

        if(0 > max){
            return 0;
        }

        return max;
    }
}