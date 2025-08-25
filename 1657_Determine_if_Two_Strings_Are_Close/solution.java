// Ebaad Awan
// August 25, 2025

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < word1.length(); i++){
            map1.putIfAbsent(word1.charAt(i), 0);
            map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
        }

        for(int i = 0; i < word2.length(); i++){
            map2.putIfAbsent(word2.charAt(i), 0);
            map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
        }

        if(map1.equals(map2)){
            return true;
        }

        ArrayList<Character> map1_key = new ArrayList<>(map1.keySet());
        ArrayList<Integer> map1_value = new ArrayList<>(map1.values());
        ArrayList<Character> map2_key = new ArrayList<>(map2.keySet());
        ArrayList<Integer> map2_value = new ArrayList<>(map2.values());
        
        Collections.sort(map1_key);
        Collections.sort(map1_value);
        Collections.sort(map2_key);
        Collections.sort(map2_value);

        if(map1_key.equals(map2_key) && map1_value.equals(map2_value)){
            return true;
        }

        return false;
    }
}