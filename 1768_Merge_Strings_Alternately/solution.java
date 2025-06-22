// Ebaad Awan
// June 22, 2025

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0; 
        int j = 0;

        StringBuilder word = new StringBuilder();

        if(word1.length() == word2.length()){
            while(i < word1.length() && j < word2.length()){
                word.append(word1.charAt(i));
                i++;
                word.append(word2.charAt(j));
                j++; 
            }
        }

        if(word1.length() < word2.length()){
            while(i < word1.length()){
                word.append(word1.charAt(i));
                i++;
                word.append(word2.charAt(j));
                j++;
            }
            while(j < word2.length()){
                word.append(word2.charAt(j));
                j++;
            }
        }

        if(word1.length() > word2.length()){
            while(j < word2.length()){
                word.append(word1.charAt(i));
                i++;
                word.append(word2.charAt(j));
                j++;
            }
            while(i < word1.length()){
                word.append(word1.charAt(i));
                i++;
            }
        }

        String result = word.toString();

        return result;
    }
}