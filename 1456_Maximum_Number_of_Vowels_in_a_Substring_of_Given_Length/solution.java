// Ebaad Awan
// August 11, 2025

class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0;

        for(int i = 0; i < k; i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count += 1;
            }
        }

        int maxCount = count;

        int j = k;

        for(int i = k; i < s.length(); i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count += 1;
            }
            if(vowels.indexOf(s.charAt(i - k)) != -1){
                count -= 1;
            }
            if(count > maxCount){
                maxCount = count;
                if(maxCount == k){
                    return maxCount;
                }
            }
        }

        return maxCount;
    }
}