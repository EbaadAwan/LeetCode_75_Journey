// Ebaad Awan
// August 24, 2025

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurences = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            occurences.putIfAbsent(arr[i], 1);
            occurences.put(arr[i], occurences.get(arr[i]) + 1);
        }

        ArrayList<Integer> values = new ArrayList<>(occurences.values());
        Collections.sort(values);

        for(int i : values){
            if(Collections.frequency(values, i) > 1){
                return false;
            }
        }

        return true;
    }
}