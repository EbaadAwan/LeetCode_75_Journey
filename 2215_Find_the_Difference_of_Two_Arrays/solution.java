// Ebaad Awan
// August 23, 2025

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            set1.putIfAbsent(nums1[i], i);
        }

        for(int i = 0; i < nums2.length; i++){
            set2.putIfAbsent(nums2[i], i);
        }

        for(int i : set1.keySet()){
            if(!set2.containsKey(i)){
                array1.add(i);
            }
        }

        for(int i : set2.keySet()){
            if(!set1.containsKey(i)){
                array2.add(i);
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(array1);
        result.add(array2);

        return result;
    }
}