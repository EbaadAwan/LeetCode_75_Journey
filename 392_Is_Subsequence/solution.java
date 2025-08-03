// Ebaad Awan
// August 3, 2025

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        while(j < tArray.length && i < sArray.length){
            if(sArray[i] == tArray[j]){
                i += 1;
                j += 1;
            }
            else{
                j += 1;
            }
        }

        if(i == sArray.length){
            return true;
        }

        return false;
    }
}