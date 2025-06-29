// Ebaad Awan
// June 29, 2025

class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> v = new ArrayList<Character>();
        String vowel = "aeiouAEIOU";
        StringBuilder word = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(vowel.indexOf(s.charAt(i)) != -1){
                v.add(s.charAt(i));
            }
        }

        int j = v.size() - 1;

        for(int i = 0; i < s.length(); i++){
            if(vowel.indexOf(s.charAt(i)) != -1){
                word.append(v.remove(j));
                j -= 1;
            }
            else{
                word.append(s.charAt(i));
            }
        }

        return word.toString();
    }
}