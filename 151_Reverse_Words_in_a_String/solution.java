// Ebaad Awan
// July 3, 2025

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int i = 0;
        int j = words.length - 1;
        String temp;

        while(j > i){
            temp = words[i];
            words[i] = words[j];
            words[j] = temp;

            i++;
            j--;
        }

        String result = String.join(" ", words);

        return result;
    }
}